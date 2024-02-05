package com.Arrays;

public class SearchEle {
	static boolean searchElement(int ar[], int ele) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == ele)
				return true;
		}
		return false;
	}

	static void searchElementOccurences(int ar[], int ele) {
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			flag = true;
			System.out.println("position:" + i);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 4, 5, 7, 6, 4, 1, 0 };
		if (searchElement(arr, 9)) {
			System.out.println("element found");
		} else {
			System.out.println("element not found");
		}
		System.out.println("--------------------------");
		searchElementOccurences(arr,6);

	}

}
