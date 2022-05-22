package test1;

public class Box {
	int w,h,d;
	
	
	public Box() {
		this(1,1,1);
	}

	public Box(int w, int h, int d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}

	int volume() {
		return w*h*d;
	}

	@Override
	public String toString() {
		return "Box 객체 "+volume();
	}
	
	static void print() {
		System.out.println("Box 객체 생성");
	}
}
