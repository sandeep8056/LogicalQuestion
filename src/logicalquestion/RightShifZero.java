package logicalquestion;

import java.util.Arrays;

public class RightShifZero {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 0, 5, 7, 0, 0, 3, 1, 0, 0 };

		System.out.println(Arrays.toString(shiftZeroRight(arr)));
		
	}

	public static int[] shiftZeroRight(int arr[]) {

		int counter = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[counter] = arr[i];
				counter++;
			}

		}

		while (counter < arr.length - 1) {
			arr[counter] = 0;
			counter++;
		}

		return arr;
	}
}
