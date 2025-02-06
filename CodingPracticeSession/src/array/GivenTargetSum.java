package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GivenTargetSum {
//	Write a Java program to find all pairs in an array whose sum equals a given target.
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        
        findPairsWithTargetSum(arr, target);
	}
	
	public static void findPairsWithTargetSum(int[] arr, int target) {
//		Set<Integer> seen= new HashSet<>();
		List<Integer> seen = new ArrayList();
		for(int num: arr) {
			int complement=target-num;
			if(seen.contains(complement)) {
				System.out.println("Output: ("+complement+ ","+num+")");
			}
			seen.add(num);
		}
	}

}
