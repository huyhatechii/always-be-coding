package sorting;

import java.util.Random;

public class MergeSort {
	static int arr[] = { 100, 8, 7, 60, 5, 4, 3, 90, 1, 101 };

	public static void main(String[] args) {

		System.out.print("before sort: ");

		show(arr);
		sort(0, 0, 9);
		System.out.println(" ");
		System.out.print("after sort: ");

		show(arr);
	}

	private static void sort(int left, int midle, int right) {
		
		if (left < midle) {
			int leftQuarter = (left + midle) / 2;
			sort(left, leftQuarter, midle);

		}

		if (midle + 1 < right) {
			int rightQuarter = (midle + 1 + right) / 2;
			sort(midle + 1, rightQuarter, right);
		}
		
		merge(left, midle, right);
	}

	private static void merge(int left, int midle, int right) {

		// copy to 2 sub array
		int leftArr[] = new int[midle - left + 1];
		int rightArr[] = new int[right - midle];

		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = arr[left + i];
		}

		for (int i = 0; i < rightArr.length; i++) {
			rightArr[i] = arr[midle + i + 1];
		}

		//
		int k = left - 1;
		for (int i = 0; i < leftArr.length; i++) {
			for (int j = 0; j < rightArr.length; j++) {

				if (leftArr[i] > rightArr[j] && rightArr[j] != -1) {

					arr[++k] = rightArr[j];
					rightArr[j] = -1;
				}

			}
			arr[++k] = leftArr[i];

		}
	}

	private static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
