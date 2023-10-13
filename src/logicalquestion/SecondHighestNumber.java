package logicalquestion;

import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,6,7,8,9,8 };

		System.out.println("Second Highest : " + secondHighestNumber(arr));
//		System.out.println("Second Highest : " + thirdHighestNumber(arr[0]));
		
		
		System.out.println(Arrays.toString(thirdHighestNumber(arr)));
		int a[] = thirdHighestNumber(arr);
		System.out.println("second highest "+a[0]);
		System.out.println("third highest" +a[1]);
		
		//System.out.println(secondHihestNumber(arr));
	}

	public static int secondHighestNumber(int[] num) {

		int highestNumber = num[0];
		int secondHighest = num[0];

		for (int i = 0; i < num.length; i++) {

			if (highestNumber < num[i]) {
				secondHighest = highestNumber;
				highestNumber = num[i];
			} else if (secondHighest < num[i] && num[i] != highestNumber) {
				secondHighest = num[i];
			}
		}

		return secondHighest;
	}
	
	
	
	public static int[] thirdHighestNumber(int[] num) {
		
		int highest= num[0];
		int secondhighest = num[0];
		int thirdHighest = num[0];
		
		for(int i =0;i<num.length;i++) {
			
			if(highest < num[i]) {
				thirdHighest = secondhighest;
				secondhighest = highest;
				highest=num[i];
			}else if(secondhighest< num[i] && num[i] != highest) {
				secondhighest = highest;
				highest = num[i];
			}else if(thirdHighest < num[i] && num[i] != highest && num[i] != secondhighest) {
				thirdHighest = num[i];
			}
			
		}
		
		
		return new int[] {secondhighest,thirdHighest};
	}
	
}
