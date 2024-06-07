package Core;

public class countLowerUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nAvYa";
		int lowerCase=0;
		int upperCase=0;
		
		for(char c:s.toCharArray()) {
			if(Character.isLowerCase(c)) {
				lowerCase++;
			}
			else if(Character.isUpperCase(c)) {
				upperCase++;
			}
		}
		
		System.out.println("Number of lowerCase: " + lowerCase);
		System.out.println("Number of upperCase: " + upperCase);

	}

}
