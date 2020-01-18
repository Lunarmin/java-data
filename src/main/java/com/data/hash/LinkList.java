package com.data.hash;
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
	public void insertFirst(Info info){
		Node node = new Node(info);
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

	
	public Node delete(String key){
		Node current = first;
		Node previous = first;
		while(!key.equals(current.info.getKey())){
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
	public Node find(String key){
		Node current = first;
		while(key.equals(current.info.getKey())){
			if(current.next == null){
				return null;
			}
			current=current.next ;
		}
		return current;
	}
}
