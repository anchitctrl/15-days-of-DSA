public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        for(int i=1;i<A.length;i=i+2){
            int temp=A[i];
            A[i]=A[i-1];
            A[i-1]=temp;
        }
        return A;
    }
}
