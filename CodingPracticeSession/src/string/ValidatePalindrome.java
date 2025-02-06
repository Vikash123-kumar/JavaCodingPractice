package string;

import java.util.Scanner;

public class ValidatePalindrome {
	/**************************************************
	 * Date: 05/02/2025
	 * Question: Write a program to check whether a given string is a palindrome. A palindrome is a word that reads the same forward and backward.
	 **************************************************** */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println("Is given String palindrome: "+checkPalindrome(str));

	}
	public static boolean checkPalindrome(String str) {
		String reversed="";
		for(int i=str.length()-1; i>=0; i--) {
			reversed+=str.charAt(i);
		}
		if(reversed.equals(str)) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
