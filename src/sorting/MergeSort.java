package sorting;

import java.util.Random;

public class MergeSort {
	static int arr[] = { 100, 8, 7, 60, 5, 4, 3, 90, 1, 101 };

	public static void main(String[] args) {

		System.out.print("before sort: ");

		show(arr);
		sort(0, arr.length - 1);
		System.out.println(" ");
		System.out.print("after sort: ");

		show(arr);
	}

	private static void sort(int left, int right) {

		int middle = (right + left) / 2;

		if (left < right) {
			sort(left, middle);
			sort(middle + 1, right);
		}

		merge(left, middle, right);
	}

	private static void merge(int left, int middle, int right) {

		// copy to 2 sub array
		int leftArr[] = new int[middle - left + 1];
		int rightArr[] = new int[right - middle];

		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = arr[left + i];
		}

		for (int i = 0; i < rightArr.length; i++) {
			rightArr[i] = arr[middle + i + 1];
		}

		// merge
		int i = 0, j = 0;
		int k = left - 1;
		while (i < leftArr.length && j < rightArr.length) {
			if (leftArr[i] <= rightArr[j]) {
				arr[++k] = leftArr[i];
				i++;
			} else {
				arr[++k] = rightArr[j];
				j++;
			}
		}

		while (i < leftArr.length) {
			arr[++k] = leftArr[i];
			i++;
		}

		while (j < rightArr.length) {
			arr[++k] = rightArr[j];
			j++;
		}
	}

	private static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
