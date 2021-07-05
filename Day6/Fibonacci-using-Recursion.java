public class fibonacci{
	
	public int demo(int value) {
		if(value==0) return 0;
		if(value==1) return 1;
		return demo(value-1)+demo(value-2); 			
	}
	
	public static void main(String[] args) {
		fibonacci Obj=new fibonacci();
		int result=Obj.demo(4); 
		System.out.println(result);
	}
}
