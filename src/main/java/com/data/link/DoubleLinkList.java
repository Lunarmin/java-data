package com.data.link;
/*
 * 双向链表
 */
public class DoubleLinkList {
	//头结点
	public DoubleNode first;
	//尾结点
	public DoubleNode last;
	
	public DoubleLinkList(){
		first = null;
		last = null;
	}
	
	/**
	 * 插入结点，在头结点后进行插入
	 */
	public void insertFirst(long value){
		DoubleNode node = new DoubleNode(value);
		if(isEmpty()){
			last = node;
		}else{
			first.previous=node;
		}
		node.next = first;
		first = node;
	}
	
	/**
	 * 插入结点，在尾结点后进行插入
	 */
	public void insertLast(long value){
		DoubleNode node = new DoubleNode(value);
		if(isEmpty()){
			first = node;
		}else{
			last.next = node;
			node.previous = last;
		}
		
		last = node;
	}
	
	/**
	 * 删除一个结点，在头结点后进行删除
	 * @return
	 */
	public DoubleNode deleteFirst(){
		DoubleNode tmp = first;
		if(first.next == null){
			last = null;
		}else{
			first.next.previous = null;
		}
		first = tmp.next;
		return tmp;
	}
	
	/**
	 * 删除一个结点，在尾结点后进行删除
	 * @return
	 */
	public DoubleNode deleteLast(){
		if(first.next == null){
			first = null;
		}else{
			last.previous.next = null;
		}
		last = last.previous;
		return last;
	}
	
	/**
	 * 显示
	 */
	public void display(){
		DoubleNode current = first;
		while(current!=null){
			current.display();
			current=current.next;
		}
		System.out.println();
	}
	
	
	public DoubleNode delete(long value){
		DoubleNode current = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			current=current.next ;
		}
		
		if(current == first){
			first = first.next;
		} else{
			current.previous.next = current.next;
		}
		return current;
	}
	/**
	 * 查找方法
	 * @param value
	 * @return
	 */
	public DoubleNode find(long value){
		DoubleNode current = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			current=current.next ;
		}
		return current;
	}
	
	//判断是否为空
	public boolean isEmpty(){
		return (first == null);
	}
}
