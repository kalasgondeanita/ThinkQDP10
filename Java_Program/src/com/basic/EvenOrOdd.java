package com.basic;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			   int num;
			   String result;

	        System.out.print("Enter a number: ");
	        num =sc.nextInt();
			 result=num % 2==0?"number is odd":"number is even";
			 
			 System.out.println("Result:"+result);

	        
	    }
	

	}


