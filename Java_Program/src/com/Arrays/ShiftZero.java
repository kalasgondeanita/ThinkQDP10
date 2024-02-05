package com.Arrays;

public class ShiftZero {
	public static void ToShiftZero(int[] ar) {

		for (int i = 0; i < ar.length; i++) {

			for (int j = ar.length - 1; j >= 0; j--) {

				if (ar[i] != 0 && i < j) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[]ar= {0,1,0,2,0,3,0,4};
		ToShiftZero(ar);
	
		

	}
}
