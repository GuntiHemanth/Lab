package com.lab3.singleton;

import java.util.Scanner;



public class PaymentUtility {

private static PaymentUtility paymentService=null;
	
	Scanner sc= new Scanner(System.in);
	
	
	private PaymentUtility() {
			//Nothing
	}
	

	
	public static PaymentUtility getInstance() {
		
		if(paymentService == null) {
			paymentService = new PaymentUtility();
		}
		return paymentService;
	}
	
	public String UPI_Payment() {
		System.out.println("Enter the UPI PIN Number");
		sc.nextLine();
		//System.out.println("loading....");
		return "UPI payment is done successfully";
	}
	
	public String Creditcard_Payment() {
		
		System.out.println("Enter the secret code number of the credit card");
		sc.nextInt();
		System.out.println("Please enter the 6 digit OTP number sent to your mobile");
		sc.nextInt();
		System.out.println("loading....");
		return "Creditcard payment is done successfully";
	}
	
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				PaymentUtility payment1=PaymentUtility.getInstance();
				String res1=payment1.UPI_Payment();
				System.out.println("Payment1 status:-"+res1);
				
//				PaymentUtility payment2=PaymentUtility.getInstance();
//				String res2=payment2.UPI_Payment();
//				System.out.println("Payment2 status:-"+res2);
//	
//				PaymentUtility payment3=PaymentUtility.getInstance();
//				String res3=payment3.Creditcard_Payment();
//				System.out.println("Payment3 status:-"+res3);
			
				
	}

}
