package com.lab2;

import java.util.Scanner;

public class CheckPrime {

	public boolean isPrime(int number) {
		 boolean isPrime = true;
		 int i = 2;
		 
		 // Condition to check the number prime or not
		 while( i<=number/2) {
			 if(number%i==0) {
				 isPrime = false;
				 break;
			 }
			 i++;
		 }
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number to check prime or not");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		boolean result = new CheckPrime().isPrime(number);
		System.out.println("The condition for number "+number+" is prime is "+result);
	     

	}

}
