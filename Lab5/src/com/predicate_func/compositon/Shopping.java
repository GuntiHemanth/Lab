package com.predicate_func.compositon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Shopping {

	int cust_ID;
	int cust_spending;

	public Shopping(int cust_ID, int cust_spending) {
		super();
		this.cust_ID = cust_ID;
		this.cust_spending = cust_spending;
	}

	public static void main(String[] args) {

		List<Shopping> shopping = new ArrayList<>();

		shopping.add(new Shopping(1, 2500));
		shopping.add(new Shopping(2, 4500));
		shopping.add(new Shopping(3, 6000));
		shopping.add(new Shopping(4, 7500));
		shopping.add(new Shopping(5, 6500));
		shopping.add(new Shopping(6, 5000));
		shopping.add(new Shopping(7, 5500));
		shopping.add(new Shopping(8, 8000));
		shopping.add(new Shopping(9, 4000));

		Function<Shopping, Integer> fn = e -> {
			int spendings = e.cust_spending;
			if (spendings >= 2500 && spendings <= 4500) {
				return (spendings * 10 / 100);
			} else if (spendings > 4500 && spendings <= 6000) {
				return (spendings * 20 / 100);
			} else if (spendings > 6000 && spendings <= 7500) {
				return (spendings * 30 / 100);
			} else {
				return (spendings * 40 / 100);
			}
		};

		Predicate<Integer> p = b -> b > 1200;

		for (Shopping shp : shopping) {

			int discount = fn.apply(shp);
			boolean coupon = p.test(discount);

			System.out.println("cust_ID :" + shp.cust_ID + " is having " + discount + " discount");
			System.out.println("cust_ID :" + shp.cust_ID + " is having coupon is " + coupon);
			System.out.println();
		}
	}
}
