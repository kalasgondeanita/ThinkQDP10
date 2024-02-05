package com.demo.forloop;
import java.util.Scanner;
public class GuessingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		  int  guess=0;
		  int ans=20;
		 
		  for(;;) {
		  System.out.println("enter the guessing the number:");
		  guess=sc.nextInt();
		  if(guess==ans) {
			  break;
			  
		  }else if(guess>ans) {
			  System.out.println("enter low no");
		  }else if(guess<ans) {
			  System.out.println("enter high no");
		  }
			  
		}
	
	
	    System.out.println("congratulations you guessed it correctly");
             }
        }



	    
		  


		 
		  
		 
		  
		  
		  
		  
	


