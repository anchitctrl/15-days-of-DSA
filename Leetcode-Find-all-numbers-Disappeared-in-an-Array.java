class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(nums);
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0) list.add(i);
        }
        return list;
    }
}
