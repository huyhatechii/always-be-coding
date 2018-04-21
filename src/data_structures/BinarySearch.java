package data_structures;

import java.util.Random;

import com.sun.org.apache.xpath.internal.FoundIndex;

public class BinarySearch {

	private static boolean foundResult = false;
	private static int result;

	public static void main(String[] args) {
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		System.out.print("init array: ");

		show(arr);
		System.out.println("key: " + 5);

		binarySearch(arr, 5, 0, 9);

		if (foundResult) {
			System.out.println("result: " + result);
		} else {
			System.out.println("Element not present");
		}
	}

	private static void binarySearch(int arr[], int key, int minIndex, int maxIndex) {

		if (maxIndex >= minIndex) {// avoid stack overflow

			int midIndex = (minIndex + maxIndex) / 2;
			if (arr[midIndex] == key) {
				result = midIndex;
				foundResult = true;
				return;
			}
			if (arr[midIndex] > key) {
				binarySearch(arr, key, minIndex, midIndex - 1);
			} else {
				binarySearch(arr, key, midIndex + 1, maxIndex);
			}
		}

	}

	private static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
