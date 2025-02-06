package array;

public class MissingNumber {
//	Find the Missing Number in an Array ( int[] arr = {1, 2, 3, 5}; Output: 4)
	 
	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 5};
		int missingValue=missingNumber(arr);
		System.out.println("Missing numbe is: "+missingValue);

	}
	
	public static int  missingNumber(int arr[]) {
		int start=0;
		int count=arr[start];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=count) {
				arr[start]=count; 
			}
			count++;
		}
		return arr[start];
	}

}
