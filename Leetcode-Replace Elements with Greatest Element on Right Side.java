class Solution {
    public int greatest(int[] arr,int start){
        int max=arr[start];
        for(int i=start+1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            arr[i]=greatest(arr,i+1);
        }
        arr[n-1]=-1;
        return arr;
    }
}
