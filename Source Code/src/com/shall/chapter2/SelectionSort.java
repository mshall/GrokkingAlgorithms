package com.shall.chapter2;

public class SelectionSort {

	public static void main(String[] args) {
		int [] array = {5,3,0,2,1};
		array = sortArray(array);
		printArray(array);
	}

	public static void printArray(int[] array) {
		for(int element : array) {
			System.out.print(element+" ");
		}
	}

	public static int[] sortArray(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			// Now start making the swap
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		return array;

	}

}
