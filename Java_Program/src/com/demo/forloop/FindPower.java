package com.demo.forloop;
import java.util.Scanner;
public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int num;
		int result=1;
		int power=0;
		
		System.out.println("enter the power of number:");
		num=sc.nextInt();
		for(i=1;i<=power;i++) {
			result=result*num;
		}
		System.out.println("Result: "+result);

	}

}
