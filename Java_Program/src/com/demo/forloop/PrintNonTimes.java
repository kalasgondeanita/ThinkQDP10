package com.demo.forloop;
import java.util.Scanner;
public class PrintNonTimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int i;
		int n;
		System.out.println("enter n number");
		n=sc.nextInt();
		if(n>0) {
			System.out.println("positive no");
			
		}
		else
		{
		    System.out.println("negative no");
		}
	
		
		
		
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}
		

	}

}
