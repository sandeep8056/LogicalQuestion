package logicalquestion;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("reverse number "+reverseNumber(123));
		
	}
	
	public static int reverseNumber(int num) {
		
		int sum=0;
		while(num>0) {
		
			int r =num%10;
			sum=sum*10+r;
			num/=10;
		}
		
		return sum;
	}
}
