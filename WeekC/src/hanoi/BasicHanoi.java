package hanoi;
import java.util.Scanner;
public class BasicHanoi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Amount of Blocks: ");
		int amount = scan.nextInt();
		Algorithm simple = new Algorithm();
		System.out.println(simple.moves(amount, amount));

	}

}
