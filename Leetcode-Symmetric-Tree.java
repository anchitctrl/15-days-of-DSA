/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int lheight=height(root.left);
        int rheight=height(root.right);
        
        if(lheight>rheight) return lheight+1;
        return rheight+1;
    }
    
    public List<Integer> currentLevel(TreeNode root,int level,List<Integer> temp){
        if(root==null){
            temp.add(12);
        }
        else if(level==1){
            temp.add(root.val);
        }
        else if(level>1){
            currentLevel(root.left,level-1,temp);
            currentLevel(root.right,level-1,temp);
        }
        return temp;
    }
    
    public boolean isPalindrome(List<Integer> temp){
        int i=0;
        int j=temp.size()-1;
        while(i<j){
            if(temp.get(i)!=temp.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
    public boolean isSymmetric(TreeNode root) {
        int h=height(root);
        for(int i=1;i<=h;i++){
            List<Integer> temp=new ArrayList<Integer>();
            if(!isPalindrome(currentLevel(root,i,temp))) return false;    
        }
        return true;
    }
}
