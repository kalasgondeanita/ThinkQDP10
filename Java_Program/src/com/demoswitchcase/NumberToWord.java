package com.demoswitchcase;
import java.util.Scanner;
public class NumberToWord {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("enter choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
			default:
				System.out.println("invalid input");
		}

	}

}
