import java.util.*;

public class WinningScore {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a3 = s.nextInt(), a2 = s.nextInt(), a1 = s.nextInt();
		int b3 = s.nextInt(), b2 = s.nextInt(), b1 = s.nextInt();
		int scorea = a3 * 3 + a2 * 2 + a1, scoreb = b3 * 3 + b2 * 2 + b1;
		if (scorea > scoreb)
			System.out.println("A");     
		else if (scoreb > scorea)
			System.out.println("B");
		else
			System.out.println("T");
	} 
}
