package com.demo.Practice;

public class PlindromNo {
	int num;
	public PlindromNo() {
		num=122;
	}
	public PlindromNo(int num) {
		this.num=num;
	}
	public boolean CheckPalindrome() {
     	boolean flag=false; 
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum) {
			flag=true;
			 
			
		}
		return flag;
	}
	   
        

	
public static void main(String[] args) {
	PlindromNo obj=new PlindromNo();
	
	if(obj.CheckPalindrome())
		System.out.println("is a pallindrome no");
		
		else
			System.out.println("is not a pallindrome no");
			

	}

}
