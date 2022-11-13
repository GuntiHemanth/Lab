package com.lab5;

public class Threadex1 implements Runnable {
	int length;
	int array[] = new int[length];

	public Threadex1(int[] arr, int len) {
		this.length = len;
		this.array = arr;
	}

	@Override
	public void run() {
		for(int i =0;i<length;i++) {
			if(array[i]!=0) {
				if(array[i]%2 ==1 || array[i]!=2) {
					System.out.println("given array elementsno is prime "+ array[i]);
				}
			}
			
		}
		

	}

}
