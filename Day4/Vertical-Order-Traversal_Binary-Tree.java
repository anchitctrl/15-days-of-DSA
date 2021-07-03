class Values
{
    int max, min;
}
public class VerticalOrderSet1 {
	
	private TreeNode root;
    Values val = new Values();
	
	private static class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public void findMinMax(TreeNode root,Values min,Values max,int hd) {
		if(root==null) {
			return;
		}
		
		if(hd<min.min) {
			min.min=hd;
//			System.out.println("min"+ min.min);
		}
		else if(hd>max.max) {
			max.max=hd;
//			System.out.println("max"+ max.max);
		}
		
		findMinMax(root.left,min,max,hd-1);
		findMinMax(root.right,min,max,hd+1);
	}
	
	public void printVerticalLines(TreeNode root,int line_no,int hd) {
		
		if(root==null) {
			return;
		}
		
		if(line_no==hd) {
			System.out.print(root.data+ " ");
		}
		
		printVerticalLines(root.left,line_no,hd-1);
		printVerticalLines(root.right,line_no,hd+1);
	}
	
	public void verticalOrder(TreeNode root) {
		
		//to find min. and max. horizontal distance
		findMinMax(root,val,val,0);
		//min=-2
		//max=4;
		for(int line_no=val.min;line_no<=val.max;line_no++) {
			printVerticalLines(root,line_no,0);
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		
		VerticalOrderSet1 tree = new VerticalOrderSet1();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.root.right.left.right = new TreeNode(8);
        tree.root.right.right.right = new TreeNode(9);
  
        System.out.println("vertical order traversal is :");
        tree.verticalOrder(tree.root);
    }
}
