/*
Assume a suitable value for c salary. His dearness allowance is 40% of basic salary, and house rent allowance is 20% of basic salary.
Write a Java program to calculate his gross salary. 
 */
package com.ats.beginners.LetUsJava.Chapter2;

public class exerciseD_a {
    public static void main(String args[])
    {
        int basicSalary =30000;
        double dearnessAllowance = 0.4 * basicSalary;
        double  houserentAllowance = 0.2 * basicSalary;
        double grossSalary = basicSalary + dearnessAllowance + houserentAllowance;
      
        System.out.println("Gross salary of employee is: "+ grossSalary);
        
    }
    
}
