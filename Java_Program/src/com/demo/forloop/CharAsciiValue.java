package com.demo.forloop;
import java.util.Scanner;
public class CharAsciiValue {

	public static void main(String[] args) {
		int ch;
		System.out.println("alphabets from(a-z)are:");
		for(ch='a';ch<='z';ch++) {
			System.out.println(ch+ " "+(int)ch);
		}
		  System.out.println("------");
			int i;
			for(i=65;i<=122;i++) {
				System.out.println((char)i+ "   "+i);
			
		}
		
		

	}

}
