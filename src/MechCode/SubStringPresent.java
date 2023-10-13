package MechCode;

public class SubStringPresent {

	public static void main(String[] args) {
//		String str ="ACAAGATGCCATTGTCCCCCGGCCTCCTGCTGCTGCTGCTCTCCGGGGCCACGGCCACCGCTGCCCTGCCCCTGGAGGGTGGCCCCACCGGCCGAGACAGCGAGCATATGCAGGAAGCGGCAGGAATAAGGAAAAGCAGCCTCCTGACTTTCCTCGCTTGGTGGTTTGAGTGGACCTCCCAGGCCAGTGCCGGGCCCCTCATAGGAGAGGAAGCTCGGGAGGTGGCCAGGCGGCAGGAAGGCGCACCCCCCCAGCAATCCGCGCGCCGGGACAGAATGCCCTGCAGGAACTTCTTCTGGAAGACCTTCTCCTCCTGCAAATAAAACCTCACCCATGAATGCTCACGCAAGTTTAATTACAGACCTGAA".toLowerCase();
//		String target = "tata".toLowerCase();
//		
		
		String str = "geeksforgeeks";
		String target ="practice";
		
		System.out.println(subStringPresent(str,target));
		
	}
	
	public static  boolean subStringPresent(String str, String target) {
	
		
		
		for(int i =0;i<str.length();i++) {
				
			int count = 0;
			
			for(int j =0;j<target.length();j++) {
				
				if(str.charAt(i) == target.charAt(j)) {
					count++;
					i++;
				}
				
			}
			
			if(target.length() ==  count) {
				return true;
			}
			
		}
		
		
		return false;
	}
}
