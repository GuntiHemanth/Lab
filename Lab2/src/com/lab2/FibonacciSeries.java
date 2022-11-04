package com.lab2;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static final String message = "Enter the count for fibonacci series";
	public static final String msg = "Fibonacci series upto ";
	 public static final String REG_EX_ONLY_0_9="^[0-9]+";
	
	public void  fibonacci(String count) {
		//int limit = Integer.valueOf(count);
		int n1=0,n2=1,n3 =0;
		System.out.println(FibonacciSeries.msg+count);
		
		while(n1<=Integer.valueOf(count)) {
			System.out.print(n1+" ");
		     n3 = n1+n2;
			 n1 = n2;
			 n2 = n3;
		}
	
	}

		public static void main(String[] args) throws IllegalAccessException {
			
			System.out.println(FibonacciSeries.message);
			Scanner sc = new Scanner(System.in);
			String count = sc.nextLine();
			
		if(count.matches(REG_EX_ONLY_0_9)) {
				new FibonacciSeries().fibonacci(count);
			
			} else {
				throw new IllegalAccessException();
			}
	}
}
