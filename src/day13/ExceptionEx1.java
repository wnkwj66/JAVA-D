package day13;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			//예외가 발생할 수 있는 코드
//			System.out.println(1/0);
			int arr[] =new int[4];
			arr[4] =10;
			//예외 발생 시 이후 코드는 실행 되지 않고 catch로 건너 뜀 
			System.out.println("hello");
		}catch(ArithmeticException e){  
			//예외 처리
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(IndexOutOfBoundsException e) {
			//예외처리
			System.out.println("배열 관련 얘외가 발생");
		}catch(Exception e) {
			//예외처리
			System.out.println("예외 발생");
		}
	}

}
