import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class µ½µ×Âò²»Âò20·Ö_1039 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		char[] c1 = sca.nextLine().toCharArray();
		char[] c2 = sca.nextLine().toCharArray();
		sca.close();
		int xiangcha = 0;
		Chuang tanzhu = new Chuang();
		HashMap<String, Integer> xiaohong = new HashMap<String, Integer>();
		for (int i = 0; i < c1.length; i++) {
			if (tanzhu.zhu.get(c1[i]) == null) {
				tanzhu.zhu.put(String.valueOf(c1[i]), 1);
			} else {
				tanzhu.zhu
						.put(String.valueOf(c1[i]), tanzhu.zhu.get(c1[i]) + 1);
			}
		}
		for (int i = 0; i < c2.length; i++) {
			if (xiaohong.get(c1[i]) == null) {
				xiaohong.put(String.valueOf(c1[i]), 1);
			} else {
				xiaohong.put(String.valueOf(c1[i]), xiaohong.get(c1[i]) + 1);
			}
		}
		for (int i = 0; i < c2.length; i++) {
			if (xiaohong.get(c2[i]) != null) {
				if (tanzhu.zhu.get(c2[i]) == null) {
					xiangcha += xiaohong.get(c2[i]);
				} else if (xiaohong.get(c2[i]) - tanzhu.zhu.get(c2[i]) > 0) {
					xiangcha += xiaohong.get(c2[i]) - tanzhu.zhu.get(c2[i]);
				}
				xiaohong.remove(c2[i]);
			}
		}
		if (xiangcha > 0) {
			System.out.println("No" + " " + xiangcha);
		} else {
			System.out.println("Yes" + " " + (c1.length - c2.length));
		}

	}
}

class Chuang {
	HashMap<String, Integer> zhu = new HashMap<String, Integer>();

}
