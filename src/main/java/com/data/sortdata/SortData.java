package com.data.sortdata;

/**
 * 排序数据
 * @author Panlf
 *
 */
public class SortData {

	/**
	 * 冒泡排序
	 * @param arr
	 * 
	 * 冒泡排序算法的原理如下：
	 *	比较相邻的元素。如果第一个比第二个大，就交换他们两个。
	 *	对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
	 *	针对所有的元素重复以上的步骤，除了最后一个。
	 *	持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
	 */
	public static void bubbleSort(long[] arr) {
		long temp = 0;
		for(int i =0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 选择排序
	 * 每一次从待排序的数据元素中选出最小（或最大）的一个元素，
	 * 存放在序列的起始位置，直到全部待排序的数据元素排完。
	 * @param arr
	 */
	public static void selectSort(long[] arr) {
		int k = 0;
		long temp =0;
		
		for(int i=0;i<arr.length;i++) {
			k = i;
			for(int j= i;j<arr.length;j++) {
				if(arr[j]<arr[k]) {
					k = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
	
	/**
	 * 插入排序
	 * 1、从第一个元素开始，该元素可以认为已经被排序
	 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描
	 * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置
	 * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
	 * 5、将新元素插入到该位置后
	 * 6、重复步骤2~5
	 * @param arr
	 */
	public static void insertSort(long[] arr) {
		long temp = 0;
		for(int i=1;i<arr.length;i++) {
			temp = arr[i];
			int j = i;
			while(j > 0 && arr[j] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
}
