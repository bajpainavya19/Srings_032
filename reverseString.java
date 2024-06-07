package Core;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Navya Bajpai";
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse += s1.charAt(i);
			
		}
		System.out.println(reverse);

	}

}
