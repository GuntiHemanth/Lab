package com.arrays;

import java.util.Scanner;

public class Two_Array_Multiplication {
static Scanner sc = new Scanner(System.in);
	
	public int[][] two_array_multi(int arr1[][],int arr2[][],int row,int col) {
		
		int result[][]= new int[row][col]; 
		
		// Enter the values in the first array
				System.out.println("Enter the values in the first array");
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						 arr1[i][j] = sc.nextInt();
					}			
				}
				
		// Printing the values entered in the first array
				System.out.println("The values entered in the first array is as follows:-");
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						 System.out.print(arr1[i][j]+" ");
					}			
					System.out.println();
				}
				
			
		// Enter the values in the second array
				System.out.println("Enter the values in the second array");
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						 arr2[i][j] = sc.nextInt();
					}		
					System.out.println();
				}
				
		// Printing the values entered in the second array
				System.out.println("The values entered in the second array is as follows:-");
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						 System.out.print(arr2[i][j]+" ");
					}		
					System.out.println();
				}
				
		// Multiplication of 3x3 matrix 
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						result[i][j]=0;
						for(int k=0; k<col;k++) {
							result[i][j]+= arr1[i][k]*arr2[k][j];
						}
						//System.out.print(result[i][j]+"  ");
					}
					System.out.println();
				}		
			return result;	
	}

	
	public static void main(String[] args) {
		
//		System.out.println("Enter the size of rows & col of an array");
//		int row = sc.nextInt();
//		int col = sc.nextInt();
		
		// Declaring and intializing the first array
		int arr1[][] = new int[3][3];
		// Declaring and intializing the second array
	     int arr2[][] = new int[3][3];
	     //Output array
	     int output[][] = new int[3][3];
				
		// Calling the method for multiplication of 3x3 matrix
				output = new Two_Array_Multiplication().two_array_multi(arr1, arr2, 3, 3);
				
		// Multiplication result
		 System.out.println("The result of 2x2 array addition is as follows :-");
	       for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
						System.out.print(output[i][j]+" ");
				}
			 System.out.println();
			}		
	       
	       sc.close();
	
	}
}
