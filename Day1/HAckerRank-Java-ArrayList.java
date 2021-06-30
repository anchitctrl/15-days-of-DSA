import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public void arrdemo(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>[] al = new ArrayList[n];
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            al[i] = new ArrayList<Integer>(d);
            for(int j=0;j<d;j++){
                al[i].add(sc.nextInt());
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(al[x-1].size()<=(y-1)){
                System.out.println("ERROR!");
            }
            else {
                System.out.println(al[x-1].get(y-1));
            }
        }
        
    }
    public static void main(String[] args) {
        Solution arrObj=new Solution();
        arrObj.arrdemo();   
    }
}
