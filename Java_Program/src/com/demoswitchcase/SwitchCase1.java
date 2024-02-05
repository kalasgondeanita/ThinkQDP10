package com.demoswitchcase;
import java.util.Scanner;
public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char choice;
		
		System.out.println("Enter your choice:");
		choice=sc.next().charAt(0);
		
		switch(choice) {
		case'a':
		case 'A':	
			System.out.println("tea rs 30");
			break;
		case 'b':
		case 'B':	System.out.println("coffe rs 30");
			break;
		case 'c':
		case 'C':	
			System.out.println("sandwitch rs 30");
			break;
			default:
				System.out.println("invalid choice");
		}
		

	}

}
