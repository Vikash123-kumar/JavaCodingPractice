package array;

public class SumOfAllOddNumber {
//	 Write a Java program to find the sum of all odd numbers in an array.
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Sum of all odd number is: "+SumOfOdd(arr));
		
	}
	
	public static int SumOfOdd(int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
			}
		}
		return sum;
	}

}
