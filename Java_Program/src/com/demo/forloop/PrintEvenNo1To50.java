package com.demo.forloop;
import java.util.Scanner;
public class PrintEvenNo1To50 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println(i+"is even");
			}
			else {
				System.out.println(i+" is odd");
			}
		}

	
	}
}

