class Solution {
    public int count(int n){
        String str=String.valueOf(n);
        return str.length();
    }
    public int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int len=count(nums[i]);
            if(len%2==0) count++;
        }
        return count;
    }
}
