
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public void SubArray(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum<0) count++;
            }
        }
        System.out.println(count);
    }
    public void arrDemo(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        SubArray(arr);
    }
    public static void main(String[] args) {
        Solution arrObj=new Solution();
        arrObj.arrDemo();
    }
}
