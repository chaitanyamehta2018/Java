package com.ats.beginners.RealWorld;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
This class will send the 4 ping packets to the google.com and displays the response on the command.
 */


public class pingDestination {
    public static void main(String[] args) {
        try {
            String[] command = {"ping", "google.com"};
            
            // Execute the ping command
            Process process = Runtime.getRuntime().exec(command);
            
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
