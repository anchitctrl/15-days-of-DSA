import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<n;i++){
        sum=sum+sc.nextLong();
        }
        System.out.println(sum);
    }
}
