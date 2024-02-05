package com.demoswitchcase;
import java.util.Scanner;
public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int choice;
		System.out.println("---amazon----");
		System.out.println("1.Men\n2.women\n3.kids");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("welcome to mens section");
			System.out.println("1.footware\n2.tshirt\n3.wallet");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("you selected footware");
				break;
			case 2:
				System.out.println("you selected tshirt");
				break;
			case 3:
				System.out.println("you selected wallet");
				break;
				
			default:
				System.out.println("invalid choice");
				
				
			}
			 break;
		case 2:
			System.out.println("welcome to womens section");
			System.out.println("1.jewellery\n2.saree\n3.bangles");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("you selected jewellery");
				break;
			case 2:
				System.out.println("you selected saree");
				break;
			case 3:
				System.out.println("you selected bangles");
				break;
				
			
				
				
			}
			 break;
		case 3:
			System.out.println("welcome to kids section");
			System.out.println("1.toys\n2.books\n3.colors");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("you selected toys");
				break;
			case 2:
				System.out.println("you selected books");
				break;
			case 3:
				System.out.println("you selected colors");
				break;
				
				
				
				
			}
		}

	}

}
