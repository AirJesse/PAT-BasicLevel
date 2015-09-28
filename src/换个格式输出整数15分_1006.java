import java.util.Scanner;


public class 换个格式输出整数15分_1006 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int num =sca.nextInt();
		sca.close();
		int bai = num/100;
		int shi = (num%100)/10;
		int ge = num%10;
		for(int i = 1;i<=bai;i++){
			System.out.print("B");
		}
		for(int i = 1;i<=shi;i++){
			System.out.print("S");
		}
		for(int i = 1;i<=ge;i++){
			System.out.print(i);
		}
	}
}
