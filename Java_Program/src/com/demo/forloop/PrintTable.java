package com.demo.forloop;
import java.util.Scanner;
public class PrintTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int num;
		int total;
		
		
		
		System.out.println("enter the no of table:");
		num=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			total=num*i;
			System.out.println(num+"*"+i+"="+total);
			
		}
	
		
		
		

	}

}
