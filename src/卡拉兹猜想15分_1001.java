import java.util.Scanner;

public class ¿¨À­×È²ÂÏë15·Ö_1001 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		sca.close();
		int k =0;
		while(n!=1){
			if(n % 2 == 0){
				n=n/2;
				k++;
			}else{
				n=(3*n+1)/2;
				k++;
			}
		}
		System.out.println(k);
	}
}
