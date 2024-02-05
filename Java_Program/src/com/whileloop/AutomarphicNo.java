package com.whileloop;

import java.util.Scanner;

public class AutomarphicNo {
	public static void AutomarphicNo(int num) {
		int count=0;
		double pow;
		
		int square=num*num;
		int temp=num;
		int automarphic;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		System.out.print("count:" +count);
		pow=Math.pow(10, count);
		System.out.print("pow:" +pow);
		
		if(square%pow==temp){
			System.out.println("number autopharphic");
		}
		else {
			System.out.println("number not autopharphic");
		}
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter no:");
		num=sc.nextInt();
		
		AutomarphicNo(num);
	}

}
