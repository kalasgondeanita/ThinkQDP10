package com.whileloop;

import java.util.Scanner;

public class CheckArmstrongNo {
public static void CheckAmtrongNo(int num) {
		
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("is amstrong no");
		}else {
			System.out.println("is not amstrong no");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter no:");
		num=sc.nextInt();
		
		CheckAmtrongNo(num);

	}

}


	