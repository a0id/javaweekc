package sorting;

import java.util.ArrayList;

public class InsertionSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Sorter insert = new Sorter();
		for(int i=0;i<10;i++) {
			arr.add(i);
		}
		Sorter shuffle = new Sorter();
		System.out.println(shuffle.shuffleList(arr));
		ArrayList<Integer> sorted = insert.insertionSort(arr);	
		System.out.println(sorted);
	}
}
