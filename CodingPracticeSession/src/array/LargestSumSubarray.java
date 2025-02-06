package array;

public class LargestSumSubarray {
//	Write a Java program to find the largest sum contiguous subarray (using Kadane's algorithm).
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr ={-2, 2, -3, 4, -1, 2, 1, -5, 4};
//		 {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int result = findLargestSumSubarray(arr);
	        System.out.println("Largest sum of contiguous subarray is: " + result);
	    }

	    public static int findLargestSumSubarray(int[] arr) {
	        // Initialize the variables
	        int maxSum=arr[0];
	        int maxSubArray=arr[0];
	        for(int i=1; i<arr.length; i++) {
	        	maxSubArray=Math.max(arr[i], maxSubArray+arr[i]);
	        	maxSum=Math.max(maxSum, maxSubArray);
	        	
	        }
	        return maxSum;
	    }
	}
