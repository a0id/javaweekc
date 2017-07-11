package hanoi;

public class Algorithm {
	public void answer(int amount, String start, String middle, String end) {
       if (amount == 1) {
           System.out.println(start + " -> " + end);
       } else {
           answer(amount - 1, start, end, middle);
           System.out.println(start + " -> " + end);
           answer(amount - 1, middle, start, end);
       }
	
	}
	public int moves(int num, int times) {
		if(num == 1) {
			return num;
		} else if(times > num) {
			times--;
			int extraNum = num + 1 + num;
			return moves(extraNum, times);
		} else {
			return num;
		}

	}
}