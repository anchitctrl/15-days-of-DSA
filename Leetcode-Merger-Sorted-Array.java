class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0) merge(nums2,n,nums1,m);
        if(n==0) return;
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
