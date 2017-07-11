package fibbonacci;
//F{n} = F{n-1} + F{n-2}
public class Fibbonacci {
	/*public int Fibbonacci2(int curr, int last) {
		int sum = curr + last;
		if(sum < 10000) {
			System.out.println(sum);
			return Fibbonacci2(last, sum);
		} else {
			return sum;
		}
	}*/
	public int Fibbo(int curr) {
		if(curr == 0 || curr == 1)
			return curr;
		return Fibbo(curr-1) + Fibbo(curr-2);
		
	}
}