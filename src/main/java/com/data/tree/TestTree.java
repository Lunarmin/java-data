package com.data.tree;

public class TestTree {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(15);
		tree.insert(3);
		tree.insert(4);
		tree.insert(90);
		/*System.out.println(tree.root.data);
		System.out.println(tree.root.leftChild.data);
		System.out.println(tree.root.rightChild.data);
		System.out.println(tree.root.rightChild.leftChild.data);

		Node node=tree.find(20);
		System.out.println(node.leftChild.data);*/
	
		//tree.frontOrder(tree.root);
		
		//tree.inOrder(tree.root);
		//tree.backOrder(tree.root);
		
		tree.delete(15);
		tree.inOrder(tree.root);
	}

}
