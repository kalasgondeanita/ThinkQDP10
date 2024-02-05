package com.whileloop;
import java.util.Scanner;
public class FindHarshadNo {
	public static int FindHarshadNo(int num) {
	int rem;
	int result=0;
		while(num!=0) {
			rem=num%10;
			result=result+rem;
					num=num/10;
			
			
	}
	if(num%result==0) {
		return result;
		}else {
			return 0;
		}
	}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter  no:");
		num=sc.nextInt();
		
		 System.out.println(FindHarshadNo(num));
		

	}

}
