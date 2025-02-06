package string;

import java.util.Scanner;

public class ReverseString {
	/**************************************************
	 * Date: 05/02/2025
	 **************************************************** */
//	Write a program to reverse a string without using any in-built reverse functions.(Input: "hello" Output: "olleh")
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str=scan.next();
		String reversedString=reverseGivenString(str);
		System.out.println("Reverse String is: "+reversedString);

	}
	
	public static String reverseGivenString(String str) {
		String reversed="";
		for(int i=str.length()-1; i>=0; i--) {
			reversed+=str.charAt(i);
		}
		return reversed;
	}

}
