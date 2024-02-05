package com.Arrays;

import java.util.Arrays;

public class LeftRotateArray {
	public static void LeftRotate(int ar[]) {
		int len = ar.length;
		int firstE = ar[len-1];
		for (int i = len - 1; i > 0; i--) {
			ar[i] = ar[i - 1];
		}
		ar[0] = firstE;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(ar));
		System.out.println("------------------------------");
		
		for (int i = 0; i<3; i++) {
			LeftRotate(ar);
			//System.out.println(Arrays.toString(ar));
		}
		System.out.println("------------------------------");
		System.out.println(Arrays.toString(ar));
	}

}
