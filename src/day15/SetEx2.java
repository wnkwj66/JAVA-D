package day15;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs1.add(10);
		hs1.add(31);
		hs1.add(24);
		hs2.add(15);
		hs2.add(48);
		hs2.add(38);
		
		Iterator<Integer> it1 = hs1.iterator();
		Iterator<Integer> it2 = hs2.iterator();
		int i= 1;
		while(it1.hasNext()&& it2.hasNext()) {
			Integer num1 =it1.next();
			Integer num2 =it2.next();
			if(num1.equals(num2)) {
				System.out.println(i+"번째로 가져온 두 값"+num1+"은 같습니다.");
			}else {
				System.out.println(i+"번째로 가져온 두 값"+num1+"과"+num2+"는 다릅니다.");
			}
		}
		
	}

}
