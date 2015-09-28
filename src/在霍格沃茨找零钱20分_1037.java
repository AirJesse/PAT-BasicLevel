import java.util.Scanner;

public class ‘⁄ªÙ∏ÒŒ÷¥ƒ’“¡„«Æ20∑÷_1037 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		huobi yingfu = new huobi();
		huobi shifu = new huobi();
		String[] s = sca.next().split("\\.");
		yingfu.galleon = Integer.parseInt(s[0]);
		yingfu.sickle = Integer.parseInt(s[1]);
		yingfu.knut = Integer.parseInt(s[2]);
		s = sca.next().split("\\.");
		shifu.galleon = Integer.parseInt(s[0]);
		shifu.sickle = Integer.parseInt(s[1]);
		shifu.knut = Integer.parseInt(s[2]);
		sca.close();
		huobi result = huobi.minus(shifu, yingfu);
		System.out.print(result.galleon+"."+result.sickle+"."+ result.knut);

	}
}

class huobi {
	huobi(){
		
	}
	huobi(int g,int s,int k){
		galleon = g;
		sickle = s;
		knut = k;
	}
	int galleon, sickle, knut;

	static huobi minus(huobi s, huobi y) {
		huobi a = new huobi(s.galleon,s.sickle,s.knut);
		huobi b = new huobi(y.galleon,y.sickle,y.knut);
		huobi result = new huobi();
		if (a.knut - b.knut < 0) {
			result.knut = a.knut + 29 - b.knut;
			a.sickle -= 1;
		} else {
			result.knut = a.knut - b.knut;
		}
		if (a.sickle - b.sickle < 0) {
			result.sickle = a.sickle + 17 - b.sickle;
			a.galleon -= 1;
		}else{
			result.sickle = a.sickle - b.sickle;
		}
		result.galleon = a.galleon - b.galleon;
		if(result.galleon>=0)
			return result;
		else{
			result = minus(y, s);
			result.galleon = -result.galleon;
			return result;
		}
	}
}