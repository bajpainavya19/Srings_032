package Core;

public class occurenceString {

	public static void main(String[] args) {
		String s1 = "Navya";
		char arr[]=s1.toCharArray();
		int count =0;
		boolean[] counted = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if (!counted[i]) { // if the character at index i has not been counted yet
				count = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					counted[j] = true;
				}
			}
				
			System.out.println(arr[i] + " => " + count + " times.");
			
		}
	
		}
	}

}
