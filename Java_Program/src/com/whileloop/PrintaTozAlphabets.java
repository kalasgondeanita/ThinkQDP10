package com.whileloop;

public class PrintaTozAlphabets {
	public static void PrintAlphabets() {
		char ch='A';
		
		while(ch<='Z') {
			System.out.println(ch);
			ch++;
		}
	}

	public static void main(String[] args) {
		PrintAlphabets();

	}

}
