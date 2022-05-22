package tesst;

public class Test11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CMath m1 = new CMath();
		System.out.println(m1.add(10,20));
		System.out.println(m1.sub(10,20));
		System.out.println(m1.mul(10,20));
		System.out.println(m1.div(10,20));
	}
	
	public String toString() {
		return "Test11 object";
	}

}

class CMath {
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	double div(int a, int b) {
		return (double)a/b;
	}
}
