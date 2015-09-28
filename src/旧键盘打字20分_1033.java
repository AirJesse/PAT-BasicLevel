import java.util.Scanner;

public class ¾É¼üÅÌ´ò×Ö20·Ö_1033 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String huai = sca.nextLine();
		char[] print = sca.nextLine().toCharArray();
		sca.close();
		for (int i = 0; i < print.length; i++) {
			if (Character.isUpperCase(print[i])) {
				if (huai.contains("+")) {
					continue;
				} else if (huai.contains(String.valueOf(Character
						.toUpperCase(print[i])))) {
					continue;
				} else {
					System.out.print(print[i]);
				}
			} else if (huai.contains(String.valueOf(Character
					.toUpperCase(print[i])))) {
				continue;
			} else {
				System.out.print(print[i]);
			}
		}

	}
}
