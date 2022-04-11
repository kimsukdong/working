package tesst;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[][]= {{2,5,3,4,7},{5,3,2},{5,2,6,1}};
		int a[]= new int[10];
		int sum=0;
		for(int i=0;i<d.length;i++) {
			sum=0;
			for(int j : d[i])
			{
				sum+=j;
			}
			System.out.println(sum);
		}

	}

}
