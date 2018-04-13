package sorting;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10);
		}

		System.out.print("arr before sort: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int sortedArr[] = sortBySelection(arr);

		System.out.println(" ");

		System.out.print("arr after sort: ");
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i] + " ");
		}
	}

	private static int[] sortBySelection(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;

			for (int j = i; j < arr.length; j++) {
				if (arr[j] <= arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int tempValue = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tempValue;

		}
		return arr;
	}
}
