/*
Assume suitable values for marks obtained by a student in five different subjects are input through the keyboard. 
Write a Java program to find out the aggregate marks and percentage marks obtained by the student. 
Assume that the maximum marks that can be obtained by a student in each subject is 100. 
 */
package com.ats.beginners.LetUsJava.Chapter2;

import java.util.*;

public class exerciseD_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLimit = 100;
        
        System.out.print("This program will calculate average and percentage for five different subjects: \n");
        
        int markMaths = getValidMarks(scanner, "Maths", maxLimit);
        int markScience = getValidMarks(scanner, "Science", maxLimit);
        int markSociology = getValidMarks(scanner, "Sociology", maxLimit);
        int markEnglish = getValidMarks(scanner, "English", maxLimit);
        int markHindi = getValidMarks(scanner, "Hindi", maxLimit);
        
        double totalMarks = markMaths + markScience + markSociology + markEnglish + markHindi;
        double averageMarks = totalMarks / 5;
        double percentage = (totalMarks * 100) / 500;
        
        System.out.println("\nStudent's Average Marks are " + averageMarks + ", and Percentage is " + percentage + "%.");
        
        scanner.close();
    }
    
    // Helper Method for Validating Marks
    public static int getValidMarks(Scanner scanner, String subject, int maxLimit) {
        System.out.print("Enter " + subject + " marks: ");
        int marks = scanner.nextInt();
        
        while (marks > maxLimit || marks < 0) {
            System.out.print("Invalid! Enter " + subject + " marks (0-100): ");
            marks = scanner.nextInt();
        }
        return marks;
    }
}

