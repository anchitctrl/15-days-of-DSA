class Solution {
    public void reverseString(char[] s) {
        
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length;i++){
            stack.push(s[i]);
        }
        int index=0;
        while(!stack.isEmpty()){
            s[index]=stack.pop();
            index++;
        }
        
    }
}
