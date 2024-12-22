package com.ats.beginners.RealWorld;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





public class pingDestination {
    public static void main(String[] args) {
        try {
            String command = "ping google.com";
            
            // Execute the ping command
            Process process = Runtime.getRuntime().exec (command);
            
            // Read the output of the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            // Continuously print output until stopped
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Wait for the process to complete (optional)
            process.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
