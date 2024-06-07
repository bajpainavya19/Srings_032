package Core;

public class removeduplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Navya";
		char arr[] =s.toCharArray();
		String result = "";

        for (char c : arr) {
        	if (c != ' ' && result.indexOf(c) == -1) {
                result += c;
            }
        }

        System.out.println("Original string: " + s);
        System.out.println("String after removing duplicates: " + result);

	}

}
