package com.demo.forloop;

import java.util.Scanner;

public class FindSeries3 {
	public static void  FindSeries(int n) {
		int i;
		int sum=1;
		for(i=1;i<=n;i++) {
			//sum=i*i*i;
		}
		System.out.println(i*i*i);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num:");
		n=sc.nextInt();
		
		FindSeries(n);

	}

}
