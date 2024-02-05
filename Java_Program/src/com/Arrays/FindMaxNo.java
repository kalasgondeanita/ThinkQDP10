package com.Arrays;
import java.util.Scanner;
public class FindMaxNo {
	static int i;
	public static void MaxEle(int ar[]) {
		int max =0;
		for (i=0;i<ar.length;i++) {
			
			if(ar[i]>max) {
				max=ar[i];
				
			}
			System.out.println("max no in array:"+max);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[]ar=new int [size];
		System.out.println("enter element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		FindMaxNo f1=new FindMaxNo();
		f1.MaxEle(ar);

	}

}
