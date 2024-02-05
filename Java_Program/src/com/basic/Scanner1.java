package com.basic;
import java.util.Scanner;
public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		
		System.out.println("enter value of num1:");
		  num1=sc.nextInt();
		
		System.out.println("enter value of num2:");
		 num2=sc.nextInt();
		
		 sum=num1+num2;
		System.out.println("enter sum of No: "+sum);
		

	}

}
