package com.data.link;

/**
 * 链接点
 */
public class DoubleNode {
	//数据域
	public long data;
	//指针域
	public DoubleNode next;
	
	public DoubleNode previous;
	
	public DoubleNode(long value){
		this.data=value;
	}
	
	public void display(){
		System.out.print(data+" ");
	}
}
