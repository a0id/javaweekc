package sorting;
import java.util.Random;
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
	public ArrayList<Integer> bogosort(ArrayList<Integer> arr) {
		while(!isSorted(arr)) {
			arr = shuffleList(arr);
		}
		return arr;
	}
	
    public static ArrayList<Integer> shuffleList(ArrayList<Integer> a) {
        int n = a.size();
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
        return a;
    }

    private static void swap(ArrayList<Integer> a, int i, int change) {
        int helper = a.get(i);
        a.set(i, a.get(change));
        a.set(change, helper);
    }
	public ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
		for(int x=0;x<arr.size()-1;x++) {
			if(arr.get(x) > arr.get(x+1)) {
				int save = arr.get(x+1);
				for(int i = x + 1; i > 0; i--) {
					if(arr.get(i) < arr.get(i-1)) {
						arr.remove(arr.get(i));
						arr.add(i-1, save);
					}
				}
			}
		}
		return arr;
	}
	public ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
		if(isSorted(arr)) {
			return arr;
		} else {
			int pivot = arr.get(arr.size()-1);
			for(int x=0;x<arr.lastIndexOf(pivot);x++) {
				if(arr.get(x) > pivot) {
					int saved = arr.get(x);
					arr.remove(x);
					arr.add(saved);
					x--;
				}
			}
			int pivPoint = arr.lastIndexOf(pivot);
			ArrayList<Integer> before = new ArrayList<Integer>();
			ArrayList<Integer> after = new ArrayList<Integer>();
			for(int i = 0; i < pivPoint; i++) {
				before.add(arr.get(i));
			}
			for(int i = pivPoint+1; i < arr.size(); i++) {
				after.add(arr.get(i));
			}
			ArrayList<Integer> sorted = new ArrayList<Integer>();
			sorted.addAll(quickSort(before));
			sorted.add(pivot);
			sorted.addAll(quickSort(after));
			return sorted;
		}
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