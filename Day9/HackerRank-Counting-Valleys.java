import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String S=sc.next();
        Stack<Character> stack=new Stack<>();
        char[] c=S.toCharArray();
        int count=0;
        for(int i=0;i<n;i++){
            if(c[i]=='U'){
                if(stack.isEmpty() || stack.peek()=='U'){
                    stack.push(c[i]);
                }
                else if(stack.peek()=='D'){
                    stack.pop();
                }
            }
            else if(c[i]=='D'){
                if(stack.isEmpty()){
                    count++;
                    stack.push(c[i]);
                }
                else if(stack.peek()=='U'){
                    stack.pop();
                }
                else if(stack.peek()=='D'){
                    stack.push(c[i]);
                }
            }
        }
        System.out.println(count);
    }
}
