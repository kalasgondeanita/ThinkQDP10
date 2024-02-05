package com.whileloop;
import java.util.Scanner;
public class DigitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,rem;
		System.out.println("enter the number:");
		num=sc.nextInt();
		
		while(num!=0) {
			rem=num%10;
			num=num/10;
			System.out.println(rem+"next num:"+num);
			
		}

	}

}
