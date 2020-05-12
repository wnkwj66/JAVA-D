package day14;

import java.util.Random;

public class Util_Random {

	public static void main(String[] args) {
		double r1 = Math.random(); // 0.0 <= Math.random() <1.0
		System.out.println(r1);
		
		// 현재 시간을 기준으로 Random 객체를 생성
		Random random = new Random();
		double r2 = random.nextDouble(); // 0.0 <= Math.random() <1.0
//		간단히 double r2 = new Random().nextDouble(); 로 사용할 수있다.
//		        :new를 통해 객체를 생성 -> Random()생성자를 호출하여 초기화 -> nextDouble()메서드 호출
		System.out.println(r2);
		
		String str = "123 afd \t1 \n";
//		trim()은 결과가 String(문자열)이기 때문에 trim()하고 이어서 바로 
//		String의 멤버 메소드인 charAt()을 호출할 수 있다.
		System.out.println(str.trim().charAt(2));
		System.out.println("-----------------");
		int max = 10, min = 1;
		int ran1 = (int)(Math.random()*(max-min+1)+min);
		System.out.println(ran1);
		//nextInt(a) : 0~a 사이의 랜덤한 수를 만듦. 위 아래 편한방법 사용하면 됨
		int ran2 = random.nextInt(max-min) +min;
		System.out.println(ran2);
		
	}

}
