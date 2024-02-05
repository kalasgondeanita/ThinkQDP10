package com.basic;
import java.util.Scanner;
public class VolumeOfSphere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double radius,pi=3.14,volume;
		System.out.println("enter the radius:");
		radius=sc.nextDouble();
		
		volume=4/3*pi*radius*radius;
		System.out.println("volume of sphere:");
		
		

	}

}
