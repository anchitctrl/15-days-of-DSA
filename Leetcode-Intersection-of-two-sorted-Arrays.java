class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> result=new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                result.add(nums2[i]);
                list.remove(new Integer(nums2[i]));
            }
        }
        int[] temp=new int[result.size()];
        for(int i=0;i<result.size();i++){
            temp[i]=result.get(i);
        }
        return temp;
    }
}
