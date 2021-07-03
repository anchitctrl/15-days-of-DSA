import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int apple=0;
        int orange=0;
        int[] dist1=new int[m];
        int[] dist2=new int[n];
        for(int i=0;i<m;i++){
            dist1[i]=sc.nextInt()+a;
            if(dist1[i]<=t && dist1[i]>=s) apple++;
        }
        for(int i=0;i<n;i++){
            dist2[i]=sc.nextInt()+b;
            if(dist2[i]<=t && dist2[i]>=s) orange++;
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
