package test2;

public class T2 {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("More data");
			return;
		}
//		int w = Integer.parseInt(args[0]);
		Integer i =0;
		
		int w = i.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		int d = Integer.parseInt(args[2]);	
		T2 t = new T2();
		System.out.println(t.volume(w,h,d));
		Box.hh();
		Box b = new Box();
		System.out.println(b.volume());
	}
	
	String volume(int w,int h,int d) {
		return "Volume = "+(w*h*d);		
	}
}
