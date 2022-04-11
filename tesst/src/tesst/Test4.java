package tesst;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gcd(150,391);
	//	gcd2(150,396);
		System.out.println(Math.log(1000000.0));
	}
	
	static void gcd(int x, int y) {
	//	System.out.println(x%y);
		while(x%y >0) {
			if(y==0) break;
			int tmp = x;
			x=y;
			y=tmp%y;
	//		System.out.println(y);
		}
		System.out.println(y);
	}
	static void gcd2(int x, int y) {
		if(x%y==0) System.out.println(y);
		else gcd2(y, x%y);
	}
}
