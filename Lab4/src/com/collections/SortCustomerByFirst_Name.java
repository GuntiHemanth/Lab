package com.collections;

import java.util.Comparator;

public class SortCustomerByFirst_Name implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getFirst_name().compareTo(o2.getFirst_name());
	}
	
}
