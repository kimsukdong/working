package tesst;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(add(10));

	}
	static int add(int n) {
		if(n<1) return 0;
		return n+add(n-1);
	//	System.out.println(n);
	}
}
