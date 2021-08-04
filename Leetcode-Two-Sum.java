class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<Integer>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                arr[0]=list.indexOf(nums[i]);
                arr[1]=i;
            }
            list.add(target-nums[i]);
        }
        return arr;
    }
}
