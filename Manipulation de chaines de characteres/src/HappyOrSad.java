import java.util.*;

public class HappyOrSad {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String message = s.nextLine();
		int happy = 0, sad = 0;
		for (int i = 0; i < message.length() - 3; i++) {
			if (message.substring(i, i + 3).equals(":-)")) {
				happy++;
			} else if (message.substring(i, i + 3).equals(":-(")) {
				sad++;
			}
		}
		if (happy == 0 && sad == 0) {
			System.out.println("none");
		} else if (happy > sad) {
			System.out.println("happy");
		} else if (sad > happy) {
			System.out.println("sad");
		} else {
			System.out.println("unsure");
		}
	}
}
