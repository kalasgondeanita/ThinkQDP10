package com.Arrays;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("enter element:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		sc.close();

	}

}
