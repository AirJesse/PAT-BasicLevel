package 练习题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 采花生1001 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		while (sca.hasNext()) {

			ArrayList<huasheng> list = new ArrayList<huasheng>();
			int hang = sca.nextInt();
			int lie = sca.nextInt();
			int totalTime = sca.nextInt();
			for (int i = 1; i <= hang; i++) {
				for (int j = 1; j <= lie; j++) {
					int num;
					if ((num = sca.nextInt()) != 0) {
						list.add(new huasheng(i, j, num));
					}
				}
			}
			Collections.sort(list);
			huasheng now = new huasheng(0, 0, 0);
			int total = 0;
			for (int i = 0; i < list.size(); i++) {

				int cost = huasheng.move(now, list.get(i));
				if (totalTime - cost-1 - list.get(i).back() >= 0) {
					totalTime -= cost+1;
					now = list.get(i);
					total += now.qty;
				} else {
					break;
				}
			}
			System.out.print(total);
		}
	}
}

class huasheng implements Comparable<huasheng> {
	int x;
	int y;
	int qty;

	public huasheng(int x, int y, int qty) {
		this.x = x;
		this.y = y;
		this.qty = qty;
	}

	public static int move(huasheng a, huasheng b) {
		if (a.x == 0) {
			return b.x;
		}
		return Math.abs(a.x - b.x) + Math.abs(a.y - b.y);
	}

	public int back() {
		return x;
	}

	@Override
	public int compareTo(huasheng o) {
		// TODO Auto-generated method stub
		if (this.qty > o.qty) {
			return -1;
		} else if (this.qty == o.qty) {
			return 0;

		} else {
			return 1;
		}
	}
}
