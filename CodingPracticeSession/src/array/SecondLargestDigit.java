package array;

public class SecondLargestDigit {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 90, 45, 67, 89};
        int secondLargest=findSecondLargest(arr);
        if(secondLargest==Integer.MIN_VALUE) {
        	System.out.println("There is no second largest value");
        }
        else {
        	System.out.println("Second largest value is: "+secondLargest);
        }
     
    }

    public static int findSecondLargest(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MAX_VALUE;
        for(int num: arr) {
        	if(num>largest) {
        		secondLargest=largest;
        		largest=num;
        	}
        	else if(num>secondLargest && num<largest) {
        		secondLargest=num;
        	}
        }
        return secondLargest;
    }
}
