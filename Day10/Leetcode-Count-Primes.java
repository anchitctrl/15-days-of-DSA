class Solution {
    public int countPrimes(int n) {
        boolean[] arr=new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]==false){
                count++;
                for(int j=2;i*j<n;j++){
                    arr[i*j]=true;
                }
            }
        }
        return count;
    }
}
