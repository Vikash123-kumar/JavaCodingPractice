package array;

public class PalindromeCheckForArray {
// Check if an Array is a Palindrome  (int[] arr = {1, 2, 3, 2, 1}; output: true)	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 2};
		if(palindromeCheck(arr)) {
			System.out.println("Given array is palindrome");
		}else{
			System.out.println("Given array is not palindrome");
		}
	}
	
	public static boolean palindromeCheck(int arr[]) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			if(arr[left]!=arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
