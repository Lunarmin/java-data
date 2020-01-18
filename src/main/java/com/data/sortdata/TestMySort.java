package com.data.sortdata;

public class TestMySort {

	public static void main(String[] args) {
		long[] arr = new long[5];
		arr[0] = 12;
		arr[1] = 22;
		arr[2] = 2;
		arr[3] = 1;
		arr[4] = 16;
		
		System.out.println("-----原始----");
		for (long l : arr) {
			System.out.print(l+" ");
		}
		/*System.out.println();
		System.out.println("---冒泡排序---");
		SortData.bubbleSort(arr);
		for (long l : arr) {
			System.out.print(l+" ");
		}*/
		
		System.out.println();
		System.out.println("---选择排序---");
		SortData.selectSort(arr);
		for (long l : arr) {
			System.out.print(l+" ");
		}
		
		
	}

}
