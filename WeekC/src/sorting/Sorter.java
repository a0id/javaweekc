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
    
	public ArrayList<Integer> oldinsertionSort(ArrayList<Integer> arr) {
		//while(!isSorted(arr)) {
			System.out.println("working in while");
			for(int x=0;x<arr.size()-1;x++) {
				for(int y:arr) {
					System.out.print(y);
				}
				System.out.println();
				System.out.println("working in big for");
				//System.out.println("x value is: " + x);
				if(arr.get(x+1) > arr.get(x)) {
					
					int save = arr.get(x+1);
					arr.remove(x+1);
					System.out.println("does this iffffff work");
					for(int i=x; i >= 0; i--) {
						System.out.println("working in nesttttttttttttttttttttttttttttt");
						if(arr.get(x) < arr.get(x-1)) {
							arr.add(x-1, save);
						}
					}
					/*System.out.println("x is:  " + x);
					int temp = arr.get(x+1);
					arr.set(x+1, x);
					arr.set(x, temp);
					System.out.println(arr.get(x));*/
				}
			}
		//}
		System.out.println("returned");
		return arr;
	}
	public ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
		for(int x=0;x<arr.size()-1;x++) {
			if(arr.get(x) > arr.get(x+1)) {
				int save = arr.get(x+1);
				for(int i = x + 1; i > 0; i--) {

					if(arr.get(i) < arr.get(i-1)) {
						for(int yo:arr) {System.out.print(yo);}System.out.println();
						arr.remove(arr.get(i));
						arr.add(i-1, save);
						
					}
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