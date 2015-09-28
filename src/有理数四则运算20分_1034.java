import java.util.Scanner;

public class 有理数四则运算20分_1034 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String s = sca.next();
		int fenzi = Integer.valueOf(s.split("\\/")[0]);
		int fenmu = Integer.valueOf(s.split("\\/")[1]);
		fenshu a = new fenshu(fenzi, fenmu);
		s = sca.next();
		fenzi = Integer.valueOf(s.split("\\/")[0]);
		fenmu = Integer.valueOf(s.split("\\/")[1]);
		fenshu b = new fenshu(fenzi, fenmu);

		sca.close();
		
		fenshu r1 = a.add(b);
		fenshu r2 = a.minus(b);
		fenshu r3 = a.multiply(b);
		fenshu r4 = a.divide(b);
	
		
		System.out.println(a.print() + " " + "+" + " " +b.print() + " " + "=" + " " + r1.print());
		System.out.println(a.print() + " " + "-" + " " +b.print() + " " + "=" + " " + r2.print());
		System.out.println(a.print() + " " + "*" + " " +b.print() + " " + "=" + " " + r3.print());
		System.out.println(a.print() + " " + "/" + " " +b.print() + " " + "=" + " " + r4.print());
		
	}
}

class fenshu {
	int fenzi;
	int fenmu;
	int zhengshu;

	fenshu(int a, int b) {
		fenzi = a;
		fenmu = b;
	}

	fenshu add(fenshu f) {
		return new fenshu(this.fenzi * f.fenmu + this.fenmu * f.fenzi,
				this.fenmu * f.fenmu);
	}

	fenshu minus(fenshu f) {
		return this.add(new fenshu(-f.fenzi, f.fenmu));
	}

	fenshu multiply(fenshu f) {
		return new fenshu(this.fenzi * f.fenzi, this.fenmu * f.fenmu);
	}

	fenshu divide(fenshu f) {
		if(f.fenzi <0){
			return this.multiply(new fenshu(-f.fenmu, -f.fenzi));
		}else{
			return this.multiply(new fenshu(f.fenmu, f.fenzi));
			
		}
	}
	
	private fenshu huajian(int fenzi,int fenmu){
		if(fenzi<0){
			if(-fenzi >fenmu){
				for(int i =fenmu;i>=1;i--){
					if(-fenzi % i ==0 && fenmu % i == 0){
						return new fenshu(fenzi/i, fenmu/i);
					}
				}
			}else if(-fenzi == fenmu){
				return new fenshu(-1,1);
			}else{
				for(int i =-fenzi;i>=1;i--){
					if(-fenzi % i ==0 && fenmu % i == 0){
						return new fenshu(fenzi/i, fenmu/i);
					}
				}
			}
		}else{
			if(fenzi >fenmu){
				for(int i =fenmu;i>=1;i--){
					if(fenzi % i ==0 && fenmu % i == 0){
						return new fenshu(fenzi/i, fenmu/i);
					}
				}
			}else if(fenzi == fenmu){
				return new fenshu(1,1);
			}else{
				for(int i =fenzi;i>=1;i--){
					if(fenzi % i ==0 && fenmu % i == 0){
						return new fenshu(fenzi/i, fenmu/i);
					}
				}
			}
		}
		return new fenshu(fenzi, fenmu);
	}

	String print() {
		int zhen = 0;
		fenshu huajian = this.huajian(fenzi, fenmu);
		int a = huajian.fenzi;
		int b = huajian.fenmu;
		if (b == 0) {
			//System.out.print("Inf");
			return "Inf";
		}
		if (a > 0) {
			if (a / b > 0) {
				zhen = a / b;
				a = a % b;
				if (a == 0) {
					//System.out.print(zhen);
					return String.valueOf(zhen);
				} else {
					//System.out.print(zhen + " " + a + "/" + "b");
					return new String(zhen + " " + a + "/" + b);
				}
			} else {
				//System.out.print(a + "/" + "b");
				return new String(a + "/" + b);
			}
		} else if (a == 0) {
			//System.out.print("0");
			return "0";
		} else {
			// -----------------------------------------------
			if ((-a) / b > 0) {
				zhen = a / b;
				a = (-a) % b;
				if (a == 0) {
					//System.out.print("(" + zhen + ")");
					return new String("(" + zhen + ")");
				} else {
					//System.out.print("(" + zhen + " " + a + "/" + "b" + ")");
					return new String("(" + zhen + " " + a + "/" + b + ")");
				}
			} else {
				//System.out.print("(" + a + "/" + "b" + ")");
				return new String("(" + a + "/" + b + ")") ;
			}
		}
	}
}
