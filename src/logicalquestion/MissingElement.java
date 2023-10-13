package logicalquestion;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5};
		
		System.out.println(missingElement(arr));
		
	}
	
	public static int missingElement(int[] arr) {
		
		int sum =0;
		for(int a : arr) {
			sum+=a;
		}
		
		int n = arr.length;
		
		int s = n*(n+1)/2;
		
		return sum-s;
		
		
		
				}
}
