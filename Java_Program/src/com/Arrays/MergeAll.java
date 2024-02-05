package com.Arrays;

import java.util.Arrays;

public class MergeAll {
	static int[] MergeAll(int a1[], int a2[]) {
		int len1 = a1.length;
		int len2 = a2.length;
		int mar[] = new int[len1 + len2];
		int index = 0;// for the mar
		
		for (int i = 0; i < a1.length; i++) {
			mar[index++] = a1[i];
		}
		for (int i = 0; i < a2.length; i++) {
			mar[index++] = a2[i];
		}

		return mar;

	}

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5,6};
		int ar2[]= {11,12,13,14,15,16};
		
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		int mar[]=MergeAll(ar1,ar2);
	}

}
