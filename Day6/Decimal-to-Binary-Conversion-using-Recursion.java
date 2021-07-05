
public class DecimaltoBinary {

	public String demo(int value) {
		if(value==0) return "";
		return demo(value/2)+value%2;
	}
	
	public static void main(String[] args) {
		DecimaltoBinary Obj=new DecimaltoBinary();
		String result=Obj.demo(11);
		System.out.println(result);
	}
}
