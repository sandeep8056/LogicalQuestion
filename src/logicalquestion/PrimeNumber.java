package logicalquestion;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int c=1;
		for(int i =2;i<=100;i++) {
			int n=i;
			int counter=0;
			for(int j=2;j<n;j++) {
				
				if(n%j==0) {
					counter++;
				}
			}
			
			if(counter == 0 ) {
				System.out.println(n+" ");
			}
		}
	}
}
