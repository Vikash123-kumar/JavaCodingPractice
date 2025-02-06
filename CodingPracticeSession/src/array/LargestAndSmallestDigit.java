package array;

import java.util.ArrayList;

public class LargestAndSmallestDigit {

	public static void main(String[] args) {
		int arr[]= {5, 8, 2, 4, 9, 7};
		int[] result=LargestAndSmallestDigit(arr);
		System.out.println("Largest digit is: "+result[0]);
		System.out.println("Smallest digit is: "+result[1]);
	}
	
	public static int[] LargestAndSmallestDigit(int[] arr) {
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		return new int[] {largest, smallest};
	}

}
