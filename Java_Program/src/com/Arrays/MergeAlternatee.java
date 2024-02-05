package com.Arrays;

import java.util.Arrays;

public class MergeAlternatee {
	static int[]MergeAlternateSkip(int a1[],int a2[]){
		int len1=a1.length;
		int len2=a2.length;
		int maxLength=Math.max(len1, len2);
		int mar[]=new int[maxLength];
		int index=0;
		while(index<maxLength) {
			if(i<a1.length) {
				mar[index++]=a1[i++];
			}
			if(i<a2.length) {
				mar[index++]=a2[i++];
			}
			
		}
		return mar;
	}

	public static void main(String[] args) {
		int ar1[] = { 6,7,12,5 };
		int ar2[] = { 10,20,30,40,90,100};

		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		int mar[] = MergeAlternateSkip(ar1, ar2);
		
		System.out.println("after complete merge alternate:");
		System.out.println(Arrays.toString(m));

		
       int mar1[] = MergeAlternateSkip(ar1, ar2);
		
		System.out.println("after complete merge alternate:");
		System.out.println(Arrays.toString(m));

		
        int mar2[] = MergeAlternateSkip(ar1, ar2);
		
		System.out.println("after complete merge alternate:");
		System.out.println(Arrays.toString(mar2));
        
	}

}
