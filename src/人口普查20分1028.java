
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class 人口普查20分1028 {
	public static void main(String[] args) throws ParseException {
		Scanner sca = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		int num =sca.nextInt();
		Date last = sdf.parse("1700/1/1");
		Date first = sdf.parse("2015/1/1");
		String rf = null;
		String rl = null;
		int wrong = 0;
		for(int i =1;i<=num;i++){
			String name = sca.next();
			Date bir =sdf.parse(sca.next());
			if(bir.before(sdf.parse("1814/9/6"))){
				wrong++;
				continue;
			}else if(bir.after(sdf.parse("2014/9/6"))){
				wrong++;
				continue;
			}
			if(bir.before(first)){
				first = bir;
				rf = name;
			}
			if(bir.after(last)){
				last = bir;
				rl = name;
			}
			
		}
		if(wrong == num){
			System.out.println(0);
			return;
		}
		System.out.println(num-wrong+" "+rf+" "+rl);
	}
}
