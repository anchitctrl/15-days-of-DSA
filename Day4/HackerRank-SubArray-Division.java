import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int d=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        for(int i=0;i<n-m+1;i++){
            int sum=0;
            for(int j=i;j<i+m;j++) sum=sum+arr[j];
            if(sum==d) count++;
        }
        System.out.println(count);
    }
}
