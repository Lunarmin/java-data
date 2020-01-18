package com.data.hash;

public class TestHashTable {

	public static void main(String[] args) {
		HashTable table = new HashTable();
		
		table.insert(new Info("a","张三"));
		table.insert(new Info("ct","李四"));
		table.insert(new Info("b","王五"));
		System.out.println(table.find("a"));
		System.out.println(table.find("ct"));
		System.out.println(table.find("b"));
	}

}
