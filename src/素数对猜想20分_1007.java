import java.util.Scanner;

public class 素数对猜想20分_1007 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int d=0;
		sca.close();
		//int[] primeNum = new int[n];	
		int num =2;
		int pnum=-1;
		while(num<=n){
			if(isPrime(num)){
				if(num-pnum==2){
					d++;
				}
				pnum=num;
			}
			num++;
		}
		System.out.print(d);
	}

	static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

}
