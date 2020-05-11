package day13;

import java.util.Scanner;

public class ExceptionTestEx1 {

	public static void main(String[] args) {
//		반복문을 통해 문자를 입력받고 입력받은 문자가 1이면 1입니다 라는 예외를 발생시키는 코드를 작성하세요
//		예)  문자를 입력하세요 : a
//			문자를 입력하세요 : b
//			문자를 입력하세요 : 1
//			예외가 발생했습니다. : 1
		Scanner scan = new Scanner(System.in);
		char op;
		
		try {
			while(true) {
				System.out.print("문자를 입력하세요 : ");
				op = scan.next().charAt(0);
				if(op == '1') {
					throw new Exception("예외가 발생했습니다 .: "+ op );
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			//예외발생과 상관없이 무조건 실행되어야 하는 코드
		}
		scan.close();
	}
}
			
		