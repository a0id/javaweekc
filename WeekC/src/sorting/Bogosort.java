package sorting;

import java.util.ArrayList;

public class Bogosort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Sorter bogo = new Sorter();
		for(int i=0;i<10;i++) {
			arr.add(i);
		}
		Sorter shuffle = new Sorter();
		shuffle.shuffleList(arr);
		ArrayList<Integer> arry = bogo.bogosort(arr);
		System.out.println(arr);
	}

}
