import java.util.Scanner;


public class 说反话20分_1009 {
	public static void main(String[] args) {
		//input
		Scanner sca =new Scanner(System.in);
		String str = sca.nextLine();
		sca.close();
		//input END
		String[] sList = str.split(" ");
		for(int i=sList.length-1;i>=0;i--){
			if(i!=0)
				System.out.print(sList[i]+" ");
			else System.out.print(sList[i]);
		}
	}
}
