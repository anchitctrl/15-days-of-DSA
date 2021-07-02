public class implementTree {
	
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
		System.out.print("PreOrder: ");
		preOrder(root);
		System.out.println("null");
		System.out.print("Inorder: ");
		inOrder(root);
		System.out.println("null");
		System.out.print("PostOrder: ");
		postOrder(root);
		System.out.println("null");
	}
	
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+"-->");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+"-->");
		inOrder(root.right);
	}
	
	public void postOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+"-->");
	}
	
	public static void main(String[] args) {
		implementTree treeObj=new implementTree();
		treeObj.treeDemo();
		
		
	}
}
