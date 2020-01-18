package com.data.node;

public class TestLinkList {

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insertFirst(35);
		linkList.insertFirst(45);
		linkList.insertFirst(25);
		linkList.insertFirst(15);
		linkList.display();
		linkList.deleteFirst();
		linkList.display();
		Node node = linkList.find(35);
		node.display();
		System.out.println("");
		linkList.delete(45);
		linkList.display();
	}

}
