package com.data.stack;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(32);
		ms.push(25);
		
		System.out.println("是否为空："+ms.isEmpty());
		System.out.println("是否为满："+ms.isFull());
		
		while(!ms.isEmpty()){
			System.out.print(ms.pop()+" ");
		}
	}

}
