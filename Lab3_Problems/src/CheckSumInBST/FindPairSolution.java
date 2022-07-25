package CheckSumInBST;

import java.util.ArrayList;

import CheckSumInBST.BinarySearchTree.Node;

public class FindPairSolution {
	
	public static void MySolution(BinarySearchTree tree, int sum)
	{
		ArrayList<Integer> tempArrayOne = new ArrayList<>();
		
		ArrayList<Integer> tempArrayTwo = treeToArrayList(tree.root, tempArrayOne);
		
		System.out.println("My List is: ");
		for(int i=0;i<tempArrayTwo.size();i++)
		{
			if(tempArrayTwo.contains(sum-tempArrayTwo.get(i)))
			{
				System.out.println("Pair is: (" + tempArrayTwo.get(i) + ", " + (sum-tempArrayTwo.get(i)) + ")");
				break;
			}
		}
		
		System.out.println("Nodes are not found");
		
		
	}
	
	public static ArrayList<Integer> treeToArrayList(Node node, ArrayList<Integer> myList)
	{
		if(node==null)
		{
			return myList;
		}
		treeToArrayList(node.left, myList);
		myList.add(node.data);
		treeToArrayList(node.right, myList);
		
		return myList;
	}

}
