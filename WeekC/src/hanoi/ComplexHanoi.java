package hanoi;
import java.util.Scanner;

public class ComplexHanoi {

	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.print("Amount: ");
       int amount = scanner.nextInt();
	   Algorithm hanoi = new Algorithm();
	   System.out.println("Minimum Moves: " + hanoi.moves(amount));
       hanoi.answer(amount, "A", "B", "C");
	}

}
