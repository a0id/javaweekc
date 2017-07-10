package syntax;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Basics first = new Basics();
		System.out.println(first.bool);
		first.Filler();
		first.Printer();
		String hi = "hi";
		if(sc.next().equals(hi)) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}
		int x = 10;
		System.out.println("One string " + x);
		String str2 = first.ReturnStr() + " hey";
		System.out.println(str2);
	}

}
