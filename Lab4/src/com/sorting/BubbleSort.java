package com.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public void bubbleSort(int arr[])
	{
		int size = arr.length;
		for(int i =0; i<size-1; i++) {
			for(int j=0; j<size-i-1;j++ ) {
				if(arr[j] > arr[j+1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			  }
		   }
	 }
 
	public void printArray(int arr[]) 
	{
		int size = arr.length;
		for(int i=0; i<size;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		BubbleSort bs = new BubbleSort();
		System.out.println("Enter the value of array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values in the int array one by one");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		bs.bubbleSort(arr);
		System.out.println("Sorted array");
		bs.printArray(arr);
	}

}
