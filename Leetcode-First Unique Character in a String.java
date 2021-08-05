class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int result=-1;
        int temp;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                temp=map.get(s.charAt(i));
                temp++;
                map.put(s.charAt(i),temp);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                result=i;
                break;
            }
        }
        return result;
    }
}
