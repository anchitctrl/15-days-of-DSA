public class Solution {
    public int solve(int A, int B, int C, int D) {
        int[] side={A,B,C,D};
        Arrays.sort(side);
        if(side[0]==side[1] && side[2]==side[3] && side[0]<side[2]){
            return 1;
        }
        else{
            return 0;
        }
    }
}
