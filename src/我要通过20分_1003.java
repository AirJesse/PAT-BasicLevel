import java.util.Scanner;


public class ��Ҫͨ��20��_1003 {
	public static void main(String[] args) {
		String[] str;
		Scanner sca = new Scanner(System.in);
		int max = Integer.parseInt(sca.nextLine());
		str = new String[max];
		for(int i =0; i < str.length; i++) {
			str[i] = sca.nextLine();
		}
		sca.close();
		for (int i = 0; i < str.length; i++) {
			// ��������������룬Ŀǰ��������о��е㸴�ӡ����Կ���indexof��λ�����ԡ�
			// ������P,������ڣ�������T,�����������P���棻���������ж��Ƿ�ȫΪA.
			if (str[i].equals("")) {
				System.out.println("NO");
				break;
			}
			if (isPAT(str[i].toCharArray())) {
				int pp = str[i].indexOf("P");
				int tp = str[i].indexOf("T");
				if (str[i].indexOf("PAT") != -1) {
					if (str[i].length() == 3) {
						System.out.println("YES");
					} else if (str[i].length() - 1 - tp == pp) {
						if (str[i].substring(0, pp).equals(
								str[i].substring(tp + 1))&&isA(str[i].substring(0, pp)))
							System.out.println("YES");
						else
							System.out.println("NO");
					} else {
						System.out.println("NO");
					}
				} else if (str[i].indexOf("PAAT") != -1) {
					if (str[i].length() == 4) {
						System.out.println("YES");
					}else if(str[i].length()-1-tp==pp*2){
						//���Դ�����
						//System.out.println(str[i].substring(0, pp)+str[i].substring(0, pp));
						//System.out.println(str[i].substring(tp + 1));
						//���Դ�����
						if (str[i].substring(tp + 1).equals(
								str[i].substring(0, pp)+str[i].substring(0, pp))&&isA(str[i].substring(0, pp)))
							System.out.println("YES");
						else
							System.out.println("NO");
					}else {
						System.out.println("NO");
					}
				} else {
					System.out.println("NO");
					//break;
				}
			} else {
				System.out.println("NO");
			}
		}

	}

	static boolean isPAT(char[] a) {
		boolean ispat = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 'P' && a[i] != 'T' && a[i] != 'A') {
				ispat = false;
				break;
			}
		}
		return ispat;
	}
	static boolean isA(String str){
		boolean isa = true;
		char[]ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] !='A') {
				isa = false;
				break;
			}
		}
		return isa;
	}
}
