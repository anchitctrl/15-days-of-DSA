public class Solution {
    public int solve(int A, int B, int C) {
        A=A%B;
        C=C%B;
        int start=C;
        while(A-- >0){
            if(start==B){
                start=1;
            }
            else{
                start++;
            }
        }
        return start-1;
    }
}
