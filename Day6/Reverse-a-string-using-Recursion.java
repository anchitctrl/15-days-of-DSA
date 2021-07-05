
public class reverse {
	
	public String demo(String str) {
		int n=str.length();
		if(n==1) return str.substring(0);
		return str.charAt(n-1)+demo(str.substring(0, n-1));
	}
	
	public static void main(String[] args) {
		reverse Obj=new reverse();
		String result=Obj.demo("reverse");
		System.out.println(result);
	}
}
