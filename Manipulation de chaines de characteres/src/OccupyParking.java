import java.util.*;

public class OccupyParking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int longueur = s.nextInt();
		s.nextLine();
		String str1 = s.nextLine(), str2 = s.nextLine();
		int compteur = 0;
		for (int i = 0; i < longueur; i++) {
			if (str1.charAt(i) == 'C' && str2.charAt(i) == 'C') {
				compteur++;
			}
		}
		System.out.println(compteur);
	}
}
