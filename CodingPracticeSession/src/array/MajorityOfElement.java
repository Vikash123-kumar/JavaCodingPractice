package array;

public class MajorityOfElement {

	public static void main(String[] args) {
		int arr[]=  {3, 3, 4, 2, 4, 4, 2, 4, 4, 3, 3, 3, 3};
		majorityOfElement(arr);

	}
	
	public static void majorityOfElement(int arr[]) {
		int newCount=0;
		int num=0;
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
			if(count>newCount) {
				newCount=count;
				num=arr[i];
			}
		}
		System.out.println("Count of: " +num+ " is: "+newCount);
	}

}
