import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int[] alphabet=new int[26];
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0;i<a.length();i++) alphabet[a.charAt(i)-'a']++;
        for(int i=0;i<b.length();i++) alphabet[b.charAt(i)-'a']--;
        for(int i=0;i<26;i++) if(alphabet[i]!=0) return false;
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
