import java.util.Scanner;

/*
 * 初步想法：利用二维数组来做。
 */
public class 成绩排名20分_1004 {
	public static void main(String[] args) {
		String[][] str;
		Scanner sca = new Scanner(System.in);
		int n = Integer.parseInt(sca.nextLine());
		str = new String[n][3];
		int maxscore = 0;
		int minscore =100;
		String[] maxinfo = new String[3];
		String[] mininfo = new String[3];
		for(int i = 0;i<str.length;i++){
			for(int j=0;j<3;j++){
				str[i][j]=sca.next();
				if(j==2){
					if(Integer.parseInt(str[i][2])>=maxscore){
						maxscore = Integer.parseInt(str[i][2]);
						maxinfo = str[i];
					}
					if(Integer.parseInt(str[i][2])<=minscore){
						minscore = Integer.parseInt(str[i][2]);
						mininfo = str[i];
					}	
				}
			}
		}
		sca.close();
		System.out.println(maxinfo[0]+" "+ maxinfo[1]);
		System.out.println(mininfo[0]+" "+ mininfo[1]);
	}
}
