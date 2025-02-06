package array;

import java.util.Arrays;

public class MoveAllZeros {
//	Write a Java program to move all the zeros in an array to the end without changing the relative order of the other element
	 
	public static void main(String[] args) {

		int arr[]= {1, 2, 4, 0, 8, 0, 0, 9};
		moveZeros(arr);
	}
	
	public static void moveZeros(int arr[]) {
		int start=0;
		int next=1;
		int end=arr.length-1;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		
		System.out.println("New Array after moving zero is: " +Arrays.toString(arr));
	}

}
