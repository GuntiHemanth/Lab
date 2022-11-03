package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWords {
	public static final String para = "Enter the paragraph :-";
	
	public HashMap<String, Integer> findDuplicates(String words[]) {
		
		Map<String, Integer> mp = new HashMap<String,Integer>();
		int count = 0;
		
		for(int i = 0; i < words.length; i++) {
			count = 0;
			for(int j = 0; j< words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
			}
			mp.put(words[i], count);
		}
		
		return (HashMap<String, Integer>) mp;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(para);
		String str = sc.nextLine();
		
		// Split the string into words using in-built functions
		String words[] = str.split(" ");
		
	 HashMap<String, Integer> duplicates= new DuplicateWords().findDuplicates(words);
	 System.out.println(duplicates);
		
		

	}

}
