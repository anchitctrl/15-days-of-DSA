import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int grade=sc.nextInt();
            if(grade<38) System.out.println(grade);
            else if((grade+1)%5==0) System.out.println(grade+1);
            else if((grade+2)%5==0) System.out.println(grade+2);
            else System.out.println(grade);
        }
    }
}
