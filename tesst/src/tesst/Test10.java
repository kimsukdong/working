package tesst;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>();
		int cnt=0,data;
		
		while(cnt<6) {
			data=r.nextInt(45)+1;
			if(set.add(data))
				cnt++;
		}
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(true) {
			if(it.hasNext())
				System.out.println(it.next());
			else break;
		}
		
	}

}
