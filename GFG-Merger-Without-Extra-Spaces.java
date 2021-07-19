class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(j>m-1) break;
            if(arr1[i]>arr2[j]){
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                j++;
            }
            else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
