package com.Arrays;

public class FindEvenOdd {
	static int i;

	public static void EvenOdd(int ar[]) {
		int[]evenar=new int[ar.length];
		int[]oddar=new int[ar.length];
		int indexEven=0;
		int indexOdd=0;
		
		for (i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
            evenar[indexEven++]=ar[i];
			}else {
				oddar[indexOdd++]=ar[i];

			}
			
				

		}
		System.out.println("even:"+ar.toString());
		System.out.println("odd:"+ar.toString());
	}

	public static void main(String[] args) {
		int ar[]= {78,85,56,45,85,77,88,66};
		EvenOdd(ar);
			
		}

	}


