import java.util.Scanner;
/*
 * 此题本解貌似过于复杂，有以下新思路：
 * for(i=m;i<n+m;;i++){
 * print a[i%n]
 * 好吧，经过证明，以上不行。
 */

public class 数组元素循环右移问题20分_1008 {
	public static void main(String[] args) {
		//input:
		Scanner sca =new Scanner(System.in);
		int n = sca.nextInt();
		int m = sca.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sca.nextInt();
		}
		sca.close();
		//input END
		for(int i =0,k =0;k<n;k++){
			//k=(i+m)%n;
			i= k-m;
			while(i<0){
				i=n+i;
			}
			if(k!=n-1){
				System.out.print(a[i]+" ");
			}else System.out.print(a[i]);
			
		}
	}
}
