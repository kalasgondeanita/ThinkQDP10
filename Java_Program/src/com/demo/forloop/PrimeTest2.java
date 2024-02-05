package com.demo.forloop;

import java.util.Scanner;

public class PrimeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int i;
		boolean flag=false;
		
		System.out.println("enter number:");
		num=sc.nextInt();
		if(num==0|| num==1) {
			flag=true;
		}
		else {
			for(i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=true;
					break;
				}
			}
		}
		if (flag==false) {
			System.out.println(num+"is prime");
		}else {
			System.out.println(num+"is not prime");
		}

	}

}
