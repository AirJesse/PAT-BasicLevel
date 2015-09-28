/*
 * 本题无法AC
 */
import java.util.Scanner;

public class 福尔摩斯的约会20分_1014 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		char[] a = sca.nextLine().toCharArray();
		char[] b = sca.nextLine().toCharArray();
		char[] c = sca.nextLine().toCharArray();
		char[] d = sca.nextLine().toCharArray();
		sca.close();
		boolean first = true;
		for (int i = 0; i < a.length && i < b.length; i++) {
			if (a[i] == b[i]) {
				if (first && a[i] >= 'A') {
					switch (a[i]) {
					case 'a':
						System.out.print("MON ");
						break;
					case 'A':
						System.out.print("MON ");
						break;
					case 'b':
						System.out.print("TUE ");
						break;
					case 'B':
						System.out.print("TUE ");
						break;
					case 'c':
						System.out.print("WED ");
						break;
					case 'C':
						System.out.print("WED ");
						break;
					case 'd':
						System.out.print("THU ");
						break;
					case 'D':
						System.out.print("THU ");
						break;
					case 'e':
						System.out.print("FRI ");
						break;
					case 'E':
						System.out.print("FRI ");
						break;
					case 'f':
						System.out.print("SAT ");
						break;
					case 'F':
						System.out.print("SAT ");
						break;
					case 'g':
						System.out.print("SUN ");
						break;
					case 'G':
						System.out.print("SUN ");
						break;
					}
					first = false;
				} else if (!first) {
					if (a[i]>='0'&&a[i]<='9') {
						System.out.print(a[i] + ":");
					} else {
						System.out.print(((int) a[i] - 55) + ":");
					}
				}
			}
		}
		for (int i = 0; i < c.length && i < d.length; i++){
			if(c[i]==d[i]&&c[i]>='A'){
				System.out.printf("%02d",i);
				System.exit(0);
			}
		}
	}
}
