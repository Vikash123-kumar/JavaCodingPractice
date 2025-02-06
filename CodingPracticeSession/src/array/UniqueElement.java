package array;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {

	public static void main(String[] args) {
		int arr[]= {1, 2, 4, 5, 6, 3, 4, 6};
		int unique[]=findUniqueElement(arr);
		for(int i: unique) {
			System.out.println(i+ " ");
		}
	}
	
	public static int[] findUniqueElement(int arr[]) {
		List<Integer> unique=new ArrayList();
		for(int i=0; i<arr.length; i++) {
			boolean alreadyCounted=false;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					alreadyCounted=true;
					break;
				}
			}
			if(alreadyCounted) {
				continue;
			}
			int count=1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
			if(count==1) {
				unique.add(arr[i]);
			}
		}
		int uniqueElement[]=new int[unique.size()];
		for(int i=0; i<unique.size(); i++) {
			uniqueElement[i]=unique.get(i);
	
		}
		return uniqueElement;

	}
	
	

}
