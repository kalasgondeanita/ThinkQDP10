package com.Arrays;

import java.util.Scanner;

public class SumOfArray {
	static int i;
	private static int[] ar1;
public static void SumNo(int ar[]) {
	for(i=0;i<ar.length;i++) {
		int sum=0;
		sum+=ar[i];
	}
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
		SumOfArray s1=new SumOfArray();
		
		
		s1.SumNo(ar1);
		
	}

}


