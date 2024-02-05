package com.demoswitchcase;

import java.util.Scanner;

public class CalBySwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int result;
		int calculation = 0;
		char operator;

		System.out.println("enter num1:");
		num1 = sc.nextInt();

		System.out.println("enter num2:");
		num2 = sc.nextInt();
		System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division");
		operator = sc.next().charAt(0);

		switch (calculation) {

		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;

		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;

		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;

		case '/':
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;

		}

	}

}
