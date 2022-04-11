package tesst;

import java.util.Collections;
import java.util.Vector;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i= {3,4,5};

		int[] j = {9,6,7,8,5,2};
		double[] d = {2.1, 1.5, 8.1,3.5};
		
		for(int k: i)
			System.out.print(k+" ");
		swap(i,j);
		System.out.println();		
		for(int k: i)
			System.out.print(k+" ");
		
		System.out.println();
		T1 ta = new T1();
		T1 tb = new T1();
		
		ta.a =10;
		tb.a = 20;
		swap(ta,tb);
		System.out.println(ta.a);
		
		Vector v = new Vector();
		
		
		for(double k:d)
			v.add(k);
		 

		
		for(int k=0;k<v.size();k++)
			System.out.println(v.get(k));
		
		Collections.sort(v);
		for(int k=0;k<v.size();k++)
			System.out.println(v.get(k));
		
	}
	
	static void swap(int[] a1, int[] a2) {
		for(int i=0;i<a1.length;i++) {
			int t = a1[i];
			a1[i] = a2[i];
			a2[i] = t;
		}
	}

	static void swap(T1 a1, T1 a2) {
		int t = a1.a;
		a1.a = a2.a;
		a2.a = t;
	}
}

class T1 {
	int a;
}
