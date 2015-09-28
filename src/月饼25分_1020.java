import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ÔÂ±ý25·Ö_1020 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int kinds = sca.nextInt();
		int market = sca.nextInt();
		ArrayList<MoonCake> mclist = new ArrayList<MoonCake>();
		for(int i =1;i<=kinds;i++){
			MoonCake mc = new MoonCake();
			mc.qty = sca.nextFloat();
			mclist.add(mc);
		}
		for(int i =0;i<kinds;i++){
			mclist.get(i).zongjia = sca.nextFloat();
			mclist.get(i).jisuan();
		}
		sca.close();
		Collections.sort(mclist);
		float result = core(mclist,market);
		System.out.printf("%.2f", result);
		
		
	}
	public static float core(ArrayList<MoonCake> list,int market){
		int i =0;
		float result = 0;
		while(market !=0 && i<list.size()){
			MoonCake mc = list.get(i);
			if(mc.qty >= market){
				return result+market*mc.danjia;
			}else{
				result += mc.zongjia;
				market -= mc.qty;
				i++;
			}
		}
		return result;
	}
}

class MoonCake implements Comparable<MoonCake>{
	float zongjia;
	float qty;
	float danjia;
	public MoonCake(){
		
	}
	public void jisuan(){
		if(qty!=0){
			this.danjia = zongjia/qty;
		}else{
			this.danjia = 0;
		}
	}
	@Override
	public int compareTo(MoonCake m) {
		// TODO Auto-generated method stub
		if(this.danjia>m.danjia){
			return -1;
		}else if(this.danjia==m.danjia){
			return 0;
		}else{
			return 1;
		}
	}
	
}