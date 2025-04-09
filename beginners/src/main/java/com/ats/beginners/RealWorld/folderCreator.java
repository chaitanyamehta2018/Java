package com.ats.beginners.RealWorld;
import java.io.File;

public class folderCreator {
    public static void main(String[] args) {
        // List of folder names
        String[] folderNames = {
            "2F_00", "2F_01", "2F_02", "2F_03",
            "2F_04", "2F_05", "2F_06", "2F_07",
            "2F_08.1", "2F_08.2", "SyAD"
        };

        // Base directory to create folders
        String baseDir = "C:\\Users\\HerryPotter\\Documents\\Folders";  // Change as needed

        for (String folderName : folderNames) {
            // Create full path for each folder
            File folder = new File(baseDir + "\\" + folderName);

            // Create directory if it doesn't exist
            if (!folder.exists()) {
                boolean created = folder.mkdirs();
                if (created) {
                    System.out.println("Folder created: " + folderName);
                } else {
                    System.out.println("Failed to create: " + folderName);
                }
            } else {
                System.out.println("Folder already exists: " + folderName);
            }
        }
    }
}
