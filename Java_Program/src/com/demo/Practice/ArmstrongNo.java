package com.demo.Practice;

public class ArmstrongNo {
	int num;
	public ArmstrongNo() {
		num=370;
	}
	public ArmstrongNo(int num) {
		this.num=num;
	}
	public boolean CheckArmstrong() {
		boolean flag=false;
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum) {
			flag=true;
		}
		return flag;
	}
	

	public static void main(String[] args) {
		ArmstrongNo obj=new ArmstrongNo();
		if(obj.CheckArmstrong())
			System.out.println("num is armstrong no");
		else
			System.out.println("num is not armstrong no");
			

	}

}
