package com.Arrays;

import java.util.Arrays;

public class SeperateNegativePositive {
//at the end:negativeegative
	public static void shiftNegative(int ar[]) {
		int left = 0;
		int right = ar.length - 1;
		while (left < right) {
			while (ar[left] > 0 && left < right)
				left++;
			while (ar[right] < 0 && left < right)
				right++;
			if (left < right) {
				int temp = ar[left];
				ar[left] = ar[right];
				ar[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void shiftNagative2(int ar[]) {
		for (int i = 1; i < ar.length; i++) {
			for (int j = ar.length - 1; j >= 0; j--) {
				if (ar[i] < 0 && i < j) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int ar[] = { 3, 4, -1, 6, -7, 8, -5, 2, 9 };
		System.out.println(Arrays.toString(ar));
		shiftNegative(ar);

		System.out.println(Arrays.toString(ar));
		shiftNagative2(ar);

	}

}
