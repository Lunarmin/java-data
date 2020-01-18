package com.data.hash;

public class TestHashTableList {

	public static void main(String[] args) {
		HashTableList table = new HashTableList();
		
		table.insert(new Info("a","张三"));
		table.insert(new Info("ct","李四"));
		System.out.println(table.find("a"));
		System.out.println(table.find("ct"));
	}

}
