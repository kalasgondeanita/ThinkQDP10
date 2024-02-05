package com.demo.conditinalstatement;
import java.util.Scanner;
public class ProductPrice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 double product=50;
		 int quant;
		 int dis;
		 System.out.println("Enter the quantity");
		 quant=sc.nextInt();
		 
		 if(quant<=10) {
			 quant=quant*50;
			 System.out.println("total");
			 System.out.println("no discount");
		 }
		 else if(quant>10 && quant<=25) {
			 quant=quant*50;
			 dis=quant*2/100;
			 System.out.println("total");
			 System.out.println("2% discount");
			 
		 }
		 else if(quant>25 && quant<=50) {
			 dis=quant*6/100;
			 System.out.println("total");
			 System.out.println("6% discount");
		 }
		 else if(quant<50 && quant>=20) {
			 dis=quant*10/100;
			 System.out.println("total");
			 System.out.println("10% discount");
			 
		 }
		 //else if(quant<20 && quant>=30) {
			// dis=quant*10/100;
			 //System.out.println("total");
			 //System.out.println("10% discount");
			 
			 
		 }
	
			 
			 
			 
}		 
			 
			 
		 
		   
		

	


