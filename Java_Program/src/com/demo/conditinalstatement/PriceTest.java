package com.demo.conditinalstatement;
import java.util.Scanner;
public class PriceTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int quant;
		int product;
		int result;
		
		System.out.println("enter the quantity:");
		quant=sc.nextInt();
		System.out.println("enter productprice:");
		product=sc.nextInt();
		
		System.out.println("enter the result:");
		result=sc.nextInt();
		
		result=product*quant;
		System.out.println("result:"+result);
		

	}

}
