package test2;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(4,2,3);
		System.out.println(Box.geti());
		System.out.println(b1.volume());
		Box b2 = new Box();
		System.out.println(b2.volume());
		T1 t = new T1();
		t.print(b1);
	}
	
	 void print(Box b1){
		System.out.println(b1);
	}
	

}
