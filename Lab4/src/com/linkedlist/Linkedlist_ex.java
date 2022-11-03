package com.linkedlist;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linkedlist_ex {
	
	public void linked_listEx(String str[],int n) {
		
		List<String> list1 = Arrays.asList(str);
		LinkedList<String> linkedlist = new LinkedList<>(list1);
		
		// Get values from the linkedlist
		System.out.println("\n LinkedList of above array is:"+linkedlist);
		System.out.println("First element in the linkedlist is "+linkedlist.getFirst());
		System.out.println("Last element in the linkedlist is "+linkedlist.getLast());
		
		// Remove values
		String last = linkedlist.remove(n-1);
		System.out.println(last+" is the last element removed from the linkedlist");
		System.out.println("LinkedList:"+linkedlist);
		
		linkedlist.add(4,"Jaipur");
		System.out.println("LinkedList:"+linkedlist);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of String array");
		int size = sc.nextInt();
		String houses[] = new String[size];
		System.out.println("Enter the values in the String array one by one");
		for(int i=0;i<size;i++) {
			houses[i] = sc.next();
		}
		sc.close();
		System.out.println("The values in the linked list are as follows:");
		for(String s: houses) {
			System.out.println(s+" ");
		}
		 new Linkedlist_ex().linked_listEx(houses,size);
	
		}
 }
