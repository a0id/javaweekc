package fibbonacci;
public class Fibbonacci {
	public int Fibbo(int curr) {
		if(curr == 0 || curr == 1)
			return curr;
		return Fibbo(curr-1) + Fibbo(curr-2);
	}
}
//Algorithm: F{n} = F{n-1} + F{n-2}