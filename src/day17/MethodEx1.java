package day17;

import java.util.Scanner;

public class MethodEx1 {
//	main 메서드부터 실행 순서를 줄수로 표현하세요.(단,1 / 2를 입력햇다고 가정)
//	 
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요(1 + 2): ");
		int num1, num2;
		char op;
		try {num1 = scan.nextInt();
		 	op = scan.next().charAt(0);
		 	num2 = scan.nextInt();
		 	System.out.printf("%d %c %d = %1.f\n",num1,op,num2,ch(num1,op,num2));	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
	//기능 : 두 정수의 합을 반환하는 메서드
	public static int sum (int num1 , int num2) {
		return num1 + num2;
	}
	//기능 : 두 정수의 차를 반환하는 메서드
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	//기능 : 두 정수의 곱을 반환하는 메서드
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	//기능 : 정수A를  정수B로 나눈 결과를 반환하는 메서드
	public static double div(int num1, int num2) {
		return (double)num1/num2;
	}
	//기능 : 정수 A를 정수B로 나눈 결과를 반환하는 메서드
	public static int rem(int num1,int num2) {
//		int res = num1 % num2;
//		System.out.println(res);
		return num1%num2;
	}
//	기능 : 정수 A와 정수 B를 산술연산자 OP의 결과를 반환하는 메서드
	public static double ch(int num1, char op, int num2) {
		switch(op) {
		case '+' : return sum(num1, num2); 
		case '-' : return sub(num1, num2); 
		case '*' : return mul(num1, num2); 
		case '/' : 
			if(num2 ==0) throw new ArithmeticException("예외 : 0으로 나눌 수 없습니다.");
			return div(num1, num2);
			
		case '%' : 
			if(num2 ==0) throw new ArithmeticException("예외 : 0으로 나눌 수 없습니다.");
			return rem(num1, num2); 
		default:	throw new ArithmeticException("예외:"+op+"는 산술 연산자가 아닙니다");
		}
	}
}
