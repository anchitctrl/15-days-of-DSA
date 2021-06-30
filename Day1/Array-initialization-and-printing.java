public class Arraybasics {
  
	//method to print an Array
  public void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
  
	//method to initialize an array 
	public void arrdemo() {
		int[] arr=new int[5];
		arr[0]=9;
		arr[1]=8;
		arr[2]=7;
		arr[3]=6;
		arr[4]=5;
		printArray(arr);
	}
  
	public static void main(String[] args) {
		Arraybasics arrobj=new Arraybasics();
		arrobj.arrdemo();
	}
}
