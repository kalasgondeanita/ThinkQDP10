package com.demoswitchcase;
import java.util.Scanner;
public class AirlinesTicketBooking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=0; 
		int coupan=0;
		String name;
		int choice;
		String boarding_place = null;
		String dis = null;
		
		System.out.println("enter name");
		 name =sc.next();
		System.out.println("welcome to airlines");
		System.out.println("1.luftanza\n2.airindia\n3.indigo");
		System.out.println("enter your coice");
		 choice=sc.nextInt();
		
		
		switch( choice)
		{
			case 1:{
				System.out.println("enter boarding place");
				boarding_place=sc.next();
				System.out.println("enter your distination place");
				dis=sc.next();
				System.out.println("amount willbe 2000");
				System.out.println("do you have coupan 1 yes 0 no");
				coupan=sc.nextInt();
				
		
		if(coupan==1) {
			System.out.println("discount offer is 25%on your amount");
		  amount=(int) (amount-(amount*0.25));
		  
		
		
		}
		  System.out.println("total amount is:+amount");
		  break;
			}
	
            case 2:{
	             System.out.println("enter boarding place");
	             boarding_place=sc.next();
	             System.out.println("enter your distination place");
	             dis=sc.next();
	             System.out.println("do you have coupan 1 yes 0 no");
			     coupan=sc.nextInt();
		
					
			
			if(coupan==1) {
				System.out.println("discount offer is 50%on your amount");
			 amount=(int) (amount-(amount*0.50));
			}
			break;
}
		}	
			
          
			  System.out.println(name+"ticket booked from"+boarding_place+"to"+dis);
			  
			
			
		
		
}
}

	

