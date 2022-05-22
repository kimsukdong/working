package test4;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vol vol = new Vol();
		vol.x=10;
		vol.y=20;
		vol.z=30;
		
		System.out.println(vol.print());
		
		Vol1 v = new Vol1();
		v.z =20;
		v.a.x=10;
		v.a.y=30;
		System.out.println(v.print());
	}

}
