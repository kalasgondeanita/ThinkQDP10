package com.whileloop;

import java.util.Scanner;

public class SeprateNo {
	public static void SeprateNo(int num) {
		int rem;
		
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.println(rem);
			System.out.println(num);
			
		}
		System.out.println("num:"+num);
	}
	public static void CountDigits(int num) {
		int rem;
		int count=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println("count:"+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num;
		System.out.println("enter num:");
		num=sc.nextInt();
		
		SeprateNo(768);
		CountDigits(78910);
	}

}
