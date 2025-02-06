package array;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestDigitWithoutSorting {
//	Write a Java program to find the k-th largest element in an array without sorting the array.
	public static void main(String[] args) {
		int arr[]= {3, 4, 7, 2, 8, 9};
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println("Enter Kth value: "+num);
		System.out.println(findKthLargestNumber(arr, num));
	}
	
	public static int findKthLargestNumber(int arr[], int num) {
		//Priority queue is part of java.util which works on Concept of FIFO
		PriorityQueue<Integer> minHeap=new PriorityQueue();
		for(int n: arr) {
			//add elements into heap
			minHeap.add(n);
			//remove smallest element if the size of the heap exceeds 'k'
			if(minHeap.size()>num) {
				minHeap.poll();
			}
		}
		//The root of the heap is the k-th largest element
		return minHeap.peek();
		
	}

}
