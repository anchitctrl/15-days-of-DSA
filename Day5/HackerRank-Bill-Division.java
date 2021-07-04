import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int charged=0;
        int actual=0;
        int ans=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            actual=actual+a;
            if(i!=k){
                charged=charged+a;
            }
        }
        int b=sc.nextInt();
        ans=actual/2-charged/2;
        if(b==charged/2) System.out.println("Bon Appetit");
        else System.out.println(ans);
        
    }
}
