package test1;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("input width height depth");
		int w = s.nextInt();
		int h = s.nextInt();
		int d = s.nextInt();
		
		int v = w*h*d;
		System.out.println("Volume = "+v);
		
	}

}
