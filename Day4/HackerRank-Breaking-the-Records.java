import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=sc.nextInt();
        }
        int[] min=new int[n];
        int[] max=new int[n];
        min[0]=max[0]=scores[0];
        for(int i=1;i<n;i++){
            min[i]=Math.min(min[i-1],scores[i]);
            max[i]=Math.max(max[i-1],scores[i]);
        }
        int minCount=0;
        int maxCount=0;
        for(int i=1;i<n;i++){
            if(min[i]<min[i-1]) minCount++;
            if(max[i]>max[i-1]) maxCount++;
        }
        System.out.print(maxCount+" ");
        System.out.print(minCount);
    }
}
