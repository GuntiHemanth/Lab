package com.collections;


import java.util.Map.Entry;
import java.util.TreeMap;


public class MyTreeMap {
	
	public void sorderList() {
		
	   TreeMap<Customer,Integer> mySortedMap = new TreeMap<>(new SortCustomerByFirst_Name());
	   mySortedMap.put(new Customer(2, "Vishwas", "kumar", "vishwas.kumar784@gmail.com", "04-06-1993","M"),1);
	   mySortedMap.put(new Customer(1, "Vikas", "kumar","vikas.kumar@gmail.com", "05-06-1996", "M"),2);
	   mySortedMap.put(new Customer(3, "Madhumita", "Raj", "raj.madhu@gmail.com", "06-08-1995", "F"),3);
	   mySortedMap.put(new Customer(4, "Deepthi", "Bajpai","deepthi.bajpai69@gmail.com", "09-01-1990", "F"),4);
	   mySortedMap.put(new Customer(5, "Rahul", "Rao", "rahulrao.125@gmail.com","05-01-1989", "M"),5);
	

       for(Entry<Customer, Integer> entry : mySortedMap.entrySet()) {
    	   System.out.println("[" + entry.getKey()+", " + entry.getValue());
       }
	}
	
	
	public static void main(String args[]) {
		new MyTreeMap().sorderList();
	}

}
