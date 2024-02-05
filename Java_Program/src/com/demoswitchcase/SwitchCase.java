package com.demoswitchcase;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 int choice;
		 System.out.println("-----welcome to my cafe----");
		 System.out.println("1.tea\n2.coffee\n3.cold drink\n");
		 System.out.println("Enter your choice:");
		 choice=sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 System.out.println("tea for rs 30");
			 break;
		 case 2:
			 System.out.println("coffee for rs 100");
			 break;
		 case 3:
			 System.out.println("sandwitch for rs 200");;
			 break;
			 default:
				 System.out.println("this optioni not available");
				 
		 }

	
	}
}





