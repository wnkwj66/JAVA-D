package day7;
import java.util.Scanner;

public class MethodEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printMultiplTable(num);
		System.out.println("=============");
		int start = 19, end = 10;
		int res = printMultiplTable(num, start, end);
		if( res == 0) {
			System.out.println("0단의 모든 값은 0입니다.");
		}else if(printMultiplTable(num, start, end)== -1) {
			System.out.println("구구단의 시작 번호와 끝 번호가 바뀌었습니다.");
		}
//		printMultiplTable(num, 10, 19);
		scan.close();
		}
//	기능: num가 주어지면 주어진 num구구단의 한 단을 출력하는 메서드
//	매개변수 : 주어진 num의 구구단 -> int num
//	리턴타입 : 없음 -> void
//	매서드명 : printMultiplTable
	public static void printMultiplTable(int num) {
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d x %d = %2d%n",num,i,num*i);
		}
		
	}
//	기능: num가 주어지면 주어진 num구구단의 한 단을 출력하는 메서드
//	매개변수 : num단, 단의 시작, 단의 끝 -> int num, int start, int end
//	리턴타입 : 없음 -> void
//	매서드명 : printMultiplTable
//	public static void printMultiplTable(int num, int start,int end) {
//		for(int i = start; i<=end; i++) {
//			System.out.printf("%d x %d = %2d%n",num,i,num*i);
//		}
//		
//	}
//	기능: num가 주어지면 주어진 num구구단의 한 단을 출력하는 메서드
//	매개변수 : num단, 단의 시작, 단의 끝 -> int num, int start, int end
//	리턴타입 : 0=> 0단이 입력됨 => 출력안함
//			1=> 정상출력
//			-1=> start > end 경우 => 출력안함
//			정수형 => int
//	매서드명 : printMultiplTable
	public static int printMultiplTable(int num, int start,int end) {
		if(num == 0)
			return 0;
		if(start > end)
			return -1;
		for(int i = start; i<=end; i++) {
			System.out.printf("%d x %d = %2d%n",num,i,num*i);
		}
		return 1;
	}
}


