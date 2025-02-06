package array;

import java.util.Arrays;

public class ReverseAnArray {
//Reverse an Array (int[] arr = {1, 2, 3, 4, 5};  Output: [5, 4, 3, 2, 1])
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		reverseArray(arr);
    }

    // Method to reverse the array
    public static void reverseArray(int[] arr) {
    	int start=0;
    	int end=arr.length-1;
    	while(start<end) {
    		int temp=arr[start];
    		arr[start]=arr[end];
    		arr[end]=temp;
    		start++;
    		end--;
    	}
    	System.out.println("Reverse of given array is: "+Arrays.toString(arr));
    }

}
