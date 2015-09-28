import java.util.ArrayList;

import java.util.Scanner;

public class 挖掘机技术哪家强20分_1032 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		ArrayList<xuexiao> list = new ArrayList<xuexiao>();
		for (int i = 1; i <= num; i++) {
			int b = sca.nextInt();
			int g = sca.nextInt();
			boolean notFind = true;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).bianhao == b) {
					list.get(j).grade += g;
					notFind = false;
					break;
				}
			}
			if (notFind) {
				list.add(new xuexiao(b, g));
			}

		}
		xuexiao top = new xuexiao(-1, -1);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).grade > top.grade) {
				top = list.get(i);
			}
		}
		System.out.println(top.bianhao + " " + top.grade);

	}
}

class xuexiao {
	int bianhao;
	int grade;

	xuexiao(int a, int b) {
		bianhao = a;
		grade = b;
	}
}
