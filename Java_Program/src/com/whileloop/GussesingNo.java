package com.whileloop;
import java.util.Scanner;
public class GussesingNo {
	public static void GussesingNo(int num) {
		Scanner sc=new Scanner(System.in);
		
		
		int guess=50;
		int count=0;
		while(num>0) {
			if(num<50) {
				System.out.println("less number plz try bigger number");
				num=sc.nextInt();
			}
			else if(num>50) {
					System.out.println("high number plz try smaller  number");
					num=sc.nextInt();
			}
			else if(num==50){
						System.out.println("congrates!!! you guess correct no");
						//num=sc.nextInt();
						break;
					}
			      count++;
			}
		        System.out.println("count:"+count);
			}
				
				
		
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("enter number:");
	num=sc.nextInt();
	
	GussesingNo(num);

	}

}
