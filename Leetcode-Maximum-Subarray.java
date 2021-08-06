class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        int max = arr[0];
        int min=0;
        for(int i = 1; i < n; i++){
            min=0;
            if(arr[i-1]>0){
                min=arr[i-1];
            }
            arr[i] = nums[i] + min;
            max = Math.max(max, arr[i]);
        }
        
        return max;
    }
}
