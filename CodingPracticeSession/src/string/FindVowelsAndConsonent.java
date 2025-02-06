package string;

public class FindVowelsAndConsonent {
	/**************************************************
	 * Date: 05/02/2025
	 * Question: Write a program to count the number of vowels and consonants in a given string.
	 **************************************************** */
	public static void main(String[] args) {
		String str="Hello World1";
		str=str.replaceAll("[//s//d]", "");
		validate_vowelsAndConsonent(str);

	}
	public static void validate_vowelsAndConsonent(String str) {
		str=str.toLowerCase();
		int vowels=0;
		int consonent=0;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' ||  str.charAt(i)=='o') {
				vowels++;
			}
			else {
				consonent++;
			}
		}
		System.out.println("Total vowel in String is: "+vowels);
		System.out.println("Total consonent in String is: "+consonent);
	}

}
