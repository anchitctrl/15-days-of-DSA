import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double mean=0;
        for(int i=0;i<n;i++){
            mean=mean+arr[i];
        }
        mean=mean/n;
        System.out.println(mean);
        double median=0;
        Arrays.sort(arr);
        if(n%2==0){
            median=(arr[n/2]+arr[(n/2)-1])/(double)2;
        }
        System.out.println(median);
        int maxCount = 1;
        int count = 1;
        int current = arr[0];
        int mode = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == current){
                count++;
            }
            else{
                count = 1;
                current = arr[i];
            }
            if(count > maxCount){
                maxCount = count;
                mode = current;
            }
        }
        System.out.println(mode);
    }
}
