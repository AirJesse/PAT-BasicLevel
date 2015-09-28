import java.util.Scanner;


public class 我要通过20分_正确解 {
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
			int P=0,A=0,T=0;
			int pos_P,pos_T;
			char[] ch=str[i].toCharArray();
			for(int j=0;j<ch.length;j++){
				switch(ch[j]){
				case'A':A++;break;
				case'P':P++;break;
				case'T':T++;break;
				}
			}
			if(P+A+T!=ch.length||P!=1||T!=1){
				System.out.println("NO");
				continue;
			}
			pos_P=str[i].indexOf("P");
			pos_T=str[i].indexOf("T");
			if(pos_T-pos_P<2){
				System.out.println("NO");
				continue;
			}
			if(pos_P==0&&pos_T==str[i].length()-1){
				System.out.println("YES");
			}else if(pos_P!=0&&pos_T!=str[i].length()-1){
				String left = str[i].substring(0, pos_P);
				String mid = str[i].substring(pos_P+1, pos_T);
				String right = str[i].substring(pos_T+1);
				String ckright="";
				for(int j =0;j<mid.length();j++){
					ckright = ckright + left;
				}
				if(right.equals(ckright)){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}

	}
}
