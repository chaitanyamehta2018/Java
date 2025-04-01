package com.ats.beginners.RealWorld;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
import java.io.*;

public class LibraryDataEntryGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Data Entry");
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JTextField bookNameField = new JTextField(20);
        JTextField isbnField = new JTextField(20);
        JTextField issueDateField = new JTextField(20);
        JTextField returnDateField = new JTextField(20);
        JButton saveButton = new JButton("Save Data");
        JButton clearButton = new JButton("Clear All Data");
        
        panel.add(createLabeledField("Book Name:", bookNameField));
        panel.add(createLabeledField("ISBN:", isbnField));
        panel.add(createLabeledField("Date of Issue:", issueDateField));
        panel.add(createLabeledField("Date of Return:", returnDateField));
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        saveButton.addActionListener(e -> saveDataToExcel(bookNameField.getText(), isbnField.getText(), issueDateField.getText(), returnDateField.getText()));
        clearButton.addActionListener(e -> clearExcelData());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static JPanel createLabeledField(String label, JTextField textField) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel jLabel = new JLabel(label);
        jLabel.setPreferredSize(new Dimension(120, 30));
        panel.add(jLabel);
        panel.add(textField);
        return panel;
    }

    private static void saveDataToExcel(String bookName, String isbn, String issueDate, String returnDate) {
        try (FileInputStream fis = new FileInputStream("BookLibraryData.xls")) {
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            int lastRow = sheet.getLastRowNum();
            HSSFRow row = sheet.createRow(lastRow + 1);

            row.createCell(0).setCellValue(lastRow + 1);
            row.createCell(1).setCellValue(bookName);
            row.createCell(2).setCellValue(isbn);
            row.createCell(3).setCellValue(issueDate);
            row.createCell(4).setCellValue(returnDate);

            try (FileOutputStream fos = new FileOutputStream("BookLibraryData.xls")) {
                workbook.write(fos);
            }
        } catch (FileNotFoundException e) {
            createNewExcelFile(bookName, isbn, issueDate, returnDate);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearExcelData() {
        try (FileInputStream fis = new FileInputStream("BookLibraryData.xls")) {
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            int lastRow = sheet.getLastRowNum();
            
            // Remove all rows except the header
            for (int i = lastRow; i > 0; i--) {
                sheet.removeRow(sheet.getRow(i));
            }

            try (FileOutputStream fos = new FileOutputStream("BookLibraryData.xls")) {
                workbook.write(fos);
            }
            JOptionPane.showMessageDialog(null, "All data cleared except the header.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error clearing data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void createNewExcelFile(String bookName, String isbn, String issueDate, String returnDate) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Library Data");

        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("Sr. No.");
        header.createCell(1).setCellValue("Book Name");
        header.createCell(2).setCellValue("ISBN");
        header.createCell(3).setCellValue("Date of Issue");
        header.createCell(4).setCellValue("Date of Return");

        HSSFRow row = sheet.createRow(1);
        row.createCell(0).setCellValue(1);
        row.createCell(1).setCellValue(bookName);
        row.createCell(2).setCellValue(isbn);
        row.createCell(3).setCellValue(issueDate);
        row.createCell(4).setCellValue(returnDate);

        try (FileOutputStream fos = new FileOutputStream("BookLibraryData.xls")) {
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
