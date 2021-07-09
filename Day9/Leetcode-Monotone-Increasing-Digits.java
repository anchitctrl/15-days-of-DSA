class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] ch = String.valueOf(N).toCharArray();
        int mark = ch.length;
        for(int i = ch.length-1;i>0;i--){
            if(ch[i]<ch[i-1]){
                mark = i;
                ch[i-1]--;
            }
        }
        for(int i = mark;i<ch.length;i++){
            ch[i] = '9';
        }
        return Integer.parseInt(new String(ch));
    }
}
