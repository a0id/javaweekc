package exponents;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();
		Calculator calc = new Calculator();
		System.out.println(calc.factorial(number));
	}
}