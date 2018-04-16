package sorting;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(10);
		}

		System.out.print("before sort: ");

		show(arr);

		int sortedArr[] = sortByBubble(arr);

		System.out.println(" ");
		System.out.print("after sort: ");

		show(sortedArr);
	}

	private static int[] sortByBubble(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
	
	private static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
