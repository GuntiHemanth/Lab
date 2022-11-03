package com.arrays;

import java.util.Scanner;

public class TwoArrayAddition {
	static Scanner sc = new Scanner(System.in);
	
	public int[][] two_array_add(int arr1[][],int arr2[][],int row,int col) {
		
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
				
		// Addition of 2x2 matrix 
				for(int i=0;i<row;i++) {
					for(int j=0;j<col;j++) {
						result[i][j] = arr1[i][j] + arr2[i][j];
				}
			}		
				
		
			return result;	
	}

	public static void main(String[] args) {
		
		
	
		System.out.println("Enter the size of rows & col of an array");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		// Declaring and intializing the first array
		int arr1[][] = new int[row][col];
		// Declaring and intializing the second array
	     int arr2[][] = new int[row][col];
	     //Output array
	     int output[][] = new int[row][col];
				
		// Calling the method for addition of 2x2 matrix
				output = new TwoArrayAddition().two_array_add(arr1, arr2,row,col);
				
		// Addition result
		 System.out.println("The result of 2x2 array addition is as follows :-");
	       for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
						System.out.print(output[i][j]+" ");
				}
			 System.out.println();
			}		
	       
	       sc.close();
		

	}

}
