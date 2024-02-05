package com.demo.conditinalstatement;
import java.util.Scanner;
public class TernaryOperatorTest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2,max;
		
		System.out.println("enter n1:");
		n1=sc.nextInt();
		System.out.println("enter n2:");
		n2=sc.nextInt();
		max=n1>n2? n1:n2;
		
		System.out.println("max:"+max);


	}

}
