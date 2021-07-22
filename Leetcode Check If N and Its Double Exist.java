class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(list.contains(arr[i])) return true;
            list.add(2*arr[i]);
            if(arr[i]%2==0){
                list.add(arr[i]/2);
            }
        }
        return false;
    }
}
