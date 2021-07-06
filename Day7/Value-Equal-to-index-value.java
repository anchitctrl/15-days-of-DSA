class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}
