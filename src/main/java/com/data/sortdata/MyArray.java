package com.data.sortdata;

public class MyArray {
	private long[] arr;
	
	//表示有效数据的长度
	private int elements;
	
	public MyArray() {
		arr = new long[50];
	}
	
	public MyArray(int maxsize) {
		arr = new long[maxsize];
	}
	
	/**
	 * 添加数据
	 */
	public void insert(long value) {
		arr[elements] = value;
		elements++ ;
	}
	
	/**
	 * 显示数组元素
	 */
	public void display() {
		System.out.print("[");
		for(int i=0;i<elements;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}
	
	public int search(long value) {
		int i;
		for(i =0;i<elements;i++) {
			if(value == arr[i]) {
				break;
			}
		}
		if(i == elements) {
			return -1;
		}else {
			return i;
		}	
	}
	
	public long get(int index) {
		if(index > elements|| index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			return arr[index];
		}
	}
	
	
	public void delete(int index) {
		if(index > elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			for(int i=index;i<elements;i++) {
				arr[index] = arr[index+1];
			}
			elements--;
		}
	}
	
	public void update(int index,long newValue) {
		if(index > elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}else {
			arr[index] = newValue;
		}
	}
}
