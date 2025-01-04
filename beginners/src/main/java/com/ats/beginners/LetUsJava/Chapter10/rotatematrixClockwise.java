/*
 rotate a matrix by 90 degrees (clockwise)

Example:1 ==>
Input Matrix
1  2  3  
4  5  6  
7  8  9  

Output Matrix
7  4  1  
8  5  2  
9  6  3 

 */
package com.ats.beginners.LetUsJava.Chapter10;
import java.util.*;

public class rotatematrixClockwise 
{
    public static void main(String[] args) 
    {
        int row, column;
        var sc = new Scanner(System.in);
        System.out.println("Enter the number of rows(s) for the input matrix: ");
        row = sc.nextInt();
        System.out.println("Enter the number of column(s) for the input matrix: ");
        column = sc.nextInt();
        int[][] matrixA = new int[row][column];
        int[][] transposedMatrixA = new int[column][row];
        
        //Initialize the input Matrix
        for(int i=0; i<row; i++)
        {
            for(int j =0; j< column; j++)
            {
                System.out.print("Enter the element row "+i+" and column "+j+" ");
                matrixA[i][j] = sc.nextInt();
                transposedMatrixA[j][i]=matrixA[i][j];
            }
        }
        
        //reverse the transposed matrix
        for (int i = 0; i < transposedMatrixA.length; i++) 
        {
           int start = 0;
           int end = transposedMatrixA[i].length - 1;
           while (start < end) 
           {
               // Swap the elements in each row
               int temp = transposedMatrixA[i][start];
               transposedMatrixA[i][start] = transposedMatrixA[i][end];
               transposedMatrixA[i][end] = temp;

               start++;
               end--;
            }
        }  
        //Display the Transposed matrix on output
        System.out.println("Rotated Matrix (90 degrees clockwise) is: ");
        for(int i=0; i<column; i++)
        {
            for(int j =0; j< row; j++)
            {
                System.out.print(transposedMatrixA[i][j]+ " ");
            }
            System.out.print("\n");
        }   
    }
}

