class Solution {
    static int countSquares(int N) {
        int d=(int)Math.sqrt(N);
        double s=Math.sqrt(N);
        if(s-Math.floor(s)==0) return d-1;
        else return d;
    }
};
