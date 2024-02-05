package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindCuSq {
	public static void CuSq(int ar[]) {
		int[] cube = new int[8];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i] * ar[i] * ar[i];

		}
		
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(cube));

	}

	public static void CuSqTest(int ar[]) {
		int []square = new int[8];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i] * ar[i] ;

		}
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(square));

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[] {3,4,6,1};
		System.out.println("1.cube\n2.square");
		switch(sc.nextInt()) {
		case 1:
		System.out.println(Arrays.toString(ar));
		CuSq(ar);
		break;
	
		case 2:
			System.out.println(Arrays.toString(ar));
			CuSqTest(ar);
		
			
		}
			
	}
}
	
	


