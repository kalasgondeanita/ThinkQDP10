package com.Arrays;

public class FindMinMax {
	public static void MaxMin(int ar[]) {
		int min = ar[0];
		int max = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
				System.out.println("min num:" + min);
			} else if (ar[i] > max) {
				System.out.println("max num:" + max);

			}

		}

	}

	public static void main(String[] args) {
		int[] ar= {7,8,3,4,9};
		MaxMin(ar);

	}

}
