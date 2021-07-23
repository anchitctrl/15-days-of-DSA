class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3) return false;
        int high=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i]>arr[i+1]){
                high=i;
                break;
            }
        }
        if(high==n-1 || high==0){
            return false;
        }
        for(int i=high+1;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
