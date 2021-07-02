import java.util.Queue;
import java.util.LinkedList;
public class levelOrder {
private TreeNode root;
	
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
	
	public void treeDemo() {
		TreeNode first=new TreeNode(1);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		TreeNode fifth=new TreeNode(5);
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		second.right=fifth;
		System.out.println("Level Order: ");
		Order(root);
		System.out.println("null");
	}
	
	public void Order(TreeNode root) {
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		TreeNode temp=root;
		queue.add(root);
		while(!queue.isEmpty()) {
			temp=queue.peek();
			queue.remove();
			System.out.print(temp.data+"--");
			if(temp.left!=null) {
				queue.add(temp.left);
			}
			if(temp.right!=null) {
				queue.add(temp.right);
			}
		}
	}
	
	public static void main(String[] args) {
		levelOrder treeObj=new levelOrder();
		treeObj.treeDemo();
		
		
	}

}
