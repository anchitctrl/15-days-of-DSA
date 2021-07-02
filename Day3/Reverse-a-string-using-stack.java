import java.util.Stack;
import java.util.Scanner;

class reverseString{
	
	public static void main(String[] args) {
		Stack<Character> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Original String: "+ str);
		char[] arr=str.toCharArray();
		for(char c:arr) {
			stack.push(c);
		}
		for(int i=0;i<str.length();i++) {
			arr[i]=stack.pop();
		}
		System.out.println("Rversed String: "+new String(arr));
	}
}
