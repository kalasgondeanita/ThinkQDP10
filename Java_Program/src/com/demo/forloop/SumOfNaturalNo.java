package com.demo.forloop;
import java.util.Scanner;
public class SumOfNaturalNo {
	public static void SumNturalNo(int n) {
		int i;
		int fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
					
		}
		
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num:");
		n=sc.nextInt();
		SumNturalNo(n);

	}

}
