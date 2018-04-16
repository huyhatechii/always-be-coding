package sorting;

import java.util.Random;

public class QuickSort {

	private static int arr[] = new int[5];

	public static void main(String[] args) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10);
		}

		System.out.print("before sort: ");

		show(arr);

		sortByQuickSort(0, arr.length - 1);

		System.out.println(" ");
		System.out.print("after sort: ");

		show(arr);
	}

	private static void sortByQuickSort(int low, int hight) {
		if(low < hight) {
			int i = patition(low, hight);
			sortByQuickSort(low, i - 1);
			sortByQuickSort(i + 1, hight);
		}
	}

	private static int patition(int low, int hight) {
		
		int i = low - 1;

		for (int j = low; j < hight; j++) {

			if (arr[j] < arr[hight]) {
				i++;
				// swap arr[i], arr[j]
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[hight];
		arr[hight] = temp;
		return i + 1;

	}

	private static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
