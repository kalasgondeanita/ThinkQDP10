package com.Arrays;

import java.util.Arrays;

public class FindSecondMinNo {
	public static int SecondMinNo(int ar[]) {

		int min = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				secondmin = min;
				min = ar[i];
			} else if (ar[i] < secondmin) {
				secondmin = ar[i];
			}
		}
		return secondmin;

	}

	public static void main(String[] args) {
		int ar[] = { 5, 3, 7, 4, 2 };

		System.out.println(Arrays.toString(ar));
		int sm = SecondMinNo(ar);
		System.out.println("SecondMin Number is:" + sm);

	}

}
