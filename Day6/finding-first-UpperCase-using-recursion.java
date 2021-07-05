
public class firstUpperCase {

	public char demo(String str) {
		if (Character.isUpperCase(str.charAt(0))) return str.charAt(0);
		return demo(str.substring(1));
	}
	
	public static void main(String[] args) {
		firstUpperCase Obj=new firstUpperCase();
		char result=Obj.demo("hellO");
		System.out.println(result);
	}
}
