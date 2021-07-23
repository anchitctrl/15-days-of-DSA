class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        System.arraycopy(heights,0,expected,0,heights.length);
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
}
