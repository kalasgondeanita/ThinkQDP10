package com.demo.Practice;
import java.util.Scanner;
public class Pattern3 {
	public static void PrintPattern(int n) {
		int i;
		int j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
			for(i=1;i<=4;i++) {
				for(j=4;j>=i;j--) {
					System.out.print("* ");
			}
				System.out.println("");
			
		}
		
	}
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n;
	
		PrintPattern(5);

	}

}




/** * * * *
* * * *
* * *
* *
*
*
* *
* * *
* * * *
* * * * **/









