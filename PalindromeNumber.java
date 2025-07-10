package com.FiArPa;

import java.util.Scanner;

public class PalindromeNumber {
	
	public void doPalindrome(int num) {
		int original = num;
		int reverse = 0 ;
		while(num != 0 ) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num/10;
		}
		if (original == reverse) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		PalindromeNumber p = new PalindromeNumber();
		p.doPalindrome(num);
		
		sc.close();
	}

}
