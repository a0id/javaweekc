package sorting;

import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Sorter insert = new Sorter();
		int[] array = {4, 1, 7, 2, 6, 9, 3, 8, 0, 5};
		for(int i=0;i<array.length;i++) {
			arr.add(array[i]);
		}
		ArrayList<Integer> arry = insert.insertionSort(arr);
		for(int y:arry) {
			System.out.println(y);
		}

	}

}
