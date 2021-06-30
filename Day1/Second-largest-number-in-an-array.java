import java.util.Arrays;
import java.util.Scanner;
public class second_largest {

	public void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public void secondLarge(int[] arr) {
		if(arr.length==1) System.out.println("not possible");
		else {
			Arrays.sort(arr); 
			System.out.println(arr[arr.length-2]);
		}
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
		System.out.println("Second Largest Number: ");
		secondLarge(arr);
	}
	public static void main(String[] args) {
		second_largest arrObj=new second_largest();
		arrObj.arrdemo();

	}

}
