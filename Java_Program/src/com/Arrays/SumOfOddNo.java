package com.Arrays;

import java.util.Scanner;

public class SumOfOddNo {
	public static void SumOdd(int ar[]) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			//int num = 0;
			
			if (ar[i] % 2 != 0) {
				sum += ar[i];

			}
		

		}
		
		
		System.out.println("sum of odd numbers="+sum);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		SumOdd(arr);
		//SumOdd(arr1);

	}

}
