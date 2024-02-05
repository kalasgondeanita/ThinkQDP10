//6. Write a Java program to find sum of all even numbers between 1 to n. 



package com.demo.forloop;
import java.util.Scanner;
public class SumOfEvenNo1Ton {
	public static void SumOfEven(int n) {
		int i;
		int sum=0;
		for (i=1;i<=n;i++) {
			if(i%2==0) {
			sum=sum+i;
			}
		
			
		}
		System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num:");
		n=sc.nextInt();
		SumOfEven(n);
	}

}
