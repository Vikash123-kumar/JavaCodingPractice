package array;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int arr[]=  {1, 2, 2, 3, 1, 4, 5, 1};
		countOfEachElement(arr);

	}
	
	public static void  countOfEachElement(int[] arr) {
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
				}
			}
			System.out.println("Count of "+arr[i]+ " is: "+count);
		}
	}

}
