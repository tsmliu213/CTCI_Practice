import java.util.*;


public class Array_and_strings {
	Array_and_strings() {
		
	}
	
	public void run() {
		System.out.println(uniqueChar("test"));
		System.out.println(uniqueChar("abcdefgh"));
		System.out.println(isAnagram("hello", "lleoh"));
		System.out.println(isAnagram("hello", "test"));
	}
	
	// Implement an algorithm to determine if a string has all unique characters 
	// What if you can not use additional data structures?
	private boolean uniqueChar(String str) {
		boolean[] charSet = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(charSet[val]) {
				return false;
			}
			charSet[val] = true;
		}
		return true;
	}
	
	private boolean isAnagram(String str1, String str2) {
		char[] c_str1 = str1.toCharArray();
		char[] c_str2 = str2.toCharArray();
		Arrays.sort(c_str1);
		Arrays.sort(c_str2);
		String str1_sorted = new String(c_str1);
		String str2_sorted = new String(c_str2);
		return str1_sorted.equals(str2_sorted);
	}
	
}
