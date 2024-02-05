package com.demo.Practice;

public class Pattern1 {
	public static void Printpattern(int n) {
	int i;
	int j;
	for(i=4;i>=1;i--) {
		for(j=1;j<=i;j++) {
			System.out.print("# ");
		}
		System.out.println();
	}
		
	}

	public static void main(String[] args) {
		Printpattern(5);

	}

}
