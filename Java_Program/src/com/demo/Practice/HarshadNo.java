package com.demo.Practice;

public class HarshadNo {
	int num;
	public HarshadNo() {
		num=378;
	}
	public HarshadNo(int num) {
		this.num=num;
	}
	public boolean CheckHarshadNo() {
		boolean flag=false;
		int rem;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(num%sum==0) {
			flag=false;
			
		}
			return  flag;
			
			
		}
	

	public static void main(String[] args) {
		HarshadNo obj=new HarshadNo();
		//System.out.println("enter the no:");
		if(obj.CheckHarshadNo())
			System.out.println(" is harshad no");
		else
			System.out.println( "is not harshad no");
			
			
			

	}

}
