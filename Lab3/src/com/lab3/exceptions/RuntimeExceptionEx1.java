package com.lab3.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class RuntimeExceptionEx1 {

	public int divide(int a,int b) {	
		int c = a/b; 
		return c;
	}
	
	public void doSomething() {
		
		String name = "suraj";
		System.out.println("name = "+name);
		System.out.println("character at index0 of name is :"+name.charAt(0));
		
		// array arr initialised from index 0 to n-1
		int arr[]= new int[5];
		System.out.println("Lenth of integer array is :"+arr.length);
		
		System.out.println("Integer array starts from index arr[0] to index arr[length-1]");

		/* here loop is trying to access index greater last index i.e arr.length 
		instead of arr.lenth-1 */

		for(int i=0;i<=arr.length;i++) {
			arr[i]=i;
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		try {
			// Arithmetic Divide Operation and check null pointer exception
			System.out.println("Enter the values for two variables");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.close();
			int res=new RuntimeExceptionEx1().divide(a, b);
			System.out.println("Result = "+res);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Error occured...."+e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			// Array operations
			new RuntimeExceptionEx1().doSomething();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("NoSuchElementException..."+e.getMessage());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("Null pointer exception ... "+e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("ArrayIndexOutOfBoundsException ...."+e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
