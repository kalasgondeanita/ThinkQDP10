package com.demo.Practice;

public class PrimeOrNot {
	 int num;
	 int i;
	 public PrimeOrNot() {
		 num=11;
	 }
	 public PrimeOrNot(int num) {
		 this.num=num;
	 }
	 public boolean primeCheck() {
		 boolean flag=true;
		 for(i=2;i<=num/2;i++) {
			 if(num%i==0) {
				 flag=false;
				 break;
			 }
		 }
		 return flag;
	 }
	 public static void main(String[]args) {
		 PrimeOrNot obj=new PrimeOrNot(7);
				 if(obj.primeCheck())
					 System.out.println(obj.num+"is prime no");
				 else
					 System.out.println(obj.num+"is prime no");
					 
		 
	 
	 
	
	}

}
