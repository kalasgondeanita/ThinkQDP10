package com.Varagras;

public class RulesOfVeragas {
	//Rule1:we can have only 1 varags
	
	
	/*static void display(int...a,String...s) {
	}*/
	
	//Rule2:last argument in the method
	
	/*static void meth1(int n1,int...a,intn2) {
	}*/
	
	static void meth1(int n1,int n2,int...a) {
		System.out.println(n1);
		System.out.println(n2);
		for (int x:a) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
