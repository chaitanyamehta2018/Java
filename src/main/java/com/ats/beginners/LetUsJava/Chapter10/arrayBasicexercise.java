/*
This code provides the insight about
(i)How to define the array
(ii)How to take input from keyboard for fetching array elements and how to print the array on the sout.
(iii)How to find the smallest and largest numbers from the array for each row.
*/

package com.ats.beginners.LetUsJava.Chapter10;

import java.util.*;


public class arrayBasicexercise
{
   public static void main ( String[ ] args ) 
 { 
     
     var sc = new Scanner(System.in);
     int smallest,largest,i,j,rows=3,columns=3;
     int[][]a = new int[rows][columns];

     for (i=0;i<rows;i++)
     {
         for (j=0; j<columns;j++)
         {
             System.out.println("Enter the element of row"+i+" and column "+j +":");
             a[i][j]= sc.nextInt();
         }
     }
   
     for (i=0; i <rows;i++)
     {
         for (j=0; j<columns;j++)
         {
             System.out.print(a[i][j] +" ");
         }
         System.out.print("\n");
     }
     
     
     for (i=0;i < a.length; i++)
     {
         smallest =a[i][0];
         largest =a[i][0];
         
         for (j=0; j<a[i].length; j++)
         {
             if (a[i][j] < smallest)
             {
                smallest =a[i][j];
             }
            if (a[i][j] > largest)
             {
                largest =a[i][j];
             }
            
         }
         System.out.println("For row number "+i +" Smallest value is "+smallest +" and Largest value is "+largest);

         }
     
  }
}