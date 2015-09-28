import java.util.Scanner;
//错误解：尝试了用数组线性表来完成题目要求。
public class 一元多项式求导25分_WRONG_1010 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		//int[] input =new int[2002];
		MyList L =new MyList();
		L.add(sca.nextInt(), sca.nextInt());
		while(sca.hasNextInt()){
			L.add(sca.nextInt(), sca.nextInt());
		}
		sca.close();
		//input END
		int temp=0;
		for(int i =1000,j=1;i>=1&&j<=L.length;i--,j++){
			if(L.list[i]!=0){
				if(temp==0){
					temp=L.list[i-1];
					L.list[i-1]=L.list[i]*i;
				}else{
					int temp2= L.list[i-1];
					L.list[i-1]=temp*i;
					temp = temp2;
				}
				
			}
		}
		for(int i =1000;i>=1;i--){
			if(L.list[i]!=0){
				System.out.print(L.list[i]+" "+i+" ");
			}
		}
		System.out.print(L.list[0]);
	}
}

class MyList {
	int list[] = new int[1001];
	int length = 0;

	void add(int coe, int exp) {
		this.list[exp] += coe;
		this.length++;
	}
}