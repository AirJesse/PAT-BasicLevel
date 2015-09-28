import java.util.Scanner;

public class 继续3nadd1猜想25分_1005 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		MyIntArray covernum = new MyIntArray();
		int k = sca.nextInt();
		int[] cknum = new int[k];
		for (int i = 0; i < cknum.length; i++) {
			cknum[i] = sca.nextInt();
		}
		sca.close();
		for (int i = 0; i < cknum.length; i++) {
			int n = cknum[i];
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
					if (covernum.check(n)) {
						covernum.add(n);
					}
				} else {
					n = (3 * n + 1) / 2;
					if (covernum.check(n)) {
						covernum.add(n);
					}
				}
			}
		}
		boolean first = true;
		boolean coverflag = false;
		MyIntArray result = new MyIntArray(); // 结果集
		for (int x : cknum) {
			coverflag = false;
			for (int y : covernum.data) {
				if (x == y) {
					coverflag = true;
					break;
				}
			}
			if (!coverflag) {
				result.add(x);
			}
		}
		// 做到这里，下面进行从大到小的排序。
		result.mysort();
		for (int x : result.data) {
			if (first) {
				System.out.print(x);
				first = false;
			} else
				System.out.print(" " + x);
		}

		// for(int x :covernum.data){
		// System.out.println(x);
		// }
	}
}

// 创造一个可自动变长的int数组。
class MyIntArray {
	int[] data;
	int length = 0; // 数组大小

	void add(int a) {
		length++;
		int[] newdata = new int[length];
		for (int i = 0; i < length - 1; i++) {
			newdata[i] = data[i];
		}
		newdata[length - 1] = a;
		data = newdata;
	}

	boolean check(int a) { // 检查是否重复。True为不重复，False为重复。
		if (length == 0) {
			return true;
		} else {
			for (int x : data) {
				if (x == a) {
					return false;
				}
			}
			return true;
		}
	}

	void mysort() {
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] < data[j]) {
					data[i] = data[i] + data[j];
					data[j] = data[i] - data[j];
					data[i] = data[i] - data[j];
				}
			}
		}

	}
}