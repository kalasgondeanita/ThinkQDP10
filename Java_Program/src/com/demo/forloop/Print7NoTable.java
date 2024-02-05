package com.demo.forloop;
import java.util.Scanner;
public class Print7NoTable {
	public static void Print7Table(int n) {
		int i;
		
		for ( i = 1; i <=10; i++) {
		    
		     System.out.println(n*i);
		}
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter num:");
		n=sc.nextInt();
		
		Print7Table(n);
	}

}
