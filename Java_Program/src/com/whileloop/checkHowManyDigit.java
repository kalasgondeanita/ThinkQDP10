package com.whileloop;
import java.util.Scanner;
public class checkHowManyDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		int num;
		System.out.println("enter the number:");
		num=sc.nextInt();
		
		while(num!=0) {
			num=num/10;
			count++;
		}
      System.out.println("number of digit:"+count);

	}

}
//write a program of sum of digit using loop