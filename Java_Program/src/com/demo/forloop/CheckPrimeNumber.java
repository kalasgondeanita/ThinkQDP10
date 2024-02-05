package com.demo.forloop;
import java.util.Scanner;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int i;
         int num;
         int count=0;
         System.out.println("enter number:");
         num=sc.nextInt();
         
         for(i=2;i<=num/2;i++) {
        	 if(num%i==0) {
        		 count++;
        	 }
        	 }
            if (count==0) {
            	System.out.println(num+"is prime");
            }

            else {
            	System.out.println(num+"is not prime");
         }
         
         
	}
}

