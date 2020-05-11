package day13;

public class ExceptionEx2 {

	public static void main(String[] args) {
//		throw를 통해 예외를 발생시키는 예제 :특정상황이 되면 강제로 예외발생
		int num1 = 1,num2 = 0;
		char op ='?';
		try {
			switch(op) {
			case '+': System.out.println(num1 + num2); break;
			case '-': System.out.println(num1 - num2); break;
			case '*': System.out.println(num1 * num2); break;
			case '/': System.out.println(num1 / num2); break;
			case '%': System.out.println(num1 % num2); break;
			default :   throw new Exception(op+"는 잘못된 연산자");
			//위에 Exception 대신 ArithmeticException라고 써도 가능:
			//  ArithmeticException가 자식 클래스 이므로 아래 캐치에서 자동형변환 가능
			
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
