package com.Arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void ReverseNo(int ar[]) {
		int i;
		int j=ar.length-1;
		for(i=0;i<ar.length/2;i++) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			j--;
		}
		
		System.out.println(ar);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("enter element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
			
		}
		
		ReverseArray r1=new ReverseArray();
		r1.ReverseNo(ar);
	}

}
