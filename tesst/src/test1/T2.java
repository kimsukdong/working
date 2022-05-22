package test1;

public class T2 {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("More data");
			return;
		}
		int w = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		int d = Integer.parseInt(args[2]);
		
		int v = w*h*d;
		System.out.println("Volume = "+v);
	}

}
