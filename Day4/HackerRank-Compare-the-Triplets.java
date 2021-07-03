import java.util.*;
class Solution{
    public static void main(String[] args){
        int[] a=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        int[] result=new int[2];
        for(int i=0;i<3;i++){
            if(a[i]>a[i+3]){
                result[0]++;
            }
            else if(a[i]<a[i+3]){
                result[1]++;
            }
            else continue;
        }
        System.out.println(result[0]+" "+result[1]);
    }
}
