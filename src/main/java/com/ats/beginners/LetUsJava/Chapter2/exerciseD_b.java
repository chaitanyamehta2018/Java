/*
Assume a suitable value for distance between two cities (in km.). 
Write a Java program to convert and print this distance in meters,feet, inches and centimeters.
 */
package com.ats.beginners.LetUsJava.Chapter2;


public class exerciseD_b {
    
    public static void main(String args[]){
        
        int distanceinKm = 280; //distnace in k.m.
        int distanceinMeters = 1000 * distanceinKm; //distnace in meters
        int distanceinFeets = 3 * distanceinMeters; //distnace in feets
        int distanceinInches = 39 * distanceinMeters;
        int distanceinCms = 100* distanceinMeters;
        
        System.out.println("Distance between two cities in Meters = "+distanceinMeters + ", in Feets = "+distanceinFeets+ ", in Inches = "+distanceinInches+ ", in CMs = "+distanceinCms );
        
    }
    
}
