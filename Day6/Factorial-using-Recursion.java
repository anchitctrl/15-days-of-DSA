public class Factorial {
	
	public int fact(int value) {
		if(value==1) return 1;
		return value*fact(value-1);
	}
	
	public static void main(String[] args) {
		Factorial Obj=new Factorial();
		int result=Obj.fact(5);
		System.out.println(result);
	}
}
