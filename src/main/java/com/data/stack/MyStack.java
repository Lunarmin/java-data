package com.data.stack;

//栈
//后进先出
public class MyStack {
	//底层是数组
	private long[] arr;
	
	private int top;
	
	public MyStack(){
		arr = new long[10];
		top = -1;
	}
	
	//带参构造方法，参数为数组初始化大小
	public MyStack(int maxsize){
		arr = new long[maxsize];
		top = -1;
	}
	
	//添加数据
	public void push(int value){
		arr[++top] = value;
	}
	
	//移除数据
	public long pop(){
		return arr[top--];
	}
	
	//查看数据
	public long peak(){
		return arr[top];
	}
	
	
	//判断是否为空
	public boolean isEmpty(){
		return top == -1;
	}
	
	//判断是否满了
	public boolean isFull(){
		return top == arr.length-1;
	}
	
}
