import java.util.Scanner;

public class 统计同成绩学生20分_1038 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		int[] fenshu = new int[num];
		for (int i = 0; i < num; i++) {
			fenshu[i] = sca.nextInt();
		}
		num = sca.nextInt();
		int[] chaxun = new int[num];
		int[] result = new int[num];
		for (int i = 0; i < num; i++) {
			chaxun[i] = sca.nextInt();
		}
		for (int i = 0; i < fenshu.length; i++) {
			for (int j = 0; j < chaxun.length; j++) {
				if (fenshu[i] == chaxun[j])
					result[j]++;
			}
		}

		for (int i = 0; i < result.length; i++) {
			if (i != result.length - 1)
				System.out.print(result[i] + " ");
			else
				System.out.print(result[i]);
		}
	}
}
