
public class SumDigits {

	int sum=0;
	
	public int SumDigits(int value) {
		if(value==0) return sum;
		sum=sum+value%10;
		value=value/10;
		return SumDigits(value);
	}
	
	public static void main(String[] args) {
		SumDigits Obj=new SumDigits();
		int result=Obj.SumDigits(1287);
		System.out.println(result);
	}
}
