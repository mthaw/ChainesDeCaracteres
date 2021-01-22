import java.util.*;

public class ColdCompress {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		for (int t = 0; t < n; t++) {
			String str = s.nextLine();
			for (int lo = 0, hi = 0; hi < str.length();) {
				while (hi < str.length() && str.charAt(hi) == str.charAt(lo))
					hi++;
				System.out.print((hi - lo) + " " + str.charAt(lo) + " ");
				lo = hi;
			}
			System.out.println();
		}
	}
}
