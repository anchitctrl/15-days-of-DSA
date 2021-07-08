class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        String s1=String.valueOf(c);
        char[] c1=t.toCharArray();
        Arrays.sort(c1);
        String s2=String.valueOf(c1);
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)) return true;
        return false;
    }
}
