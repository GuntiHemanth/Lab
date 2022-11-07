package com.multi_threading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CustomerList {

	public void cust_data(List<Customer> customers) {
	     Collections.sort(customers,new SortCustomerBy_ID());
	     System.out.println("Sorted customers list by ID");
		 customers.forEach(System.out::println);
	}
	
	public void cust_EvenAge(List<Customer> customers) {
		List<Customer> evenAge = customers.stream().filter(cust -> cust.age%2==0).collect(Collectors.toList());
		
		System.out.println("Customers that has even age");
		evenAge.forEach(System.out::println);
		
		/* for(Customer cust:customers) {
		if(cust.getAge()%2==0) {
			System.out.println(cust.toString());			
			}
	 	}*/
		
	}
	
	public void cust_city(List<Customer> customers,String city) {
		List<Customer> city1 = customers.stream().filter(cust -> cust.getCity()==city).collect(Collectors.toList());
 		System.out.println("\n Customers from Chennai City");
 		city1.forEach(System.out::println);
	}
	
	
	public void cust_mail(List<Customer> customers,String account) {
		List<Customer> mail = customers.stream().filter(cust -> cust.getEmail().contains(account)).collect(Collectors.toList());
 		System.out.println("\nCustomers having gmail account");
 		mail.forEach(System.out::println);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
			ExecutorService service = Executors.newFixedThreadPool(2);
		
		
		
			List<Customer> customers = new ArrayList<>();
			
			customers.add(new Customer(1, "aravind", "aravind.r@gmail.com", "Chennai", 22));
			customers.add(new Customer(2, "bharath", "bharath.n@gmail.com","Hyderabad", 26));
			customers.add(new Customer(3, "chaitanya", "chaitanya.pawan@outlook.com","Mumbai", 28));
			customers.add(new Customer(4, "dheeraj", "dheeraj.15@yahoo.com","Chennai", 27));
			customers.add(new Customer(5, "eshwar", "eshwar.78@outlook.com","Hyderabad", 32));
			customers.add(new Customer(6, "Santosh", "santosh.r@yahoo.com","Delhi", 24));
			customers.add(new Customer(7, "yeswanth", "yeshwanth.g@outlook.com","Bangalore", 29));
			
			CustomerList cust = new CustomerList();
			Runnable r1 = new Runnable() {
				@Override
				public void run() {
					try{
						cust.cust_data(customers);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			  
			Runnable r2 = new Runnable() {
				
				@Override
				public void run() {
					try{ 
						cust.cust_EvenAge(customers);
						Thread.sleep(2000);
					}catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			};
			
			Runnable r3 = new Runnable() {
				
				@Override
				public void run() {
					try{
						cust.cust_city(customers, "Chennai");
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			
			Runnable r4 = new Runnable() {
				
				@Override
				public void run() {
					try{
						cust.cust_mail(customers, "gmail.com");
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			};
			
			service.submit(r1);
			service.submit(r2);
			service.submit(r3);
			service.submit(r4);
			
			
			System.out.println("**********************");
		    
		    service.shutdown();
		    service.awaitTermination(10, TimeUnit.SECONDS);
					
		
	}
		
}

