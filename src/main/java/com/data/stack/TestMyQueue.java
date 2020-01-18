package com.data.stack;

public class TestMyQueue {

	public static void main(String[] args) {
		MyCycleQueue mq = new MyCycleQueue();
		mq.insert(56);
		mq.insert(25);
		mq.insert(15);

		System.out.println("是否为空："+mq.isEmpty());
		System.out.println("是否为满："+mq.isFull());
		
		System.out.println(mq.peek());
		
		
		while(!mq.isEmpty()){
			System.out.print(mq.remove()+" ");
		}
		
		mq.insert(96);
	}

}
