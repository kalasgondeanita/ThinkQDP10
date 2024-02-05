package com.whileloop;

import java.util.Scanner;

public class DisariumNo {
	public static void DisariumNo(int num) {
		int rem,sum=0;
		int count=0;
		int temp=num;
		while(temp>0) {
			rem=temp%10;
			count++;
			temp=temp/10;
		}
		int disanum=num;
		while(num>0) {
			int n=1;
			int i;
			rem=num%10;
			for(i=1;i<=count;i++) {
				n=rem*n;
			}
			System.out.println(n);
			sum=sum+n;
			num=num/10;
			count--;
		}
		 if (disanum==sum) {
			 System.out.println("its disarum no");
		 }else {
			 System.out.println("its not disarum no");
			 
			 
					
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter no:");
		num=sc.nextInt();
		
		DisariumNo(num);

	}

}
