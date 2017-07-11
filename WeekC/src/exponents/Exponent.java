package exponents;
import java.util.Scanner;
public class Exponent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base: ");
		int base = scan.nextInt();
		System.out.println("Enter exponent: ");
		int exponent = scan.nextInt();
		Calculator calc = new Calculator();
		System.out.println(calc.exponent(base, exponent));
	}
}