package logicalquestion;

public class Factorial {

	public static void main(String[] args) {
	//	System.out.println(factorial(4));
		
		System.out.println(fact(4));
	}
	
	public static int factorial(int n) {
		
		int fact=1;
		for(int i =1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static int fact(int n) {
		
		if(n==1) 
			return 1;

		return n*fact(n-1);
	

	}
}
