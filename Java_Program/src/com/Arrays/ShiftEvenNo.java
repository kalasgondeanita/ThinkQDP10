package com.Arrays;

import java.util.Arrays;

public class ShiftEvenNo {
	public static void EvenNoShifting(int[] ar) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = ar.length - 1; j >= 0; j--) {
				if (ar[i] % 2 == 0) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}

		// stem.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3,4,5};
		System.out.println(Arrays.toString(ar));
		EvenNoShifting(ar);
		
		System.out.println(Arrays.toString(ar));

	}

}
