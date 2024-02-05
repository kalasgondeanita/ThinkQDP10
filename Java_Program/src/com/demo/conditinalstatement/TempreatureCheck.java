package com.demo.conditinalstatement;
import java.util.Scanner;
public class TempreatureCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int temp;
		System.out.println("enter the temperature");
		temp=sc.nextInt();
		
		if(temp<0) {
			System.out.println("enter the temperature");
		}
		else if(temp<10) {
			System.out.println("very cold weather");
		}
		else if(temp<30) {
			System.out.println(" cold weather");
		}
		else if(temp<40) {
			System.out.println(" normal in temperature");
		}
		else if(temp>=40) {
			System.out.println(" it is very hot");
		}
		
			
		}
		

	}

