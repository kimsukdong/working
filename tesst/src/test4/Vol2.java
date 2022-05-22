package test4;

public class Vol2 {
	int x,y,z;
	Area a = new Area(x,y);
	
	public Vol2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vol2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	int print() {
		return a.print()*z;
	}
}
