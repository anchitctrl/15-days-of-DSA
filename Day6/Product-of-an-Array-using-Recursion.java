
public class productArray {

	public int product(int arr[],int N) {
		if(N+1==0) return arr[0];
		return arr[N]*product(arr,N-1);
	}
	
	public static void main(String[] args) {
		productArray Obj=new productArray();
		int[] arr= {2,2,3,4,5};
		int result=Obj.product(arr,4);
		System.out.println(result);
	}
}
