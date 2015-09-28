import java.util.Scanner;

public class A³ýÒÔB20·Ö_1017 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		char[] A = sca.next().toCharArray();
		int B = sca.nextInt();

		String Q = "";
		int R = Character.digit(A[0], 10);
		for (int i = 1; i < A.length; i++) {
			Q += R / B;
			R = (R % B) * 10 + Character.digit(A[i], 10);
		}
		Q += R / B;
		R = R % B;

		for (int i = 0; i < Q.length(); i++) {

			if (Q.charAt(i) != '0') {
				Q = Q.substring(i);
				break;
			}
			if (i == Q.length() - 1) {
				Q = "0";
			}
		}

		System.out.print(Q + " " + R);
	}
}
