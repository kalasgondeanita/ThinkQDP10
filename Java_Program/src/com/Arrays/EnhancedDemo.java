package com.Arrays;

import java.util.Scanner;

public class EnhancedDemo {

	public static void main(String[] args) {
		// Cannot use:
		// refer index
		// updation

		int ar[] = { 4, 5, 6, 7, 8, 9 };

		for (int x : ar) {
			System.out.println(x);
		}

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];

		System.out.println("Enter elements");
		for (int x : arr) {
			x = sc.nextInt();
		}

		for (int x : arr) {
			System.out.println(x);
		}

		System.out.println("-------------------------------");

		for (int x : ar) {
			x = x * x;
		}

		for (int x : ar) {
			System.out.println(x);
		}

	}

}
