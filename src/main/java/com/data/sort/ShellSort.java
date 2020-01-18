package com.data.sort;

public class ShellSort {
	public static void main(String[] args) {
		long[] arr = new long[]{1,45,23,13,33};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sort(arr);
		System.out.println("\n=====排序后=====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort(long[] arr){
		//初始化一个间隔
		int h = 1;
		//计算最大间隔
		while(h<arr.length/3){
			h = h * 3 + 1;
		}
		
		while(h>0){
			//进行插入排序
			long tmp = 0;
			for(int i = h;i < arr.length;i++){
				tmp = arr[i];
				int j = i;
				while(j > 0 && arr[j - h] >= tmp){
					arr[j] = arr[j-h];
					j -= h;
				}
				arr[j] = tmp;
			}
			
			//减少间隔
			h = (h-1)/3; 
		}
	}
}
