package com.demo.conditinalstatement;

import java.util.Scanner;

public class TernaryOperatorTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,min;
		
		System.out.println("enter n1:");
		num1=sc.nextInt();
		System.out.println("enter n2:");
		num2=sc.nextInt();
		min=num1<num2? num1:num2;
		
		System.out.println("min:"+min);

	}

}
