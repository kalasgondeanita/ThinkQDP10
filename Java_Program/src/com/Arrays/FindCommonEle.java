package com.Arrays;

import java.util.Arrays;

//Find the common elements between the two arrays
public class FindCommonEle {
	public static void CommonElement(int[] ar, int[] ar1) {
		int[] ar11 = new int[8];
		for (int i = 0; i < ar11.length; i++) {
			for (int j = 0; j < ar11.length; j++) {
				if (ar11[i] == ar11[j]) {
					int set.add(ar1[i]);
                    break;
					
				}

			}
		}
	}

	private static void add(int i) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		int[] ar = { 2, 3, 6, 5, 8 };
		int[] ar1 = { 6, 7, 2, 9, 4 };

		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar1));

		CommonElement(ar, ar1);

	}

}
