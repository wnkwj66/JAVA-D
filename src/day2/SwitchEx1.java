package day2;

public class SwitchEx1 {

	public static void main(String[] args) {
		// Switch문을 이용한 홀짝 판별 예제
		int num =2;
		switch(num % 2) {
		case 0:
			System.out.println(num+"는 짝수");
			break;
		case 1://defualt:로 처리가능
			System.out.println(num+"는 홀수");
			
		}

	}

}
