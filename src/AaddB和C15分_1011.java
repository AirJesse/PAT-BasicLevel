/*
 * �����޷�AC����Ϊa+b�������
 */


import java.util.Scanner;


public class AaddB��C15��_1011 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int T = sca.nextInt();
		String[] re = new String[T+1];
 		for(int i =1;i<=T;i++){
			int a = sca.nextInt();
			int b = sca.nextInt();
			int c = sca.nextInt();
			if(a+b>c){    //a+b�Ľ��Խ��
				//System.out.println("Case #"+i+": "+"true");
				re[i] = "Case #"+i+": "+"true";
			}else{
				//System.out.println("Case #"+i+": "+"false");
				re[i] = "Case #"+i+": "+"false";
			}
		}
		sca.close();
		for(int i=1;i<re.length;i++){
			System.out.println(re[i]);
		}
	}
}
