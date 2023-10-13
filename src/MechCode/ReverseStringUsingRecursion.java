package MechCode;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String word = "Sandeep";
		int length = word.length()-1;
		String r ="";
		String s = reverseString(word,r,length);
		System.out.println(s);
	}
	
	public static String reverseString(String s,String r,int length) {
		
		if(length < 0) {
			return r;
		}
		
		return reverseString(s, r+s.charAt(length), length-1);
	}
	
		
	
	
}
