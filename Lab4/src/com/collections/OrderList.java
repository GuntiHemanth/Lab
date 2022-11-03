package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderList {
	
	public void sortedSpecial() {
		List<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer(2, "Vishwas", "kumar", "vishwas.kumar784@gmail.com", "04-06-1993","M"));
		customers.add(new Customer(1, "Vikas", "kumar","vikas.kumar@gmail.com", "05-06-1996", "M"));
		customers.add(new Customer(3, "Madhumita", "Raj", "raj.madhu@gmail.com", "06-08-1995", "F"));
		customers.add(new Customer(4, "Deepthi", "Bajpai","deepthi.bajpai69@gmail.com", "09-01-1990", "F"));
		customers.add(new Customer(5, "Rahul", "Rao", "rahulrao.125@gmail.com","05-01-1989", "M"));
	
		//Collections.sort(customers,new SortedCustomerByDOB());
		
		Collections.sort(customers,new SortCustomerByFirst_Name().thenComparing(new SortedCustomerByDOB()));
		
//	 List sorderList = customers.stream().sorted((Customer o1,Customer o2)->{
//			return o1.getFirst_name().compareTo(o2.getFirst_name());
//		}).collect(Collectors.toList());
	
	   customers.forEach(System.out::println);
	
	}

	public static void main(String[] args) {
		new OrderList().sortedSpecial();

	}

}



