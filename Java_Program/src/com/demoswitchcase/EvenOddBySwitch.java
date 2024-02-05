package com.demoswitchcase;
import java.util.Scanner;
public class EvenOddBySwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.printf("Enter the Number : ");
		num =sc.nextInt();
		switch (num % 2)
		{
			case 1:
				System.out.printf("This is a Even Number");
				break;
 
			case 2:
				System.out.printf("This is a Odd Number");
				break;
		}
	}


	

}
