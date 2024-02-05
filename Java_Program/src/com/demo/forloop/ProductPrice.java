package com.demo.forloop;
import java.util.Scanner;
public class ProductPrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int quantity;
		int price;
		int total;
		System.out.println("enter quantity:");
		quantity=sc.nextInt();
		
		if(quantity>=50) {
			price=quantity*100;
			System.out.println("total:"+price);
		}
		
		else if(quantity<=50){
			price=quantity*125;
			System.out.println("total:"+price);
		}
		else if(quantity>=30) {
			price=quantity*140;
			System.out.println("total:"+price);
		}
		

	}

}
