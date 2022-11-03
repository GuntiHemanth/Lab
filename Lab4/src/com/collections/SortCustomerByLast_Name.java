package com.collections;

import java.io.Serializable;
import java.util.Comparator;

public class SortCustomerByLast_Name implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o) {
		// TODO Auto-generated method stub
		return o1.getLast_name().compareTo(o.getLast_name());
	}

}
