package logicalquestion;

public class MinMaxSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int[] minMax= minMaxSum(arr);
		
		System.out.println("min"+minMax[0]);
		System.out.println("max"+minMax[1]);
		
	}
	
	public static int[] minMaxSum(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					continue;
				}else {
					sum+=arr[j];
				}
			}
			if(sum>max) {
				max=sum;
			}
			if(sum<min) {
				min=sum;
			}
			
		}
		
		return new int[] {min,max} ;
		
	}
}
