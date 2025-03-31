 /*
 write a program using recursion to find the nth element of Fibonacci series.
 */
 
package com.ats.beginners.LetUsJava.Chapter8;

import java.util.*;

public class RecursiveFibonacci
{
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        System.out.println("Which element you want for the fibonacci series:  ");
        int element = sc.nextInt();
        int Value = RecursiveFibonacci(element);
        System.out.println(element +"th element of Fibonacci Series is: " + Value);
    }
    public static int RecursiveFibonacci(int elem)
    {
          int val;
          if (elem <=1)
              return elem;
          else
          {
             val = RecursiveFibonacci(elem -1) + RecursiveFibonacci(elem-2);
             return val;
          }
    }
}
