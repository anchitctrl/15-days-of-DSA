class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> list=new ArrayList<>();
        boolean bool=false;
        int count=0;
        if(n==1){
            if(arr[0]==x){
                list.add(Long.valueOf(0));
                list.add(Long.valueOf(0));
                return list;
            }
            else{
                list.add(Long.valueOf(-1));
                list.add(Long.valueOf(-1));
                return list;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==x && !bool){
                list.add(Long.valueOf(i));
                bool=true;
            }
            else if(arr[i]==x && bool){
                count++;
            }
            else if(arr[i]!=x && bool){
                list.add(Long.valueOf(i-1));
                break;
            }
        }
        if(!bool){
            list.add(Long.valueOf(-1));
            list.add(Long.valueOf(-1));
        }
        return list;
    }
}
