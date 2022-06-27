package com.dogussaglam;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		// kullanıcıdan palindrom adında kelime aldık
		// daha sonra reversePalindrom şeklinde tersi eşit mi diye bir string oluşturduk
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please write your word");
		String palindrom = sc.nextLine();
		String reversePalindrom = "";
		
		for (int i = palindrom.length() - 1; i >= 0; i--) {
			reversePalindrom += palindrom.charAt(i);
		}
		
		if (palindrom.equals(reversePalindrom)) {
			System.out.println("yes it is a palindrome");
		} else {
			System.out.println("no it is not a palindrome");
		}
		
	}
	
}
