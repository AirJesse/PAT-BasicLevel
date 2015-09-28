import java.util.Scanner;

public class 查验身份证15分_1031 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = Integer.parseInt(sca.nextLine());
		boolean allPassed = true;
		for (int i = 1; i <= num; i++) {
			String s = sca.nextLine();
			int he = 0;
			boolean notWrong = true;
			char[] c = s.toCharArray();
			for (int j = 0; j < 17; j++) {
				if (Character.isDigit(c[j])) {
					he += jqqh(Character.digit(c[j], 10), j);
				} else {
					allPassed = false;
					notWrong = false;
					System.out.println(c);
					break;
				}
			}
			if (notWrong) {
				char xym = xym(he % 11);
				if(xym != c[17]){
					allPassed = false;
					System.out.println(c);
				}
			}

		}
		if(allPassed){
			System.out.println("All passed");
		}
	}

	static char xym(int a) {
		switch (a) {
		case 0:
			return '1';
		case 1:
			return '0';
		case 2:
			return 'X';
		case 3:
			return '9';
		case 4:
			return '8';
		case 5:
			return '7';
		case 6:
			return '6';
		case 7:
			return '5';
		case 8:
			return '4';
		case 9:
			return '3';
		case 10:
			return '2';
		default:
			return 'N';

		}
	}

	static int jqqh(int a, int weizhi) {
		switch (weizhi) {
		case 0:
			return a * 7;
		case 1:
			return a * 9;
		case 2:
			return a * 10;
		case 3:
			return a * 5;
		case 4:
			return a * 8;
		case 5:
			return a * 4;
		case 6:
			return a * 2;
		case 7:
			return a * 1;
		case 8:
			return a * 6;
		case 9:
			return a * 3;
		case 10:
			return a * 7;
		case 11:
			return a * 9;
		case 12:
			return a * 10;
		case 13:
			return a * 5;
		case 14:
			return a * 8;
		case 15:
			return a * 4;
		case 16:
			return a * 2;
		default:
			return -1;

		}
	}
}
