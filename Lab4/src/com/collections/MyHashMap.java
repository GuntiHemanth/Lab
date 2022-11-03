package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MyHashMap {
	
	public void processMap(){
	
		Customer c1=new Customer(2, "Vishwas", "kumar", "vishwas.kumar784@gmail.com", "04-06-1993","M");
		Customer c2=new Customer(1, "Vikas", "kumar","vikas.kumar@gmail.com", "05-06-1996", "M");
		Customer c3=new Customer(3, "Madhumita", "Raj", "raj.madhu@gmail.com", "06-08-1995", "F");
		Customer c4=new Customer(4, "Deepthi", "Bajpai","deepthi.bajpai69@gmail.com", "09-01-1990", "F");
		Customer c5=new Customer(5, "Rahul", "Rao", "rahulrao.125@gmail.com","05-01-1989", "M");


		Map<String, Customer> customerMap = new HashMap<> ();
		customerMap.put(c1.getEmail(),c1);
		customerMap.put(c2.getEmail(),c2);
		customerMap.put(c3.getEmail(),c3);
		customerMap.put(c4.getEmail(),c4);
		customerMap.put(c5.getEmail(),c5);
		
//		if(customerMap.containsKey(c4.getEmail())) {
//			System.out.println(customerMap.get(c4.getEmail()));
//		}
		
		Iterator it = customerMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry data = (Entry) it.next();
			System.out.println(data.getKey() + "," + data.getValue());
		}
		
		// Hashcode for customer object references
		System.out.println("Hashcode values of customer object are as follows :-");
		System.out.println("c1:"+c1.hashCode());
		System.out.println("c2:"+c2.hashCode());
		System.out.println("c3:"+c3.hashCode());
		System.out.println("c4:"+c4.hashCode());
		System.out.println("c5:"+c5.hashCode());
		
		System.out.println("c1.equals(c2)"+c1.equals(c2));
		System.out.println("c2.equals(c3)"+c2.equals(c3));
		System.out.println("c3.equals(c4)"+c3.equals(c4));
		System.out.println("c4.equals(c5)"+c4.equals(c5));
		
		
		// Sorted order of hashmap using treemap
		TreeMap<String, Customer> t_map =new TreeMap<>();
		t_map.putAll(customerMap);
		
		for(Map.Entry<String, Customer> entry: t_map.entrySet()) {
			System.out.println("Key = "+ entry.getKey()+" "+"Value = "+
		                         entry.getValue());
		}
	}

	public static void main(String[] args) {
		
			new MyHashMap().processMap();
	}

}
