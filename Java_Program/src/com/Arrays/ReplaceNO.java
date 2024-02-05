package com.Arrays;

public class ReplaceNO {
	static void ReplaceEle(int arr[], int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr[i] = 0;
			}
		}

	}

	public static void main(String[] args) {
   
	}

}
