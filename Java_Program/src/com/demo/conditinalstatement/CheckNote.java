package com.demo.conditinalstatement;
import java.util.Scanner;
public class CheckNote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n500,n200,n100,n50,n20,n10;
		int amount;
		 
		System.out.println("Enter the number");
		amount=	sc.nextInt();
		
		if(amount>500)
		{
		n500=amount/500;
		amount=amount-n500*500;
	}
		if(amount>200)
		{
		n200=amount/200;
		amount=amount-n200*200;
	}
		if(amount>100)
		{
		n100=amount/100;
		amount=amount-n100*100;
	}
		if(amount>50)
		{
		n50=amount/50;
		amount=amount-n50*50;
	}
		else
		{
			System.out.println("Enter valid note");
		}
		   System.out.println("notes of 500");
		   System.out.println("notes of 200");
		   System.out.println("notes of 100");
		   System.out.println("notes of 50");
		
		
	
		

	}

}
