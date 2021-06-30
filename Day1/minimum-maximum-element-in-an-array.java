import java.util.Scanner;
public class min_max {
	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void minArray(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) min=arr[i];
		}
		System.out.println(min);
	}
	public void maxArray(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
		}
		System.out.println(max);
	}
	public void arraydemo() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array: ");
		printArray(arr);
		System.out.println("minimum element: ");
		minArray(arr);
		System.out.println("Maximum element: ");
		maxArray(arr);
		
	}
	public static void main(String[] args) {
		min_max arrObj=new min_max();
		arrObj.arraydemo();
	}

}
