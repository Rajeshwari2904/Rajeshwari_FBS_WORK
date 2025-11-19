package com.sort.bubblesort;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;
		Scanner sc = new Scanner(System.in);

		System.out.println("Entet Size of Array: ");
		size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter " + size + " elements: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}

		System.out.println("Before Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}

		bubbleSort(arr);
		System.out.println();

		System.out.println("After Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
	}

	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}

	}
}
