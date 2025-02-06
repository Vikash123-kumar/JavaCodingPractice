package array;

import java.util.Arrays;

public class KthLargestDigit {
//	Write a Java program to find the k-th largest element in an array.
	public static void main(String[] args) {
		int arr[]= {2, 5, 7, 8, 9, 6};
		int k=1;
		int result=LargestDigit(arr, k);
		System.out.println("Required Largest Digit is: "+result);

	}
	
	public static int LargestDigit(int arr[], int k) {
		int result=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			result=arr[arr.length-k];
		}
		return result;
	}

}
