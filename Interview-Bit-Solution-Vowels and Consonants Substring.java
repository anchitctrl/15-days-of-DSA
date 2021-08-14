public class Solution {
    public int solve(String A) {
        int count=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u') count++;
        }
    return (count*(A.length()-count))%1000000007;
    }
}
