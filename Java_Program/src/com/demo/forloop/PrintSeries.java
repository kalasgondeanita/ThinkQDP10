package com.demo.forloop;

import java.util.Scanner;

public class PrintSeries {
	public static void PrintSeries() {
		int i;
		int n=0;
		for(i=1;i<=10;i++) {
			n=n+n+1;
			System.out.println(n);
			
			
			
		}
		
	}
	public static void PrintSeries1() {
		int i;
		int n1=2;
		for(i=2;i<=10;i++) {
			n1=n1+n1-1;
			System.out.println(n1);
		}
	}
	public static void PrintSeries2() {
		int i;
		int n=1;
		int n1=2;
		int n2=0;
		for(i=1;i<=10;i++) {
			n=n+n+1;
			System.out.println(n);
			System.out.println(n1);
			n1=n1+n1-1;
			
			
		}
	}
	
	

	public static void main(String[] args) {
		
		int n=1;
		int n1=2;
		//System.out.println("enter the number:");
		//n=sc.nextInt();
		//System.out.println("enter the number:");
		//n1=sc.nextInt();
		
		
		PrintSeries();
		PrintSeries1();
		PrintSeries2();
		
		
		
		

	}

}
