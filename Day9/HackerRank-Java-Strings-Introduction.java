import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        boolean bool=true;
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }
        else System.out.println("No");
        String first1=A.substring(0,1);
        A=first1.toUpperCase()+A.substring(1,A.length());
        String first2=B.substring(0,1);
        B=first2.toUpperCase()+B.substring(1,B.length());
        System.out.println(A+" "+B);
    }
}
