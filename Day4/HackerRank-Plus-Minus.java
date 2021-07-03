import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a<0) negative++;
            else if(a>0) positive++;
            else zero++;
        }
        System.out.println(String.format("%.6f",positive/(double)n));
        System.out.println(String.format("%.6f",negative/(double)n));
        System.out.println(String.format("%.6f",zero/(double)n));
    }
}
