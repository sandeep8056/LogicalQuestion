package logicalquestion;

public class Pallindrone {
	
	public static void main(String[] args) {
		
		
		System.out.println(pallindrone("rada1"));
	}

	public static boolean pallindrone(String str) {
		
		int left =0;
		int right =str.length()-1;
		
		while(left<right) {
			
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
			
		}
		
		return true;
	}
}
