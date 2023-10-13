package logicalquestion;

public class FibonicaSeries {

	public static void main(String[] args) {
		
		//fibonacciSeries(5);
		
		int n=5;
		for(int i =0;i<n;i++) {
			System.out.println(fib(i));
		}
	}
	
	public static void fibonacciSeries(int n) {
		
		int a = 0;
		int b = 1;
		int c;
		
		for(int i =0;i<n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
	}
	
	public static int fib(int n) {
		
		if(n<=1) 
			return n;
		
		return fib(n-1) + fib(n-2);
	}
	
	
}
