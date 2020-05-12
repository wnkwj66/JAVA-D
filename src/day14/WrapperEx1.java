package day14;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = null; x : 정수형 값에 null이라는 값은 없기 때문에
		Integer num = null; // 래퍼 클래스 
		
		boolean b1 = true; //기본
		Boolean b2 = true; //래퍼
		
		char ch1 = 'a'; //기본   ch1 변수에 a를 저장
		Character ch2 = 'a'; // 래퍼  a가 저장된 주소를 ch2에 전달,오토박싱
		ch1 = ch2; 
//		위의 값은 원래 ch1이라는 기본형변수에 참조변수를 넣는다는 것이라 안되는데, 언박싱에 의해서 ch2의 주소 값을 준다 
		
		 
		int num1 = 10;     //기본
		Integer num2 = 10; //래퍼
		
		double dnum1 = 1.23;//기본
		Double dnum2 = 1.23;//래퍼
		Double dnum3 = new Double(1.23); // 생성자를 통해서도 가능 (클래스기 때문)
	}

}
