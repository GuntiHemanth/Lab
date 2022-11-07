package com.multi_threading;

import java.util.Comparator;

public class SortCustomerBy_ID implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
