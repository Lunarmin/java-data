package com.data.link;

public class TestDoubleLinkList {

	public static void main(String[] args) {
		DoubleLinkList dl = new DoubleLinkList();
		dl.insertFirst(56);
		dl.insertFirst(23);
		dl.insertFirst(11);
		dl.display();
		
		dl.deleteLast();
		dl.display();
	}

}
