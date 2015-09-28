import java.util.Scanner;

public class 有几个PAT25分_1040 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String s = sca.nextLine();
		sca.close();
		int result = 0;

		while (s.indexOf("P") != -1) {
			String p = s.substring(s.indexOf("P"));
			while (p.indexOf("A") != -1) {
				String A = p.substring(p.indexOf("A"));
				result += coutStr(A, 'T');
				p = p.substring(p.indexOf("A") + 1);
			}
			s = s.substring(s.indexOf("P") + 1);
		}
		System.out.println(result);

	}

	static int coutStr(String s, char key) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == key) {
				result++;
			}
		}
		return result;
	}

}
