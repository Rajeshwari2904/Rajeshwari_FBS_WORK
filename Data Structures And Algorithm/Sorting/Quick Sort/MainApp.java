package com.sort.quicksort;

public class MainApp {

	int[] numbers = { 23, 6, 25, 3, 99, 10 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainApp app = new MainApp();
		
		System.out.println("Before Sorting: ");
		app.print();
		
		app.quick(app.numbers);
	
		System.out.println("After Sorting: ");
		app.print();

	}

	public void quick(int[] ref) {

		sort(ref, 0, ref.length - 1);

	}

	public void sort(int[] arr, int low, int high) {

		if(low < high) {
			
			int divisionPos = divide(arr, low, high);
			sort(arr, low, divisionPos - 1);
			sort(arr, divisionPos + 1, high);
		}
		
	}

	public int divide(int[] ref, int low, int high) {

		int pivot = ref[high];
		int first = low - 1;

		for (int second = low; second < high; second++) {

			if (ref[second] <= pivot) {

				first++;
				int temp = ref[first];
				ref[first] = ref[second];
				ref[second] = temp;

			}
		}

		int temp = ref[first + 1];
		ref[first + 1] = ref[high];
		ref[high] = temp;
		return first + 1;

	}

	public void print() {

		for (int ctr = 0; ctr < numbers.length; ctr++) {

			System.out.println(numbers[ctr] + " ");
		}

		System.out.println();
	}

}
