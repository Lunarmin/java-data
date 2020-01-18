package com.data.sortdata;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.insert(15);
		myArray.insert(35);
		myArray.insert(12);
		myArray.display();
		
		System.out.println(myArray.search(35));
		
		MyOrderArray myOrderArray = new MyOrderArray();
		myOrderArray.insert(15);
		myOrderArray.insert(35);
		myOrderArray.insert(12);
		myOrderArray.display();
		
		System.out.println(myOrderArray.binarySearch(12));
	}

}
