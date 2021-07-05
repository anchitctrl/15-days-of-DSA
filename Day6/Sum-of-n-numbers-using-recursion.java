
public class SumofDigits {
	
	public int Sum(int value) {
		if(value==1) return 1;
		return value+Sum(value-1);
	}
	
	public static void main(String[] args) {
		SumofDigits Obj=new SumofDigits();
		int result=Obj.Sum(10);
		System.out.println(result);
	}
}
