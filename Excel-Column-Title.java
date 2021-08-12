public class Solution {
    public String convertToTitle(int A) {
        StringBuilder str=new StringBuilder();
        while(A>0){
            A--;
            str.insert(0,(char)('A'+A%26));
        }
        return str.toString();
    }
}
