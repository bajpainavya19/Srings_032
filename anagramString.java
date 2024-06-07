package Core;

import java.util.Arrays;

public class anagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Triangle";
		String s2 = "Integral";
		char[] charArray = s1.toCharArray();
		char[] arr = s2.toCharArray();
		s1.replaceAll(" ", "");
		s2.replaceAll(" ", "");
		if(s1.length()!=s2.length()) {
			System.out.print("Not a anagram");
		}
		else {
			 charArray=s1.toLowerCase().toCharArray();
			 arr=s2.toLowerCase().toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(arr);
			System.out.println(Arrays.equals(charArray,arr));
			System.out.println("Anagram string");
			
		}
		
		

	}

}
