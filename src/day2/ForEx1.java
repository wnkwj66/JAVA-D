package day2;

public class ForEx1 {

	public static void main(String[] args) {
		//For문 기본 예제 : Hello world 5번 출력
		/*1.반복횟수: i는 1부터 5까지 1씩 증가
		 *          i는 1부터 9까지 1씩 증가           7*i 
		 *          i는 7부터 63까지 7씩증가          7*i/7
		 * 2.규칙성: i를 출력 -> 7 * i = 7*i를 출력
		 * 7*1 = 7
		 * 7*2 = 14
		 * 7*3 = 21
		 * 7*4 = 28
		 * 7*5 = 35
		 * 7*6 = 42
		 * 7*7 = 49
		 * 7*8 = 56
		 * 7*9 = 63
		 */
		int i;
		for(i=1; i<=5; i++) {
			System.out.println("Hello world");
		}
		System.out.println("-----------");
		for(i=0; i<5; i++) {
			System.out.println("Hello world");
		}
		System.out.println("----------");
		//for문 기본 예제 : 1에서 5가지 출력하는 예제
		for(i=1;i<=5;i++) {
			System.out.println(i);
		}
	}

}
