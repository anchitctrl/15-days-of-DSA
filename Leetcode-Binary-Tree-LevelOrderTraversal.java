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
    
    public List<List<Integer>> list=new ArrayList<List<Integer>>();
    
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int lheight=height(root.left);
        int rheight=height(root.right);
        
        if(lheight>rheight) return (lheight+1);
        else return (rheight+1);
    }
    
    public List<Integer> printCurrentLevel(TreeNode root, int level,List<Integer> temp){
        if(root==null){
            return null;
        }
        if(level==1){
            temp.add(root.val);
        }
        else if(level>1){
            printCurrentLevel(root.left,level-1,temp);
            printCurrentLevel(root.right,level-1,temp);
        }
        return temp;
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        int h=height(root);
        for(int i=1;i<=h;i++){
            List<Integer> temp=new ArrayList<Integer>();
            list.add(printCurrentLevel(root,i,temp));
        }
        return list;
    }
}
