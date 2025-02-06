package array;

public class SecondSmallestDigit {
//Find the Largest and Smallest Number in an Array (int[] arr = {5, 1, 9, 3, 7, 6};  Output: Largest: 9  Smallest: 1)
	public static void main(String[] args) {
		int arr[]= {2, 7, 1, 3, 5, 8, 1, -1, -1};
		int result=SecondSmallestDigit(arr);
		System.out.println("Second Smallest number is: "+result);
		
	}
	public static int SecondSmallestDigit(int[] arr) {
		int smallest=arr[0];
		int secondSmallest=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
		}
		return secondSmallest;
	}
}
