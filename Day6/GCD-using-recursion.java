
public class GCD {

	public int divisor(int a,int b) {
		if(b==0) return a;
		return divisor(b,a%b);
	}
	
	public static void main(String[] args) {
		GCD Obj=new GCD();
		int result=Obj.divisor(48,18);
		System.out.println(result);
	}
}
