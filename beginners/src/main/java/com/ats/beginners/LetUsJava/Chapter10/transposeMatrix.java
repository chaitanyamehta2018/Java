/*
- Take a 2D array (matrix) as input from the user.
- Transpose the matrix (swap rows and columns).
- Print the transposed matrix.
Example:1 ==>
Input Matrix:  
1  2  3  
4  5  6  
7  8  9  

Transposed Matrix:  
1  4  7  
2  5  8  
3  6  9  

Example:2 ==>
Input Matrix: 
1 2
3 4
5 6

Transposed Matrix:
1 3 5
2 4 6

 */
package com.ats.beginners.LetUsJava.Chapter10;

import java.util.*;


public class transposeMatrix 
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
        
        //Display the input matrix on output
        System.out.println("You have entered the Matrix as: ");
        for(int i=0; i<row; i++)
        {
            for(int j =0; j< column; j++)
            {
                System.out.print(matrixA[i][j]+ " ");
            }
            System.out.print("\n");
        }        

        //Display the Transposed matrix on output
        System.out.println("Transposed Matrix is: ");
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
