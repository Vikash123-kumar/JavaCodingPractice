package string;

public class CompressString {

	/**************************************************
	 * Date: 05/02/2025
	 * Question: Write a program to compress a string using the counts of repeated characters. For example, "aabbbcccc" becomes "a2b3c4". If the compressed string is longer than the original string, return the original string
	 **************************************************** */
	public static void main(String[] args) {
		String str="aaabbsss";
		System.out.println("Compressed String is: "+Validate_CompressedString(str));

	}
	
	public static String Validate_CompressedString(String str) {
		StringBuilder compressed=new StringBuilder();
		int count=1;
		for(int i=0; i<str.length(); i++) {
			if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else {
				compressed.append(str.charAt(i));
				if(count>1) {
					compressed.append(count);
				}
				count=1;
			}
		}
		if(str.length()<=compressed.length()) {
			return str;
		}
		return compressed.toString();
	}

}
