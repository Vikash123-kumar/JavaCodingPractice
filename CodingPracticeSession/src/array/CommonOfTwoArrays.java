package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonOfTwoArrays {
//	Write a Java program to find the intersection of two arrays
	public static void main(String[] args) {
		int arr1[]= {2, 4, 6, 7};
		int arr2[]= {4, 7, 8};
		System.out.println("Intersection of two array is: "+Arrays.toString(interSectionOfTwoArrays(arr1, arr2)));
	}
	
	public static int[] interSectionOfTwoArrays(int arr1[], int arr2[]) {
		List<Integer> interSectionList= new ArrayList();
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					interSectionList.add(arr1[i]);
					break;
				}
			}
		}
		int[] interSectionArray= new int[interSectionList.size()];
		for(int i=0; i<interSectionList.size(); i++ ) {
			interSectionArray[i]=interSectionList.get(i);
		}
		return interSectionArray;
	}

}
