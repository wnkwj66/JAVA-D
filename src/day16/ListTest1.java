package day16;

import java.util.*;

public class ListTest1 {

	public static void main(String[] args) {
//		 1~10 사이의 랜덤한 수를 6개를 생성하여 리스트에 저장하고 , 출력하는 코드 작성하세요. 
//		 단. 중복 불가
		//1.리스트 생성
		//2.반복문 실행
			//2-1. 1~10사이의 램덤한 수를 생성
			//2-2. 리스트에 생성된 랜덤한 수가 있는지 체크
				//2-1-1. 없으면 리스트에 추가
		//3. 리스트 출력
		List<Integer> list = new ArrayList<Integer>(); //리스트 생성
		int max = 10;
		int min = 1;
		
		for(int i=1 ;i <=6; i++	) {
			int random = (int)(Math.random()*(max-min-1)-min);
			System.out.println(random);
			Iterator<E>
			
		}
	}
}
