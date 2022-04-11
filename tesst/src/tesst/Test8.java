package tesst;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base2 b1[] = new Base2[2];
		for(int i =0; i<2;i++)
			b1[i]= new Base2();
		
		b1[0].name = "Ãß½Å¼ö";
		b1[0].atBat = 120;
		b1[0].hit = 45;
		b1[0].homeRun=10;
		b1[0].run = 15;
		b1[0].fourBall=11;
		
		b1[1].name = "±èÇö¼ö";
		b1[1].atBat = 150;
		b1[1].hit = 53;
		b1[1].homeRun=15;
		b1[1].run = 25;
		b1[1].fourBall=15;
		
		System.out.println(b1[0]);
		System.out.println(b1[0].avg());
		System.out.println();
		
		System.out.println(b1[1]);
		System.out.println(b1[1].avg());
				
	}
}

class Base2 extends Base{
	int homeRun, run, fourBall;
		
	/*
	 * 	public String toString() {		
		return super.toString()+"\n"+homeRun+"È¨·± , "+run+ "µæÁ¡ ";
	}
	 */

	
}
