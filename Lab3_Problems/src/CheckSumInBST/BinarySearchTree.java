package CheckSumInBST;
public class BinarySearchTree 
{
	Node root;
	class Node
	{
		int data;
		Node left, right;
		Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}
	
	BinarySearchTree()
	{
		root = null;
	}
	
	void insert(int data)
	{
		root = addElement(root, data);
	}
	
	private Node addElement(Node root, int data)
	{
		if(root==null)
		{
			root = new Node(data);
			return root;
		}
			
		if(data < root.data)
			root.left = addElement(root.left, data);
		else if(data > root.data)
			root.right = addElement(root.right, data);
		return root;
	}
	
	void inOrder()
	{
		inOrderImplementation(root);
	}
	
	void inOrderImplementation(Node root)
	{
		if(root!=null)
		{
			inOrderImplementation(root.left);
			System.out.println(root.data);
			inOrderImplementation(root.right);
		}
	}
	
}
