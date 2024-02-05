package com.demo.Practice;

public class Pattern4 {
	public static void PrintPattern(int n) {
		char ch='A';
		int i;
		int j;
		for(i=1;i<=4;i++) {
		     ch='A';
			for(j=1;j<i;j++) {
				System.out.print(ch+"");
			      ch++;
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		PrintPattern(5);

	}

}








/*  A
    B C
    D E F
    G H I J */ 







