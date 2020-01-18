package com.data.tree;

public class Tree {
	//根节点
	public Node root;
	
	/**
	 * 插入节点
	 * @param value
	 */
	public void insert(long value){
		//封装对象
		Node newNode = new Node(value);
		//引用当前节点
		Node current = root;
		//引用父节点
		Node parent;
		if(root == null){
			root = newNode;
			return;
		}else{
			while(true){
				//父节点是当前节点
				parent = current;
				//如果当前指向的节点数据比插入的大，则向左走
				if(parent.data>value){
					current = current.leftChild;
					if(current == null){
						parent.leftChild = newNode;
						return;
					}
				}else{
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}	
		}
	}
	
	/**
	 * 查找节点
	 * @param value
	 */
	public Node find(long value){
		//引用当前节点，从根节点开始
		Node current = root;
		//循环，只要查找的值不等于当前节点的数据项
		while(current.data != value){
			if(current.data > value){
				current = current.leftChild;
			}else{
				current = current.rightChild;
			}
			if(current == null){
				return null;
			}
		}
		return current;
	}
	
	/**
	 * 删除节点
	 * @param value
	 */
	public boolean delete(long value){
		//引用当前节点，从根节点开始
		Node current = root;
		
		//引用当前节点的父节点
		Node parent = root;
		
		//是否为左节点
		boolean isLeftChild = true;
		
		while(current.data != value){
			parent = current;
			if(current.data > value){
				current = current.leftChild;
				isLeftChild = true;
			}else{
				current = current.rightChild;
				isLeftChild = false;
			}
			if(current == null){
				return false;
			}
		}
		
		//删除叶子节点，也就是该节点没有字节点
		if(current.leftChild == null && current.rightChild == null){
			if(current == root){
				root = null;
			}
			//如果它是父节点的左子节点
			else if(isLeftChild){
				parent.leftChild = null;
			}else{
				parent.rightChild = null;
			}
		}else if(current.rightChild == null){
			if(current == root){
				root = current.leftChild;
			}else if(isLeftChild){
				parent.leftChild = current.leftChild;
			}else{
				parent.rightChild = current.leftChild;
			}
		}else if(current.leftChild == null){
			if(current == root){
				root = current.rightChild;
			}else if(isLeftChild){
				parent.leftChild = current.rightChild;
			}else{
				parent.rightChild = current.rightChild;
			}
		}else{
			Node successor = getSuccesscor(current);
			if(current == root){
				root =successor;
			}else if(isLeftChild){
				parent.leftChild = successor;
			}else{
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return true;
	}
	
	//返回中继后序节点
	public Node getSuccesscor(Node delNode){
		Node successor = delNode;
		Node successorParent = delNode;
		Node current = delNode.rightChild;
		
		while(current != null){
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		if(successor != delNode.rightChild){
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	public void frontOrder(Node localNode){
		if(localNode != null){
			//访问根节点
			System.out.println(localNode.data);
			//前序遍历左子树
			frontOrder(localNode.leftChild);
			//前序遍历右子树
			frontOrder(localNode.rightChild);
		}
	}
	
	public void inOrder(Node localNode){
		if(localNode != null){
			//中序遍历左子树
			inOrder(localNode.leftChild);
			//访问根节点
			System.out.println(localNode.data);
			//中序遍历右子树
			inOrder(localNode.rightChild);
		}
	}
	
	public void backOrder(Node localNode){
		if(localNode != null){
			//后序遍历左子树
			backOrder(localNode.leftChild);
			//后序遍历右子树
			backOrder(localNode.rightChild);
			//访问根节点
			System.out.println(localNode.data);
			
		}
	}
	
}
