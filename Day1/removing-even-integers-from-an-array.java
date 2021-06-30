import java.util.Scanner;
public class remove_even_integers {
	public void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public void removeEven(int[] arr) {
		int oddelements=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddelements++;
			}
		}
		int[] result=new int[oddelements];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[index]=arr[i];
				index++;
			}
		}
		printArray(result);
	}
	public void arrayDemo() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array: ");
		printArray(arr);
		System.out.println("Array After removal of even integers: ");
		removeEven(arr);
		
	}
	public static void main(String[] args) {
		remove_even_integers arrObj=new remove_even_integers();
		arrObj.arrayDemo();
	}
}
