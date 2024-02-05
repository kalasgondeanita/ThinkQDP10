package com.Arrays;

import java.util.Scanner;

public class SearchElement {
	static int i;
	public static boolean SearchEle(int ar[],int ele) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) {
				count++;
				return true;
			}
			
				
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int[]ar=new int[size];
		System.out.println("enter element");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("enter search element");
		int ele=sc.nextInt();
		SearchElement s1=new SearchElement();
		System.out.println(s1.SearchEle(ar,ele));
		}

	}


