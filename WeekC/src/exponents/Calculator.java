package exponents;

public class Calculator {
	public int solve(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		} else {
			return base*solve(base, exponent-1);
		}
	}
}
