import java.util.Scanner;

public class 跟奥巴马一起编程15分_1036 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		char c = sca.next().charAt(0);
		sca.close();
		for (int i = 1; i <= hang(num); i++) {
			if (i == 1 || i == hang(num)) {
				for (int j = 1; j <= num; j++) {
					System.out.print(c);
				}

			} else {
				for (int j = 1; j <= num; j++) {
					if (j == 1 || j == num) {
						System.out.print(c);
					} else
						System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	static int hang(int a) {
		if (a % 2 == 0) {
			return a / 2;
		} else {
			return (a + 1) / 2;
		}
	}
}
