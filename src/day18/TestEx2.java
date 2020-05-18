package day18;

import java.util.Scanner;

public class TestEx2 {
//1. 성적을 입력받아 입력받은 성적이 어떤 학점인지 판별하는 코드를 작성하세요.
// 	A:90이상 100이하
// 	B:80이상 90미만
// 	C:70이상 80미만
// 	D:60이상 70미만
// 	F:0이상 60미만
	
//2. 1번에서 작성한 내용을 메소드로 만드세요.
	
//3. 영어 사전을 프로그램으로 만들려고 한다.이 때 단어를 지정할 수 있는 클래스를 생성해보시오(기능구현 x)
	
 	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
// 		System.out.print("성적을 입력하세요 : ");
// 		int num = scan.nextInt();
// 		if(90 <= num && num <=100) {
// 			System.out.println("A학점");
// 		}else if(80 <= num ) {
// 			System.out.println("B학점");
// 		}else if(70 <= num) {
// 			System.out.println("C학점");
// 		}else if(60 <= num) {
// 			System.out.println("D학점");
// 		}else if(num < 60) {
// 			System.out.println("F학점");
// 		}
 		System.out.println(grade(scan));
 	}
// 	기능: 스캐너를 통해 입력받은 점수를 통해  점수를 판별하는 기능
// 	매개변수 : 스캐너  
// 	리턴타입 : char
// 	메소드명 score
 	public static char grade(Scanner scan) {
 		System.out.println("성적을 입력하세요: ");
 		int num = scan.nextInt();
 		if(num< 0 || num >100) {
 			throw new ArithmeticException("예외 : 범위를 벗어났습니다.");
 		}
 		if(90 <= num && num<=100) {
 			return 'A';
 		}else if(80 <= num ) {
 			return 'B';
 		}else if(60 <= num) {
 			return 'C';
 		}else if(60 <= num) {
 			return 'D';
 		}else{
 			return 'F';
 		}
 	}
}

