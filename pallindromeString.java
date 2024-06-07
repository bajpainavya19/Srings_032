package Core;

public class pallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="naman";
		char arr[]=s.toCharArray();
		int i,j;
		for(i=0, j=arr.length-1;i<=j;i++,j--) {
				if(arr[i]!=arr[j]) {
					System.out.println("String is not a pallindrome");
					return;
				}
			}
			if(i>j) {
				System.out.println("String is pallindrome");
	       }
    }
}	

	


