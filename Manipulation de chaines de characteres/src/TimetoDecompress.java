import java.util.*;

public class TimetoDecompress {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lignes = s.nextInt();
		for (int l = 0; l < lignes; l++) {
			int montant = s.nextInt();
			char symbole = s.next().charAt(0);
			for (int i = 0; i < montant; i++) {
				System.out.print(symbole);
			}
			System.out.println();
		}
	}
}
