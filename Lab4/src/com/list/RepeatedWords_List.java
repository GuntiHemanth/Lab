package com.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RepeatedWords_List {
	
	
	public void repeated_words(String words[]) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		for(String word: words) {
			list1.add(word);
		}
		System.out.println("Array List");
		for(int i=0;i<words.length;i++) {
			System.out.println("array list1:- "+list1.get(i)+" ");
		}
		System.out.println();
		HashMap<String, Integer> hm = new HashMap<>();
		for(String str: list1) {
			if(hm.containsKey(str)) {
				hm.put(str, hm.get(str)+1);
			}
			else {
				hm.put(str,1);
			}
		} //for
		
		// Count Duplicates
		hm.forEach((String,Integer)->{
		     if(Integer>1)
		    	 System.out.println("The words "+String+" duplicates "+Integer);
		});
		
		
//		Set s = new TreeSet<>();
//		s.addAll(list1);
//		Iterator it = s.iterator();
//		while(it.hasNext()) {
//			System.out.println("Set :"+(String)it.next());
//		}
		
	}

	public static void main(String[] args) {
		//Enter the String Value
		System.out.println("Enter the string value");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String words[] = str.split(" ");
		new RepeatedWords_List().repeated_words(words);
	}

}
