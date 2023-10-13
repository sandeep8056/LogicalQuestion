package logicalquestion;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		int n=1634;
		
		for(int i=1;i<=n;i++) {
		
				if(AmstrongNumber(i)) {
					System.out.println(i);
				}
		}
		
	}
	
	
	
	public static boolean AmstrongNumber(int num) {
		
		int c=num;
		int n = num;
		int noOfDigit =0;
		
		int sum=0;
		
		while(num != 0) {
			if(num ==1) {
				break;
			}
			int r = num%10;
			noOfDigit++;
			num/=num;
		}
		
		if(noOfDigit <= 3) {
			noOfDigit = 3;
		}
		
		
		while(n !=0) {
			
			int r = n%10;
			
			sum = sum + (int)Math.pow(r, noOfDigit);
			n/=10;
		}
		
		if(sum == c) {
			return true;
		}
		
		return false;
	}

}
