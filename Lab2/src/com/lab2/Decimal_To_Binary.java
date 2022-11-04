package com.lab2;

import java.util.Scanner;

public class Decimal_To_Binary {
	
	 public static long convertDecimal_To_Binary(int num){
	       long binary = 0;
	       int remainder,i=1,step=1;
	       
	       while(num!=0) {
	    	   remainder = num%2;
	    	   System.out.println("STEP "+step++ + ":"+num+"/2");
	    	   
	    	   System.out.println("Quentient = "+num/2+", Remainder= "+num%2);
	    	   num/=2;
	    	   
	    	   binary+=remainder*i;
	    	   i*=10;  	   
	     }
	       return binary;
	    }

	    public static void main(String[] args) throws IllegalAccessException {
	        
	    	Scanner sc = new Scanner(System.in);
	    	int num;
	    	System.out.println("Enter the decimal number");
	    	num = sc.nextInt();
	    	long BinaryNumber = convertDecimal_To_Binary(num);
	    	System.out.println("Binary Value :- "+BinaryNumber);
	    }

	}
