package logicalquestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class IsAnagram {

	public static void main(String[] args) {
		boolean isanagram = isAnagramWithoutInbuiltMethod("silent","listen");
		if(isanagram) {
			System.out.println("It is anagram");
		}else {
			System.out.println("It is not an anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] st1 = str1.toCharArray();
		char[] st2 = str2.toCharArray();

		Arrays.sort(st1);
		Arrays.sort(st2);

		for (int i = 0; i < st1.length; i++) {
			if (st1[i] != st2[i]) {
				return false;
			}
		}
		return true;

	}
	
	public static boolean isAnagramWithoutInbuiltMethod(String st1,String st2) {
		
		if(st1.length() != st2.length()) {
			return false;
		}
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<st1.length();i++) {
			
			if(map.containsKey(st1.charAt(i))) {
				map.put(st1.charAt(i), map.get(st1.charAt(i))+1);
			}else {
				map.put(st1.charAt(i), 1);
			}
		}
		
		for(int i =0;i<st2.length();i++) {
			
			if(map.containsKey(st2.charAt(i))) {
				map.put(st2.charAt(i), map.get(st2.charAt(i)) -1 );
			}else {
				return false;
			}
		}
		
		Set<Character> keys = map.keySet();
		
		
		for(Character key : keys) {
			
			if(map.get(key) != 0) {
				return false;
			}
		}
		
		
		
		return true;
	}
}
