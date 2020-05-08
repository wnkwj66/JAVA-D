package day9;

public class OverloadingEX {

	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1.1, 2.1));
		System.out.println(sum(1.2, 2.3, 3.4));
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum());
		//문자 1에 대한 자동형변환으로 인해 가능
		System.out.println(sum('1',1,2,3,4,5));
//		System.out.println(sum("1",1,2,3,4,5)); 
	}
//	두 정수의 합을 알려주는 메서드
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
//	두 실수의 합을 알려주는 메서드
	public static double sum(double a, double b) {
		double result = a + b;
		return result;
	}
//	세 실수의 합을 알려주는 메서드
	public static double sum(double a, double b, double c) {
		double result = a + b + c;
		return result;
	}
//	n개의 실수의 합을 알려주는 메서드(가변인자를 이용한 합계 구하는 메서드)
	public static double sum(double...nums ) {
		double result = 0.0;
		for(double tmp : nums) {
			result += tmp;
		}
		return result;
	}

}
