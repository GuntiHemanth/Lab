package com.collections;

import java.util.Comparator;

class SortedCustomerByDOB implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getDob().compareTo(o2.getDob());
	}
	
}
