package hanoi;

public class Algorithm {
	public void answer(int amount, String start, String middle, String end) {
       if (amount == 1) {
           System.out.println("Move peg " + start + " to peg " + end);
       } else {
           answer(amount - 1, start, end, middle);
           System.out.println("Move peg " + start + " to peg " + end);
           answer(amount - 1, middle, start, end);
       }
	
	}
	public int moves(int amount) {
		if(amount == 1) {
			return 1;
		} else {
			return moves(amount-1) + 1 + moves(amount-1);
		}
	}
}