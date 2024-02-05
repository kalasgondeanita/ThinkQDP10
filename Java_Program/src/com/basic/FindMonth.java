package com.basic;
import java.util.Scanner;
public class FindMonth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int months;
		System.out.println("enter months no:");
		months=sc.nextInt();
		if(months>=1 && months<=12) {
			if(months==1|| months==3||months==5||months==7||months==8||months==10||months==12)
				System.out.println(":total days are 31");
			else if (months==4||months==6||months==9||months==11)	
				System.out.println(":total days 30");
			else if(months==2)
				System.out.println(":this months total days are 28");
		
		}
		

	}

}
