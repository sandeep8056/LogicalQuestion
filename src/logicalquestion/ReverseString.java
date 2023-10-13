package logicalquestion;

public class ReverseString {

	public static void main(String[] args) {
		
		reverseStringAtHisPlace("Sandeep Grow");
		
	}
	
	public static String reverseString(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		
		
		return sb.toString();
	}
	
	
	public static void reverseStringAtHisPlace(String word) {
		
		
		String[] str = word.split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			
			for(int i =s.length()-1;i>=0;i--){
				sb.append(word.charAt(i));
				
			}
			sb.append(" ");
		}
		
		
		System.out.println(sb.toString());
		
	}
	
}
