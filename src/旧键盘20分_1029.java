import java.util.ArrayList;

import java.util.Scanner;

public class ¾É¼üÅÌ20·Ö_1029 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String s1 = sca.nextLine();
		String s2 = sca.nextLine();
		ArrayList<Character> list = new ArrayList<Character>();
		int j = 0;
		for (int i = 0; i < s2.length(); i++) {
			for (; j < s1.length(); j++) {
				if (s1.charAt(j) == s2.charAt(i)) {
					j++;
					break;
				} else {
					if (list.contains(Character.toUpperCase(s1.charAt(j)))) {

					} else {
						list.add(Character.toUpperCase(s1.charAt(j)));
						if (Character.isDigit(s1.charAt(j))) {
							System.out.print(s1.charAt(j));
						} else {
							System.out
									.print(Character.toUpperCase(s1.charAt(j)));
						}
					}

				}
			}
		}
		for(;j<s1.length();j++){
			if (list.contains(Character.toUpperCase(s1.charAt(j)))) {

			} else {
				list.add(Character.toUpperCase(s1.charAt(j)));
				if (Character.isDigit(s1.charAt(j))) {
					System.out.print(s1.charAt(j));
				} else {
					System.out
							.print(Character.toUpperCase(s1.charAt(j)));
				}
			}
		}
	}
}
