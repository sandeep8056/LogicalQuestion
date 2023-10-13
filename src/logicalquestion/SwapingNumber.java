package logicalquestion;

public class SwapingNumber {
	
	public static void main(String[] args) {
	
		int a =10;
		int b =20;
		System.out.println("before swaping a: "+a+" b: "+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a: "+a +" b : "+b);
	

	}
	
	
	

}
