package com.Arrays;

import java.util.Arrays;

public class HalfSorting {
	public static void HalfSort(int ar[]) {
		for (int i = 0; i < ar.length/2; i++) {
			for (int j = i + 1; j < ar.length / 2; j++) {
				if (ar[j] < ar[i]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int  i = ar.length/2;i>=0; i--) {
			for (int j = ar.length; j < ar.length / 2; j--) {
				if (ar[j] > ar[i]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}

	}
		//System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int ar[] ={7,6,5,2,3,1,0};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(ar));
		
		HalfSort(ar);
		
		System.out.println("after sorting");
		System.out.println(Arrays.toString(ar));

	}

}
