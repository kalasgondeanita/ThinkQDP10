package com.demo.forloop;
import java.util.Scanner;
public class PrintFacOfAnyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		int num;
		int count=0;
		System.out.println("enter the no of factors" );
		num=sc.nextInt();
		 
		for(i=1;i<=num;i++){
			
		
			if(num%i==0) 
			{
				count++;
			   System.out.println(i);
			}
			
		   }
		System.out.println("count " +count);
		
	}

	}
