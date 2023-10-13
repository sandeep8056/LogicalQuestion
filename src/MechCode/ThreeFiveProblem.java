package MechCode;

public class ThreeFiveProblem {

	public static void main(String[] args) {
		threeFourProblem(20);
	}
	
	public static void threeFourProblem(int n) {
		
		
		for(int i=1;i<=n;i++) {
			
			if(i%3 == 0 && i%5 ==0 ) {
				System.out.println("ThreeFive");
			}else if(i%3 == 0) {
				System.out.println("Three");
			}else if(i % 5 == 0) {
				System.out.println("Five");
			}else {
				System.out.println(i);
			}
		}
	
	
	}
}
