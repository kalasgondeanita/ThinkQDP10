package com.Arrays;

import java.util.Arrays;

public class SwapMinMax {
	public static void MinMaxSwap(int[] ar) {
		int max = ar[0];
		int min = ar[0];
		int maxindex=0;
		int minindex=0;
				
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
				maxindex=i;

			}
			if (ar[i] < min) {
				min = ar[i];
               minindex=i;
			}

		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);
		if (max != min) {
			int temp = ar[minindex];
			ar[minindex] = ar[maxindex];
			ar[maxindex] = temp;
		}

		//System.out.println(Arrays.toString(ar));

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6 };
		MinMaxSwap(ar);
		System.out.println(Arrays.toString(ar));
	}

}
