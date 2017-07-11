package exponents;

public class Calculator {
	public int exponent(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		} else {
			return base*exponent(base, exponent-1);
		}
	}
	public int factorial(int number) {
		if(number == 1) {
			return 1;
		} else {
			return factorial(number-1) * number;
		}
	}
}