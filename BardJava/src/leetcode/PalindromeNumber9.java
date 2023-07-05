package leetcode;

public class PalindromeNumber9 {

	public static void main(String[] args) {
		int x=4;
		boolean a = isPalindrome(x);
		System.out.println(a);
	}

	public static boolean isPalindrome(int x) {

		String a=Integer.toString(x);
		System.out.println(a.length());
		if(a.length()==1) {
			return true;
		}
		for(int i=0;i<=a.length()-i-1;i++) {
			if(a.charAt(i)==a.charAt(a.length()-i-1)) {
				
			}else {
				return false;
			}
		}
		return true;
	}

}
