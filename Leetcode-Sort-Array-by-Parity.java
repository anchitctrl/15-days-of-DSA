class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int temp=0;
        int start=0;
        int end=nums.length-1;
        while(start!=end){
            if(end<start) break;
            if(nums[start]%2==0){
                start++;
            }
            if(nums[end]%2!=0){
                end--;
            }
            if(end<start) break;
            if(nums[start]%2!=0 && nums[end]%2==0){
                temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        return nums;
    }
}
