package com.whileloop;
import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int mul=1;
		System.out.println("mul of numbers:");
		num=sc.nextInt();
		
		while(num!=0) {
			mul*=num%10;
			num/=10;
			System.out.println("mul:"+mul);
			
			

	}

	}
}
