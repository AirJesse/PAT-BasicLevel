import java.util.Scanner;

public class 写出这个数20分_1002 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String snum = sca.nextLine();
		int he=0;
		sca.close();
		char[] cnum = snum.toCharArray();
		for(int i=0;i<cnum.length;i++){
			he=he+Integer.parseInt(String.valueOf(cnum[i]));
		}
		//System.out.println(he);
		char[] result = String.valueOf(he).toCharArray();
		for(int i =0;i<result.length;i++){
			switch(result[i]){
			case '0':System.out.print("ling");break;
			case '1':System.out.print("yi");break;
			case '2':System.out.print("er");break;
			case '3':System.out.print("san");break;
			case '4':System.out.print("si");break;
			case '5':System.out.print("wu");break;
			case '6':System.out.print("liu");break;
			case '7':System.out.print("qi");break;
			case '8':System.out.print("ba");break;
			case '9':System.out.print("jiu");break;
			}
			if(i!=result.length-1){
				System.out.print(" ");
			}
		}
	}
}
