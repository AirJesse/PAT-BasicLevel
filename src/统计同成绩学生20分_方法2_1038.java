import java.util.Scanner;

public class 统计同成绩学生20分_方法2_1038 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		int fenshu[] = new int[101];
		for (int i = 1; i <= num; i++) {
			fenshu[sca.nextInt()]++;
		}
		num = sca.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i == num) {
				System.out.print(fenshu[sca.nextInt()]);
			} else
				System.out.print(fenshu[sca.nextInt()] + " ");
		}
		sca.close();

	}
}
