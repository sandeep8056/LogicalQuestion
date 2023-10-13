package MechCode;

import java.util.ArrayList;
import java.util.List;

public class PairsProblem {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		List<String> s = pair(arr,4);
		
		s.forEach(m -> System.out.println(m));
		
	}
	
	public static List<String> pair(int[] arr,int target) {
		
		List<String> str = new ArrayList<>();
		for(int i =0;i<=arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i] +arr[j] == 9) {
					str.add(arr[i] +" + "+arr[j] + " = " + target);
				}
			}
		}
		
		return str;
	}
	
}
