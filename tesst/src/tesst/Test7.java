package tesst;
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1[] = new Base[2];
		for(int i =0; i<2;i++)
			b1[i]= new Base();
		
		b1[0].name = "�߽ż�";
		b1[0].atBat = 120;
		b1[0].hit = 45;
		
		b1[1].name = "������";
		b1[1].atBat = 150;
		b1[1].hit = 53;
		
		System.out.println(b1[0]);
		System.out.println(b1[0].avg());
		System.out.println();
		
		System.out.println(b1[1]);
		System.out.println(b1[1].avg());
		
		
	}
}

class Base{
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

