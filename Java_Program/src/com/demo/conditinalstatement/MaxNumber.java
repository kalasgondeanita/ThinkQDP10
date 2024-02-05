
package com.demo.conditinalstatement;
import java.util.Scanner;
public class MaxNumber {

	    public static void main(String[] args) {
	    	
	    	
	    	
	    	
	    	
		Scanner sc=new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Enter first no");
        num1=sc.nextInt();
        System.out.println("Enter second no");
        num2=sc.nextInt();
        System.out.println("Enter third no");
        num3=sc.nextInt();
        
        if(num1>num2 && num2>num3)
        {
        	System.out.println("num1 is greater");
        }
        else if(num2>num1 && num1>num3)
        {
        	System.out.println("num2 is greater");
        }
        else
        {
        	System.out.println("num3 is greater");
        }
      }
  }
        

	


