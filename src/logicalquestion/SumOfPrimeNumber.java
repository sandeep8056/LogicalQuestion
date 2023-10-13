package logicalquestion;

public class SumOfPrimeNumber {

	public static void main(String[] args) {

		System.out.println(SumOfSquareOfPrime(4));
	}

	public static int SumOfSquareOfPrime(int n) {
	
		int i = 1;
		int number=2;
		
		int sum=0;
		
		while(i<=n) {
			int check = 0;
			for(int j = 2; j <number;j++) {
				
				if(number%j==0) {
					check++;
				}
				
			}
			
			if(check == 0) {
				sum=sum+(number*number);
				i++;
			}
			
			number++;

			
		}		
		return sum;
	}
}
