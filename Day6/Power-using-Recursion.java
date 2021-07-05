
public class Power {
	
	public int power(int base, int power) {
		if(power==0) return 1;
		return base*power(base,power-1);
	}

	public static void main(String[] args) {
		Power Obj=new Power();
		int result=Obj.power(2,4);
		System.out.println(result);
	}
}
