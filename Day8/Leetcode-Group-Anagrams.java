class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String str=String.valueOf(c);
            if(!map.containsKey(str)) map.put(str,new ArrayList<>());
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
