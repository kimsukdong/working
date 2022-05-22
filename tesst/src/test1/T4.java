package test1;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b = new Box(2,3,4);
		System.out.println(b.volume());
		System.out.println(b);
		Box b2= new Box();
		System.out.println(b2.volume());
		System.out.println(b2);
		Box.print();
	}

}
