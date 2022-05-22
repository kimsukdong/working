package test2;

import test3.Point1;

public class Line2 extends Point1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1 p1 = new Point1(10,10);
		Point1 p2 = new Point1(20,20);
	
		double distance = Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
		System.out.println(distance);
	}
	
}
