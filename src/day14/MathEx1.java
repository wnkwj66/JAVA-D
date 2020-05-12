package day14;

public class MathEx1 {

	public static void main(String[] args) {
//		1.올림 , 버림 , 반올림
		System.out.println(Math.ceil(1.5)); //올림 
		System.out.println(Math.floor(1.5)); // 버림
		System.out.println(Math.round(1.5)); // 반올림 (리턴 타입이 Long)
		
//		원하는 자리에서 반올림 한 수를 얻고 싶다면 10의 n 제곱을 한 후 다시 곱한만큼 나눠주면 된다.
//		소수점 둘째자리에서 올리고 싶다면 숫자에 *10을 한 후 다시 곱한 수로 나눠주면 된다.
		double num = 1.51;
		num = num*10;
		System.out.println(Math.ceil(num)/10); //올림
		System.out.println(Math.floor(num)/10); //버림
		System.out.println(Math.round(num)/10.0); //반올림
	}

}
