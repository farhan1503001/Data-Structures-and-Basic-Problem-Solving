import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class BinarySearchTree {
	public static Node insertnode(Node root,int data)
	{
		//if root is none
		if(root==null)
		{
			return new Node(data);
		}
		else {
		//Node curr=null;
		if(data<=root.data)
		{
			root.left=insertnode(root.left, data);
		}
		else {
			root.right=insertnode(root.right, data);
		}
		
		return root;
		}
	}
	public static void pre_order(Node root)
	{
		//root-left-right
		if(root==null)
		{
			return;
		}
		//print
		System.out.println(root.data);
		pre_order(root.left);
		pre_order(root.right);
	}
	public static void post_order(Node root) {
		//left//right//data
		if(root==null)
		{
			return;
		}
		post_order(root.left);
		post_order(root.right);
		System.out.print(root.data+" ");
	}
	public static void Inorder(Node root) {
		//left-data-right
		if(root==null)
			return;
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
	}
	public static int bst_depth(Node root) {
		if(root==null)//leaf node will return 0
		{
			return -1;
		}
		int l_depth=bst_depth(root.left);
		int r_depth=bst_depth(root.right);
		if (l_depth>r_depth) {
			return l_depth+1;
		}
		else {
			return r_depth+1;
		}
	}
	public static void level_order(Node root)
	{
		//declare queue//just like breadth first search
		Queue<Node>leveler=new LinkedList<Node>();
		//add root to the queue
		leveler.add(root);
		System.out.println();
		while(!leveler.isEmpty())
		{
			Node temp=leveler.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{
				leveler.add(temp.left);
			}
			if(temp.right!=null)
			{
				leveler.add(temp.right);
			}
		}
	}
	public static void lowest_common_anchestor(Node root,int num1,int num2)
	{
		//it's search operation where we will move and try to find
		//anchestor happens to be greater than left smaller than right
		while(root!=null)
		{
			//if root is greater than both num1 and num2 then they are in left
			if(root.data>num1 && root.data>num2)
			{
				root=root.left;
				
			}
			else if(root.data<num1 && root.data<num2)
			{
				root=root.right;
			}
			else {
				break;
			}
		}
		System.out.println();
		System.out.println(root.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Node root=null;
		while(t-->0)
		{
			int data=sc.nextInt();
			root=insertnode(root,data);
		}
		pre_order(root);
		post_order(root);
		Inorder(root);
		int depth=bst_depth(root);
		level_order(root);
		System.out.println("\n depth is "+depth);
		lowest_common_anchestor(root,8,14);

	}

}
