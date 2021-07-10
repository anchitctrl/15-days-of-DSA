import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        if(s.length()==0) System.out.println("0");
        else{
            String[] str=s.split("['!?,._@ ]+");
            System.out.println(str.length);
            for(int i=0;i<str.length;i++){
                System.out.println(str[i]);
            }
        }
    }
}
