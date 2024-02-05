package com.demo.forloop;
import java.util.Scanner;
public class Print1To10Sum {
	public static void PrintName() {
		
		int i;
		int sum=0;
		for( i=1;i<=10;i++) {
			sum = sum + i;
		}
            System.out.println( sum) ;
            sum=0;
		}
	

	public static void main(String[] args) {
		PrintName();
	 
	  
	}

}
