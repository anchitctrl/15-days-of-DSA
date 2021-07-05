
public class Palindrome {

	public boolean isPalindrome(String str) {
		int n=str.length();
		if(n==1) return true;
		if(n==2 && str.charAt(0)==str.charAt(1)) return true; 
		if(str.charAt(0)==str.charAt(n-1)) {
			return isPalindrome(str.substring(1,n-1));
		} 
		return false;
	}
	
	public static void main(String[] args) {
		Palindrome Obj=new Palindrome();
		boolean result=Obj.isPalindrome("tacocat");
		System.out.println(result);
	}
}
