package com.Arrays;

import java.util.Arrays;

//Delete all the duplicate elements from  array
public class DuplicateEle {
	public static void DuplicateElement(int[] ar) {
		int count;
		boolean status;

		for (int i = 0; i < ar.length; i++) {
			count = 1;
			status = false;

			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					if (ar[i] == ar[j]) {
						status = true;
						break;
					}
				}
				if (status == false) {
					for (int k = i + 1; k < ar.length; k++) {
						if (ar[i] == ar[k])
							count++;
					}
					if (count > 1) {
						System.out.println(ar[i]);
					}
				}
			}

		}
	}
	

	public static void main(String[] args) {
		int []ar= {1,2,3,1,5,3,6,7,8,2};
		System.out.println(Arrays.toString(ar));
		
		DuplicateElement(ar);
		
	}

}
