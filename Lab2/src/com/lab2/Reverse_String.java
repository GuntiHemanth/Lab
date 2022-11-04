package com.lab2;

import java.util.Scanner;

public class Reverse_String {
	
	public void reverse_str(String name) {
		
		int str_length =name.length();
		
		while(str_length>0) {
			System.out.print(name.charAt(str_length-1));
			str_length--;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the String Value");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Reverse_String rs = new Reverse_String();
	    rs.reverse_str(name);
		}

}
