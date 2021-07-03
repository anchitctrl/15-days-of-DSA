
import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

public class MyVertical {
	static class Node 
	{
		int key;
		Node left;
		Node right;
		Node(int data)
		{
			key=data;
			left=null;
			right=null;
		}
	}
	static void createVerticalOrder(Node root,int hd,TreeMap<Integer,Vector<Integer>> m)
	{
		if(root==null)
			return;
		Vector<Integer> get=m.get(hd);
		if(get==null)
		{
			get=new Vector<Integer>();
			get.add(root.key);
		}
		else
			get.add(root.key);
		m.put(hd, get);
		createVerticalOrder(root.left,hd-1,m);
		createVerticalOrder(root.right,hd+1,m);
		
	}
	static void printVerticalOrder(Node root)
	{
		TreeMap<Integer,Vector<Integer>> m=new TreeMap<>();
		int hd=0;
		createVerticalOrder(root,hd,m);
		for(Entry<Integer,Vector<Integer>> entry:m.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}
	public static void main(String[] args)
	{
		  Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.right.left = new Node(6);
	        root.right.right = new Node(7);
	        root.right.left.right = new Node(8);
	        root.right.right.right = new Node(9);
	        printVerticalOrder(root);
	}

}
