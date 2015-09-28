import java.util.Scanner;

public class ´¸×Ó¼ôµ¶²¼20·Ö_1018 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Player jia = new Player();
		Player yi = new Player();
		int num = sca.nextInt();
		for (int i = 1; i <= num; i++) {
			char A = sca.next().charAt(0);
			char B = sca.next().charAt(0);
			if (panDing(A, B) == 1) {
				jia.win++;
				yi.lose++;
				jia.winWith(A);
			} else if (panDing(A, B) == 0) {
				jia.draw++;
				yi.draw++;
			} else {
				yi.win++;
				jia.lose++;
				yi.winWith(B);
			}
		}
		System.out.println(jia.win + " " + jia.draw + " " + jia.lose);
		System.out.println(yi.win + " " + yi.draw + " " + yi.lose);
		jia.printWinWith();
		System.out.print(" ");
		yi.printWinWith();
		

	}

	static int panDing(char A, char B) {
		switch (A) {
		case 'C':
			if (B == 'J')
				return 1;
			else if (B == 'C')
				return 0;
			else
				return -1;
		case 'J':
			if (B == 'B')
				return 1;
			else if (B == 'J')
				return 0;
			else
				return -1;
		case 'B':
			if (B == 'C')
				return 1;
			else if (B == 'B')
				return 0;
			else
				return -1;
		default:
			return -1;

		}
	}
}

class Player {
	int win, lose, draw, J, C, B;

	void winWith(char c) {
		switch (c) {
		case 'C':
			C++;
			break;
		case 'J':
			J++;
			break;
		case 'B':
			B++;
			break;
		}
	}

	void printWinWith() {
		switch (bdx(J, C)) {
		case 1:
			if (bdx(J, B) == 1)
				System.out.print('J');
			else if (bdx(J, B) == 0)
				System.out.print('B');
			else
				System.out.print('B');
			break;
		case -1:
			if (bdx(C, B) == 1)
				System.out.print('C');
			else if (bdx(C, B) == 0)
				System.out.print('B');
			else
				System.out.print('B');
			break;
		case 0:
			if(bdx(J, B) == 1)
				System.out.print('C');
			else if (bdx(J, B) == 0)
				System.out.print('B');
			else
				System.out.print('B');
			break;
		}
	}

	private int bdx(int a, int b) {
		if (a > b)
			return 1;
		else if (a == b)
			return 0;
		else
			return -1;
	}

}
