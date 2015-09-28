import java.util.Scanner;


public class 到底买不买20分方法2_1039 {
	public static void main(String[] args) {
		int[] laoban = new int[250];
		int[] xiaohong = new int[250];
		Scanner sca =new Scanner(System.in);
		String s = sca.nextLine();
		for(int i =0;i<s.length();i++){
			laoban[s.charAt(i)]++;
		}
		String s2 = sca.nextLine();
		for(int i =0;i<s2.length();i++){
			xiaohong[s2.charAt(i)]++;
		}
		sca.close();
		
		int sy = s.length() - s2.length();
		int que = 0;
		for(int i =0;i<250;i++){
			if(xiaohong[i] > laoban[i]){
				que+= xiaohong[i] - laoban[i];
			}
		}
		if(que>0)
			System.out.println("No"+" " + que);
		else
			System.out.println("Yes" + " " + sy);
		
	}
}
