import java.util.Scanner;
/*
 * ���Ȿ��ò�ƹ��ڸ��ӣ���������˼·��
 * for(i=m;i<n+m;;i++){
 * print a[i%n]
 * �ðɣ�����֤�������ϲ��С�
 */

public class ����Ԫ��ѭ����������20��_1008 {
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
