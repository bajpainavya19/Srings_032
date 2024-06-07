package Core;

public class removeLowerCasestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Navya Bajpai";
		String letters="";
	    int upperCase=0;
		for(char c:s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				upperCase++;
				letters=letters+c;
				
			}
		}
		System.out.println("Total number of upperCase alphabets present are: " + upperCase);
		if(upperCase>0) {
			System.out.println("No. of characters which are in upper case: " + letters);
		}
		else {
			System.out.println("No upper case letters are found");
		}

	}

}
