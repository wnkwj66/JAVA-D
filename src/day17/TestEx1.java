package day17;

import java.util.*;

public class TestEx1 {
	// 두 정수를 입력받아 두 정수를 더하여 출력하느 코드를 자유롭게 작성하세요.
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);// 참조변수, 지역변수
		int num1 = scan.nextInt();// 일반변수, 지역변수
		Integer num2 = scan.nextInt(); // 참조변수 ,지역변수
		System.out.println(num1 + " + " + num2 + " = "+(num1+num2));
		System.out.println(num1 + " + " + num2 + " = "+ sum(num1,num2,0));
		System.out.println(num1 + " + " + num2 + " = "+ sum(num1,num2));
		scan.close();

	}
	public static int sum(int num1, int num2, int res) {
		res = num1 + num2;
		return res;
	}
	public static int sum(int num1, int num2) {
		int res = num1 + num2; //지역변수 ,일반변수
		return res;
	}
}
//- 두 정수의 최대 공약수를 구하는 메서드를 생성하고,  main에서 테스트 해보시오.
//- 두 정수의 최대 공약수 메서드를 이용하여 두 정수의 최소 공부새룰 구하는 메서드를 생성하고, main에서 테스트 해보시오
//- 최대 공약수가 g, 두 정수가 A,B라고 하면 최소 공배수 l는 다음과 같다.
//I = A*B/g
