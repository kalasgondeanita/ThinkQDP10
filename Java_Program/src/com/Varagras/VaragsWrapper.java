package com.Varagras;

public class VaragsWrapper {
	//promoted to parent class
	public static void display(Object...s) {
		System.out.println("in object");
		for(Object st:s) {
			System.out.println(st);
		}
	}
	public static void display(Number...s) {
		System.out.println("in number");
		for(Number st:s) {
			System.out.println(st);
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
