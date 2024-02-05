
package com.basic;
import java.util.Scanner;
public class CheckVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
	    System.out.println("Enter the alphabet");
		ch=sc.next().charAt(0);
		
		
		if (ch == 'a' || ch== 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
		
			System.out.println("is vowel");
		}else {
	            System.out.println(" is consonant");
		
		
		
		
		

	}

}
}
