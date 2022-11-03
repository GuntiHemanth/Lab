package com.arrays;

import java.util.Scanner;

public class RepeatedWords {
	
	public static void checkDuplicateWords(String[] words) {
		int count=0;
		 System.out.println("Duplicate words in a given string : ");     
	        for(int i = 0; i < words.length; i++) {    
	            count = 1;    
	            for(int j = i+1; j < words.length; j++) {    
	                if(words[i].equals(words[j])) {    
	                    count++;    
	                    //Set words[j] to 0 to avoid printing visited word    
	                    words[j] = "0";    
	                }    
	            }    
	                
	            //Displays the duplicate word if count is greater than 1    
	            if(count > 1 && words[i] != "0")    
	                System.out.println(words[i]);    
	        }
		
	}
	public static void main(String[] args) {
		 String string = "Big tiger white tiger wild black tiger bengal tiger wild animal";    
	            
	        //Converts the string into lowercase    
	        string = string.toLowerCase();    
	            
	        //Split the string into words using built-in function    
	        String words[] = string.split(" ");    
	        
	        checkDuplicateWords(words);
	}

	

}
