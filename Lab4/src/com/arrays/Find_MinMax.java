package com.arrays;

import java.util.Scanner;

public class Find_MinMax {
	
	public static final String arr_size_msg = "Enter the length of integer array" ;
	public static final String arr_values_msg = "Enter the values in int array";
	public static final String arr_result_msg = "Minimum & Minimum number in the int array is as follows :";
	public static final String arr_min_msg = "Minimum element in the integer array";
	public static final String arr_max_msg = "Maximum element in the integer array";
	
	public static int[] findMinMax(int arr[],int n) {
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i =0 ; i<arr.length; i++) {
			
			if(arr[i]< min) {
				min = arr[i];
			}
			
			else if(arr[i]> max) {
				max = arr[i];
			}
		}
		
		int res[] = new int [arr.length];
		res[0] = min;
		res[1] = max;
		
		return res;
		
	}

	public static void main(String[] args) {
		
		System.out.println(arr_size_msg);
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		// Declaring and Initializing the size of the integer array with length variable
		int num[] = new int[length];
		
		System.out.println(arr_values_msg);
		// Enter the values in the integer array one by one
		for(int i = 0; i<num.length; i++) {
			num[i]=sc.nextInt();
		}
	
	    System.out.println(arr_result_msg);
		
		int c[]=findMinMax(num, length);
	 
		 System.out.println("\t"+arr_min_msg +" "+ c[0]);
		 System.out.println("\t"+arr_max_msg +" "+ c[1]);
			
		

	}

}
