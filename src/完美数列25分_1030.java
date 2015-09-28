import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class 完美数列25分_1030 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sca.nextInt();
		int p =sca.nextInt();
		int result =0;
		for(int i =0;i<n;i++){
			list.add(sca.nextInt());
		}
		Collections.sort(list);
		for(int i : list){
			int tmp = core(list,i,p);
			if(tmp>result){
				result =tmp;
			}
		}
		System.out.println(result);
		
	}
	static int core(ArrayList<Integer> list,int min,int p){
		int max = min*p;
		int index = findNear(list,max);
		return index - list.indexOf(min) +1;
	}
	static int findNear(ArrayList<Integer> list,int num){
		for(int i =0;i<list.size();i++){
			if(list.get(i) == num){
				return i;
			}else if(list.get(i)>num){
				return i-1;
			}
		}
		return list.size()-1;
	}
}
