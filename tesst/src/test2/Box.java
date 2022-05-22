package test2;

public class Box {
	int w,h,d;
		
	@Override
	public String toString() {
		return "Box 객체";
	}

	Box() {	
		this(1,1,1);
	}

	public Box(int w, int h, int d) {
		super();
		this.w = w;
		this.h = h;
		this.d = d;
		System.out.println(volume());
		hh();
	}

	int volume() {
		return w*h*d;
	}
	
	static int geti() {
		return 10;
	}
	
	static void hh() {
		System.out.println("Test");
	}

}
