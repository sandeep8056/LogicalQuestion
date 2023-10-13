package logicalquestion;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,1,2,3,4,2,5,6,7};
		
		findDuplicateNumber(arr);
			
	}
	
	public static void findDuplicateNumber(int[] arr) {
		
		//int[] = {1,2,3,1,2,3,4,2,5,6,7};
		
		for(int i =0 ;i<arr.length-1;i++) {
			
			for(int j =i+1;j<arr.length;j++) {
			if(arr[i] == arr[j]) {
				System.out.println(arr[i] );
			}
			}
			
		}
	}
	
	
	public static HashSet<Integer> Duplicate(int[] arr) {
		
		HashSet<Integer> uniqueNumber = new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		
		for(int i =0;i<arr.length;i++) {
			
			if(!uniqueNumber.add(arr[i])) {
				duplicate.add(arr[i]);
			}
		}
		
		return duplicate;
		
	}

}
