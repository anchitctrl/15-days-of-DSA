class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(word.indexOf(patterns[i])>=0){
                count++;
            }
        }
        return count;
    }
}
