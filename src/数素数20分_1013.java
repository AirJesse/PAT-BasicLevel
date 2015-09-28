import java.util.Scanner;


public class ÊıËØÊı20·Ö_1013 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int m = sca.nextInt();
		int n = sca.nextInt();
		int num =2;
		
		boolean issu = true;
		sca.close();
		int[] sushu = new int[10000];
		for(int i =0;i<10000;num++){
			issu=true;
			for(int j=2;j<=Math.sqrt(num);j++){
				if(num%j==0){
					issu=false;
					break;
				}
			}
			if(issu){
				sushu[i]=num;
				i++;
			}
		}
		//System.out.println(sushu[10]);
		int count=1;
		for(int i=m-1;i<n;i++){
			if(count%10!=0&&i!=n-1){
				System.out.print(sushu[i]+" ");
				count++;
			}
			else{
				System.out.println(sushu[i]);
				count++;
			}
		}
		
	}
}
