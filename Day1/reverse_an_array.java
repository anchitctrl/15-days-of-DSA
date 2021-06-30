import java.util.Scanner;
public class reverse_an_array {

	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public void reverseArray(int[] arr) {
		int[] result=new int[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			result[index]=arr[i];
			index++;
		}
		printArray(result);
	}
	public void arrdemo() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array: ");
		printArray(arr);
		System.out.println("Reversed Array: ");
		reverseArray(arr);
	}
	public static void main(String[] args) {
		reverse_an_array arrObj=new reverse_an_array();
		arrObj.arrdemo();

	}

}
