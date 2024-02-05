package com.whileloop;

import java.util.Scanner;

public class FindFrequency {
	public static void FindFrequency(int num) {
		int i;
		int rem;
		

		for(i=0;i<=9;i++) {
			int count=0;
			int temp=num;
			while(temp>0) {
				rem=temp%10;
				if(rem==i) {
					count++;
				}
				temp=temp/10;
			}
			if (count>0)
			{
			System.out.println(i+" " +count);
			
		}
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter no:");
		num=sc.nextInt();
		
		FindFrequency(num);
		

	}

}
