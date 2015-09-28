import java.util.Arrays;
import java.util.Scanner;

public class Êý×ÖºÚ¶´20·Ö_1019 {
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		char[] num = String.format("%04d", n).toCharArray();
		sca.close();
		Arrays.sort(num);
		char[] first = nixu(num);
		String result;
		if (Integer.parseInt(String.valueOf(first))
				- Integer.parseInt(String.valueOf(num)) == 0) {
			System.out.print(String.valueOf(num) + " - " + String.valueOf(num)
					+ " = 0000");
			return;
		}
		while (true) {
			result = String.format(
					"%04d",
					Integer.parseInt(String.valueOf(first))
							- Integer.parseInt(String.valueOf(num)));
			if (result.compareTo("6174") == 0) {
				System.out.print(String.valueOf(first) + " - "
						+ String.valueOf(num) + " = " + result);
				break;
			}
			System.out.println(String.valueOf(first) + " - "
					+ String.valueOf(num) + " = " + result);
			num = String.valueOf(result).toCharArray();
			Arrays.sort(num);
			first = nixu(num);
		}
	
	}

	private static char[] nixu(char[] num) {
		char[] tmp = new char[num.length];
		int i = num.length - 1;
		for (char c : num) {
			tmp[i--] = c;
		}
		return tmp;
	}
}
