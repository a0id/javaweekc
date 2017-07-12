package sorting;

import java.util.ArrayList;

public class BubbleSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] array = {4, 1, 7, 2, 6, 9, 3, 8, 0, 5};
		for(int i=0;i<array.length;i++) {
			arr.add(array[i]);
		}
		
		Sorter bubble = new Sorter();
		arr = bubble.bubbleSort(arr);
		for(int y:arr) {
			System.out.println(y);
		}
	}
}