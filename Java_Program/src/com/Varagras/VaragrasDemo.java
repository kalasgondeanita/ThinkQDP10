package com.Varagras;

public class VaragrasDemo {
	public static void VaragrasEx(int ar[]) {
		for(int x:ar) {
			int sum = x;
		}
		System.out.println("sum is:"+sum);
	}
      //ellipsis....
	static void FindSum(int...ar) {
		int sum=0;
		for(int x:ar) {
			sum+=x;
		}
		System.out.println("sum is:"+sum);
	}
	public static void main(String[] args) {
		int ar1[]= {2,3};
		int ar2[]= {2,3,4};
		int ar3[]= {1,0,7,8,4};
		
		VaragrasEx(ar1);
		VaragrasEx(ar2);
		VaragrasEx(ar3);
		
	}

}
