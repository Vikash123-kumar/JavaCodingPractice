package string;

import java.util.Scanner;

public class FindFirstNonRepeatingCharacter {
	/**************************************************
	 * Date: 05/02/2025
	 * Question: Write a program to find the first non-repeating character in a string. If there is no non-repeating character, return null.
	 **************************************************** */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String str=scan.next();
		 String result = validate_nonRepeatingCharacter(str);
		 if (result != null) {
	            System.out.println("First Non-repeating character is: " + result);
	        } else {
	            System.out.println("No non-repeating character found.");
	        }
	}
	
	public static String  validate_nonRepeatingCharacter(String str) {
		for(int i=0; i<=str.length(); i++) {
			boolean isRepeated=false;
			for(int j=0; j<str.length(); j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					isRepeated=true;
					break;
				}
			}
			if(!isRepeated) {
				return String.valueOf(str.charAt(i));
			}
			
		}
		return null;
		
	}

}
