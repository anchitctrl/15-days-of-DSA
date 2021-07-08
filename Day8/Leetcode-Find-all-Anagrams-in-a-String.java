class Solution {
    public boolean isAnagram(String s1,String s2){
        char[] alphabet=new char[26];
        for(int i=0;i<s1.length();i++) alphabet[s1.charAt(i)-'a']++;
        for(int i=0;i<s2.length();i++) alphabet[s2.charAt(i)-'a']--;
        for(int i:alphabet) if(i!=0) return false;
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length())return list;
        for(int i=0;i<=s.length()-p.length();i++){
            if(isAnagram(s.substring(i,i+(p.length())),p)) list.add(i);
        }
        return list;
    }
}
