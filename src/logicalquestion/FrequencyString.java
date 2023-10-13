package logicalquestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyString {

	public static void main(String[] args) {
		
		String word = "sandeep".toLowerCase();
		
		frequency(word);
		
		
	}
	
	
	public static void frequency(String word) {
		 Map<Character, Integer> map = new LinkedHashMap<>(); // Use LinkedHashMap
	        
	        for(int i = 0; i < word.length(); i++) {
	            
	            if(map.containsKey(word.charAt(i))) {
	                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
	            } else {
	                map.put(word.charAt(i), 1);
	            }
	        }
	        
	        map.forEach((k,v)->System.out.println(k +" "+v));
	}
	
}
