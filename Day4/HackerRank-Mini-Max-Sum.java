import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.print((sum-arr[4])+" "+(sum-arr[0]));
    }
}
