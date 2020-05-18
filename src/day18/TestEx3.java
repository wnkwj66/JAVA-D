package day18;

public class TestEx3 {

	public static void main(String[] args) {
		int num = 9;
		if(primeNum(num)) {
			System.out.print(num+"는 소수");
		}else {
			System.out.print(num+"는 소수가 아님");
		}
//		div(2,9); 
	}
//	기능: 정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 코드를 작성하세요.(단,메서드 이용)
//	매개변수 : 정수 
//	리턴 타입: 없음
	public static boolean primeNum(int num ) {
		int cnt = 0;
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {//2거나 2로나눳을때 1이면 cnt 증가
				cnt++; //소수의 개수를 1개 증가
			}
			if(cnt == 2) return true;
		}return false;
	}
//	 기능:두 정수가 주어졌을 때 두 정수의 최대 공약수가 1이면 서로소라고 출력하고, 서로고사 아니면 서로소가 아님 이라고 출력하는 코드작성
//	매개변수: 두개의 정수 =>int num1, int num2
//	리턴타입 : 
	public static void div(int num1, int num2) {
		 
		if((num1 ==2 && num2 ==2)||num1 % 2 == 1 && num2 % 2 ==1) {
			System.out.println("서로소");
		}else {
			System.out.println("서로소 아님");
		}
	}
}
