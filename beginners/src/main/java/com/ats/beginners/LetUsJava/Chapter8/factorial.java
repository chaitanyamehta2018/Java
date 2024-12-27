/*
 write a program using recursion to find the factorial.
 */
package com.ats.beginners.LetUsJava.Chapter8;

import java.util.*;

public class factorial 
{
    
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        System.out.println("Please enter any number to find it's factorial: ");
        int num = sc.nextInt();
        if (num >0) // This if-else block is to check the number's validity.
        {
            int fact = rec(num);
            System.out.println("Factorial value is: " + fact);
        }
        else
            System.out.println("Please check the number you have entered");
    }
    public static int rec(int num)
    {
        int fact;
        if (num ==1)
            return (1);
        else
            fact = num * rec(num -1);
        return fact;
    }
}

