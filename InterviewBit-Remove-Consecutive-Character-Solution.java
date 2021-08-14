public class Solution {
    public String solve(String A, int B) {
        String ans = "";
        String buffer = "";
        buffer = buffer + A.charAt(0);
        char prev = A.charAt(0);
        for (int i=1; i<A.length(); i++) {
            if (prev == A.charAt(i)) {
                buffer = buffer+  A.charAt(i);
            }
            else {
                if (buffer.length() != B) {
                    ans = ans+ buffer;
                }
                buffer = ""+A.charAt(i);
                prev = A.charAt(i);
            }
        }
        
        if (buffer.length() != B) {
            ans =ans+ buffer;
        }
        
        return ans;
    }
}
