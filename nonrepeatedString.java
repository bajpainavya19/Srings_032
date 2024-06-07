package Core;

public class nonrepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tripti";
		str=str.toLowerCase();
		int charCount[] = new int[256];
		
		char nonRepeated=0;
		
		for(char c:str.toCharArray()) {
			charCount[c]++;
				
			}
		for(char c:str.toCharArray()) {
			if(charCount[c]==1) {
				nonRepeated=c;
				break;
			}
		}
		if(nonRepeated!=0) {
			System.out.println("First non-repeated character is: " + nonRepeated);
		}
		else {
			System.out.println("No non-repeated character is found");
		}

	}

}
