package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsImpl {
	
	// Look for a Customer based on Customer ID 
	public void cust_details(List<Customer> customer) {
		
		System.out.println("List of Customers based on customer Id greater than 4");
		
		customer.stream().filter(x->x.id>4).forEach(x->System.out.println(x.name));
		System.out.println();
	}

	public void sort_Customer_By_Name(List<Customer> customers) {
		
		System.out.println("Sort customers based on name\n");
		
		Comparator<Customer> c1 = Comparator.comparing(e->e.name.length());
		Comparator<Customer> c2 = (e1,e2) -> e1.name.compareTo(e2.name);
		
		 customers.stream().sorted(c1.thenComparing(c2)).collect(Collectors.toList()).forEach(System.out::println);;
	
		System.out.println();
	}
	
	// Filter customer objects by customer name and gmail mail account
	public void filter_name_mail(List<Customer> cust1){ 
		
		System.out.println("Filter customers based on  name and gmail mail account\n");
		
		 cust1.stream().filter(x->x.getName().equals("Virtusa") &&x.email.endsWith("@gmail.com")).forEach(System.out::println);
		 System.out.println();
	}
	
	// Use Reduce Function to calculate sum of all customer age
	public void customers_SumOfAges(List<Customer> customers) {
		
		System.out.println("Use Reduce Function to calculate sum of all customer age");
		
		Integer sum_Cust_age = customers.stream()
				.reduce(0, (result, current) ->
				   result + current.getAge(), Integer::sum);
				
		System.out.println("Total sum of age : "+sum_Cust_age+"\n");
	}
	
	// Convert the List to HashMap
	
	public void list_HashMap(List<Customer> customers) {
		
		System.out.println("Convert the list to hashmap");
		
		Map<Object, Object> mapCustomers = customers.stream()
				                           .collect(Collectors.toMap(p->p.id, p->p.name));
		
		System.out.println("HashMap contains: "+mapCustomers);
	}
	
	public static void main(String[] args) {
		
		// ArrayList for adding customer details
		List<Customer> cust = new ArrayList<>();
		cust.add(new Customer(1, "naresh", "naresh.e@gmail.com","Hyderabad", 25));
		cust.add(new Customer(2, "HariBabu", "hari.babu@gmail.com", "Vizag", 28));
		cust.add(new Customer(3, "Uday Kumar", "uday.k@gmail.com", "Pune", 23));
		cust.add(new Customer(4, "Ravinder Rao", "rao.ravinder@outlook", "Chennai", 27));
		cust.add(new Customer(5, "Pawan K", "k.pawan@gmail.com", "Mumbai", 21));
		cust.add(new Customer(6, "Kalyan Kumar", "k.kalyan@gmail.com", "Mumbai", 20));
		cust.add(new Customer(7, "Virtusa", "virtusa.com@gmail.com", "Hyderabad", 26));
		
		// Printing customer details
		System.out.println("Array List consists of Cusomers details\n");
		for(Customer c: cust) {
			System.out.println(c.id+" "+c.name+" "+c.email+" "+c.city+" "+c.age);
		}
		
		System.out.println();
		
		StreamsImpl streams = new StreamsImpl();
		
		streams.cust_details(cust);  // cusomter details based on id
		
		streams.sort_Customer_By_Name(cust);  // Sort the customers based on name
		
		streams.filter_name_mail(cust);   // filter customers by name and gmail account
		
		streams.customers_SumOfAges(cust);  // use reduce function to calculate sum of ages
		streams.list_HashMap(cust);
		
		
	}

}
