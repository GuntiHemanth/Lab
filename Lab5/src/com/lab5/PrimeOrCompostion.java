package com.lab5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrimeOrCompostion {
	public static void main(String[] args) throws InterruptedException {

		List<Integer> ary = Arrays.asList(4, 5, 8, 9, 3, 10, 12,13,15,17,20,21);

		List<Integer> syncArry = Collections.synchronizedList(ary);

		Thread t1 = new Thread(() -> {
			Iterator<Integer> itr = syncArry.iterator();
			while (itr.hasNext()) {
				int x = itr.next();
				if (checkForPrime(x)) {
					System.out.println(Thread.currentThread() + " prime  " + x);
				}
			}
		});

		Thread t2 = new Thread(() -> {
			Iterator<Integer> itr = syncArry.iterator();
			while (itr.hasNext()) {
				int x = itr.next();
				if (checkForComposite(x)) {
					System.out.println(Thread.currentThread() + "   composite   " + x);
				}
			}
		});

		t1.start();
		t2.start();

	}

	public static boolean checkForPrime(int num) {

		boolean isor = false;
		int Element = num;
		int temp = Element / 2;
		int count = 0;
		if (Element == 0 || Element == 1) {
			System.out.println("0 or 1 is Not a Prime Number");
		} else {
			for (int j = 2; j <= temp; j++) {
				if (Element % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				return true;
			}
		}
		return isor;

	}

	public static boolean checkForComposite(int num) {

		boolean isor = false;
		int Element = num;
		int count = 0;
		int temp = Element / 2;
		if (Element == 0 || Element == 1) {
			System.out.println("0 or 1 is Not a Prime Number");
		} else {
			for (int j = 2; j <= temp; j++) {
				if (Element % j == 0) {
					count++;
					break;
				}
			}
			if (count != 0) {
				isor = true;
			}
		}
		return isor;
	}
}
