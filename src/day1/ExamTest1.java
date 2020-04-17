package day1;

import java.util.Scanner;
//콘솔에서 정수를 입력 받아 변수에 저장 후 콘솔에 변수 값을 출력하는 코드를 작성하세요.
public class ExamTest1 {
	 public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("정수를 입력하세요:");
		num = scan.nextInt();
		System.out.println("입력한 정수:" + num);
		scan.close();
	 }
}
