import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                list.add(x,y);
            }
            else if(s.equals("Delete")){
                int x=sc.nextInt();
                list.remove(x);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
