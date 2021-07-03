import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int lefttoright=0;
        int righttoleft=0;
        for(int i=0;i<n;i++){
            lefttoright=lefttoright+arr[i][i];
            righttoleft=righttoleft+arr[i][n-i-1];
        }
        System.out.println(Math.abs(lefttoright-righttoleft));
    }
}
