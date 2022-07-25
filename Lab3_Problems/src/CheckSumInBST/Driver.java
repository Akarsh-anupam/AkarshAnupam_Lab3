package CheckSumInBST;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args)
	{
		int size,sumToCheck;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements to insert in BST: ");
		size = sc.nextInt();
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		System.out.println("Enter the element of BST: ");
		for(int i=0;i<size;i++)
		{
			binarySearchTree.insert(sc.nextInt());
		}
//		System.out.println("Inorder Traversal is: ");
//		binarySearchTree.inOrder();
		System.out.println("Enter the Sum to check: ");
		sumToCheck = sc.nextInt();
		FindPairSolution.MySolution(binarySearchTree, sumToCheck);
		sc.close();
	}

}
