//1.Write a program in Java to display the first 10 terms of the following series:
//10, 20, 30, 40, ……..



package com.demo.forloop;
import java.util.Scanner;
public class FindSeries {
	public static void FindSeries(int n) {
		int i;
		//int sum;
		for(i=10;i<=n;) {
			i=i+10;
			System.out.println(i);
		}
		
	}
	



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num:");
		n=sc.nextInt();
		
		FindSeries(n);

	}

}
