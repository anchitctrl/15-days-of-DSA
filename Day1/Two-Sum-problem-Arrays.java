// Given an array of Integers and a traget, Return two indices such that
// the sum of elements at those indices will be equal to the target
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Two_sum_problem {

	public void printArray(int[]arr,int target) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Target is: "+ target);
	}
	public static int[] twoSum(int[] arr, int target) {
		int[] result=new int[2];
		Map<Integer, Integer> map=new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
		    if(!map.containsKey(target - arr[i])) {
			   map.put(arr[i], i);
		    } 
		    else {
		         result[1] = i;
		         result[0] = map.get(target - arr[i]);
		         return result;   
		    }
		}
		throw new IllegalArgumentException("Two numbers not found");
		
	}
	public void arrDemo() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println("Original Array: ");
		printArray(arr,target);
		int[] result=twoSum(arr,target);
		System.out.println("Indices are "+result[0]+" and "+result[1]);
	}
	public static void main(String[] args) {
		Two_sum_problem arrObj=new Two_sum_problem();
		arrObj.arrDemo();

	}

}
