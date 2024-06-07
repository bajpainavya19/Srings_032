package Core;

public class vowelsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "apples are very sweet";
		int vowel=0;
		
		s1=s1.toLowerCase();
		
		for(char c:s1.toCharArray()) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowel++;
			}
		}
		
		System.out.println("No. of vowels are: " + vowel);

	}

}
