import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer s=new StringBuffer(A);
        if(A.equals(s.reverse().toString())) System.out.println("Yes");
        else System.out.println("No");   
    }
}
