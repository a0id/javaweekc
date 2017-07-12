package sorting;

import java.util.ArrayList;

public class Sorter {
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
		while(!isSorted(arr)) {
			for(int x = 0; x < arr.size()-1; x++) {
				if(arr.get(x) > arr.get(x+1)) {	
					int tempArr = arr.get(x);
					arr.set(x,arr.get(x+1));
					arr.set(x+1, tempArr);
				}
			}
		}
		return arr;
	}
	public ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
		while(!isSorted(arr)) {
			for(int x=0;x<arr.size()-1;x++) {
				if(arr.get(x+1) > arr.get(x)) {
					int save = arr.get(x+1);
					arr.remove(x+1);
					for(int i=arr.get(x); i >= 0; i--) {
						if(arr.get(x) > arr.get(x-1)) {
							//swap?
						}
					}
					/*System.out.println("x is:  " + x);
					int temp = arr.get(x+1);
					arr.set(x+1, x);
					arr.set(x, temp);
					System.out.println(arr.get(x));*/
				}
			}
		}
		return arr;
	}
	public boolean isSorted(ArrayList<Integer> arr) {
		for(int x = 0; x < arr.size()-1; x++) {
			if(arr.get(x) > arr.get(x+1)) {
				return false;
			}
		}
		return true;
	}
}