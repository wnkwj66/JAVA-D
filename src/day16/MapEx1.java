package day16;

import java.util.*;

public class MapEx1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>(); 
		//<>필요한 클래스는 제너릭 클래스: 어떠한 클래스의 멤버변수의 클래스가 특정클래스로 정해지지 않은 클래스 
		map.put("abcde", "1234");
		map.put("abcde", "12345");
		map.put("abcdef", "1234");
		
		Set set = map.entrySet(); //이터레이터 사용위해 맵을 셋으로 변환
		Iterator it = set.iterator();
		while(it.hasNext()	) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 :" + e.getKey());
			System.out.println("이름 :" + e.getValue());
			System.out.println("================");
		}
		Set keySet = map.keySet();
		Collection valueSet = map.values();//중복허용하기 때문에 생성자를 컬렉션으로 함
	}

}
