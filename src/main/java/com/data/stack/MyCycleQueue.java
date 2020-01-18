package com.data.stack;

//队
public class MyCycleQueue {
	
	//底层数组
	private long[] arr;
	//有效数据大小
	private int elements;
	//队头
	private int front;
	//队尾
	private int end;
	
	public MyCycleQueue(){
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	public MyCycleQueue(int maxsize){
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	//添加数据 从队尾开始插
	public void insert(long value){
		if(end == arr.length - 1){
			end = -1;
		}
		arr[++end] = value;
		elements++ ;
	}
	
	//删除数据  从队头开始删
	public long remove(){
		long value = arr[front++];
		if(front == arr.length -1){
			front = 0;
		}
		elements--;
		return value;
	}
	
	//查看数据 从队头查看
	public long peek(){
		return arr[front];
	}
	
	//判断是否为空
	public boolean isEmpty(){
		return elements==0;
	}
	
	//判断是否为满
	public boolean isFull(){
		return elements == arr.length;
	}
}
