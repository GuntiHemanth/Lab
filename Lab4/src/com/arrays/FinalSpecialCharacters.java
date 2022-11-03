package com.arrays;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalSpecialCharacters {
	
	private static String para_msg ="Enter the paragraph";
	
	public static boolean findSpecialChars(String str) {
		boolean res = false;
		Pattern checkPattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher match = checkPattern.matcher(str);
		boolean check = match.find();
		return check;
	}

	public static void main(String[] args) {
		
		System.out.println(para_msg);
		Scanner sc = new Scanner(System.in);
		String para = sc.nextLine();
		boolean res = findSpecialChars(para);
		
		if(res) {
			System.out.println("Given String has special characters");
		} else {
			System.out.println("Given String doesn't contain any special characters");
		}

	}

}
