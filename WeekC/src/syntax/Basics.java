package syntax;

public class Basics {
	int[] array;
	boolean bool;
	String str;
	int i;
	public Basics() {
		int i = 0;
		bool = true;
		array = new int[5];
		str = "Hello World!";		
	}
	public void Filler() {
		for(int x = 0; x < 5; x++) {
			array[x] = x;
		}
	}
	public String ReturnStr() {
		return str;
	}
	public void Printer() {
		for(int x = 0; x < array.length; x++) {
			System.out.println(x);
		}
	}
}