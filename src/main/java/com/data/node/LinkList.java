package com.data.node;
/*
 * 链表
 */
public class LinkList {
	public Node first;
	public LinkList(){
		first = null;
	}
	
	/**
	 * 插入结点，在头结点后进行插入
	 */
	public void insertFirst(long value){
		Node node = new Node(value);
		node.next = first;
		first = node;
	}
	
	/**
	 * 删除一个结点，在头结点后进行删除
	 * @return
	 */
	public Node deleteFirst(){
		Node tmp = first;
		first = tmp.next;
		return tmp;
	}
	
	/**
	 * 显示
	 */
	public void display(){
		Node current = first;
		while(current!=null){
			current.display();
			current=current.next;
		}
		System.out.println();
	}
	
	
	public Node delete(long value){
		Node current = first;
		Node previous = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			previous = current;
			current=current.next ;
		}
		
		if(current == first){
			first = first.next;
		} else{
			previous.next = current.next;
		}
		return current;
	}
	/**
	 * 查找方法
	 * @param value
	 * @return
	 */
	public Node find(long value){
		Node current = first;
		while(current.data != value){
			if(current.next == null){
				return null;
			}
			current=current.next ;
		}
		return current;
	}
}
