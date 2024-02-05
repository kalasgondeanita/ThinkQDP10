package com.demo.forloop;

public class TesstMethod {
	public static void PrintName() {
		int i;
		for(i=1;i<=5;i++) {
			//System.out.println("hello")
			System.out.println(i);
			}//end of loop
		System.out.println("i:"+i);
	}
	
	public static void ReverseLoop() {
		int i;
		for(i=5;i>=1;i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		PrintName();
		ReverseLoop();

	}

}
