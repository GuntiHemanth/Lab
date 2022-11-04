package com.lab2;

import java.util.Scanner;

public class BinaryToDecimal {
	
	
	public static final String binary = "Enter Binary Value";
    public static final String REG_EX_ONLY_01="^[01]+$";
    
    public long convertBinary_To_Decimal(String Decimal) {
    	char bits[] = Decimal.toCharArray();
    	long res =0;
    	   for(int i=0;i<bits.length;i++){
    		   int value = (int) Math.pow(2, bits.length-i-1);
               res += value * Integer.parseInt(String.valueOf(bits[i]));

    	   }
    	   return  res;
    }
	
	

	public static void main(String[] args) throws IllegalAccessException {
		Scanner sc = new Scanner(System.in);
        System.out.println(BinaryToDecimal.binary);
        
        String value =sc.next();
        if(value.matches(BinaryToDecimal.REG_EX_ONLY_01)) {
          	System.out.println(new BinaryToDecimal().convertBinary_To_Decimal(value));
        }
        else {
        	throw new IllegalAccessException("Illegal Input");
        }


	}

}



	
   