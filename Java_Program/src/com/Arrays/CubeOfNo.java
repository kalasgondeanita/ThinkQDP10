package com.Arrays;

import java.util.Scanner;

public class CubeOfNo {
	static int i;
	public static void CubeEle(int ar[]) {
		for( i=0;i<ar.length;i++) {
			ar[i]=ar[i]*ar[i]*ar[i];
			System.out.println(ar[i]);
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[]ar=new int[size];
		System.out.println("enter element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		
		CubeOfNo c1=new CubeOfNo();
		
		c1.CubeEle(ar);
		

	}

}
