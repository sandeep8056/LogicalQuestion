package logicalquestion;

import java.util.Arrays;

public class ShiftZeroLeft {
	public static void main(String[] args) {
		
		int[] arr = { 1, 3, 0, 5, 7, 0, 0, 3, 1, 0, 0 };
		System.out.println(Arrays.toString(shiftLeftZeor(arr)));
	}
	
	
	public static int[] shiftLeftZeor(int[] arr) {
		
		int counter = arr.length-1;
		
		for(int i = arr.length-1;i>=0;i--) {
			
			if(arr[i] != 0) {
				arr[counter] = arr[i];
				counter--;
			}
			
		}
		
		while(counter>=0) {
			arr[counter] =0;
			counter--;
		}
		return arr;
	}
}
