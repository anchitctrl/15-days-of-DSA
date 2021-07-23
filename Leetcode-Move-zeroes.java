class Solution {
    public int[] rotate(int[] arr,int k){
        int temp=arr[k];
        for(int i=k;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(i==nums.length-count) return;
            if(nums[i]==0){
                count++;
                rotate(nums,i);
                i=i-1;
            }
        }
    }
}
