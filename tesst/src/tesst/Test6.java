package tesst;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseBall b1 = new BaseBall();
		b1.name = "�߽ż�";
		b1.atBat = 120;
		b1.hit = 45;
		
		System.out.println(b1);
		System.out.println(b1.avg());
	}
}

class BaseBall{
	String name;
	int atBat,hit;

	String avg() {
		double a =  (double)hit/atBat;
		int b1 = (int)(a*10);
		double a1 = a*10-b1;
		int b2 = (int)(a1*10);
		double a2 = a1*10-b2;
		int b3 = (int)(a2*10);
		return "Ÿ�� : "+b1+"�� " + b2 +"Ǭ " + b3+"�� ";
	}
	public String toString() {
		return name+"���� ������"+"\n"+atBat+"Ÿ�� "+hit+"��Ÿ";
	}
}
