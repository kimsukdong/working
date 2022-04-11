package tesst;

import java.util.Arrays;
import java.util.Random;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		int[] a = new int[6];
		Random r = new Random();
		
		aa: while(cnt<6) {
			int i = r.nextInt(100);
			System.out.println("org : "+i);
			if(cnt>0) {
				for(int j=0;j<cnt;j++) {
					if(i==a[j]) 
						continue aa;
				}
			}
			a[cnt++]=i;
		}
		for(int j:a)
			System.out.print(j+" ");
		System.out.println();
		Arrays.sort(a);
		for(int j:a)
			System.out.print(j+" ");
	}

}
