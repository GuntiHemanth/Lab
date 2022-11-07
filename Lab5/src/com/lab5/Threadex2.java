package com.lab5;


public class Threadex2 implements Runnable {
	int length;
	int array[] = new int[length];

	public Threadex2(int[] arr, int len) {
		this.length =len;
		this.array = arr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		{			
			for(int i=0;i<length;i++) {
				if(array[i]% 2!= 1 || array[i] == 0) {
					System.out.println("given array elements is not a prime "+array[i]);
				}
			}
			
		}
		
	}

	
	
		
	 
	

}
