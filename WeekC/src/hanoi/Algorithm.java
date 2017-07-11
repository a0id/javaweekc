package hanoi;
public class Algorithm {
	public void answer(int amount, String left, String middle, String right) {
       if (amount == 1) { 
    	   System.out.println("Move peg " + left + " to peg " + right);
       } else {
           answer(amount - 1, left, right, middle);
           System.out.println("Move peg " + left + " to peg " + right);
           answer(amount - 1, middle, left, right);
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
//ALGORITHM SMALLEST PIECE TWO PEGS TO THE RIGHT EVERY OTHER TURN