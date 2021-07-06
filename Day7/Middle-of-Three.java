class Solution{
    int middle(int A, int B, int C){
        int[] arr=new int[3];
        arr[0]=A;
        arr[1]=B;
        arr[2]=C;
        Arrays.sort(arr);
        return arr[1];
    }
}
