package day15;

import java.util.ArrayList;
import java.util.Scanner;
//문제1)
//오늘의 할일을 리스트에 저장하고 출력하는 코드를 ArrayList를 이용하여 작성하세요
//예)
//오늘의 할 일을 추가하시겠습니까 ? (y/n) : y
//오늘의 할 일을 입력하세요 : 수업
//오늘의 할 일을 추가하시겠습니까 ? (y/n) : y
//오늘의 할 일을 입력하세요 : 점심
//오늘의 할 일을 추가하시겠습니까 ? (y/n) : n
//오늘의 할일
//1. 수업
//2. 점심
//프로그램 종료합니다.
public class ArrayLIstEx1 {

	public static void main(String[] args) {
//		1.객체를 생성
		ArrayList<today> list = new  ArrayList<today>();
		Scanner scan = new Scanner(System.in);
		char op = 0;
		String str;
		while(op != 'n') {
			System.out.print("오늘의 할일을 추가하시겠습니까?(y/n)");
			op = scan.next().charAt(0);
			scan.nextLine();
			if(op == 'y') {
				System.out.print("오늘의 할일을 입력하세요 :");
				str = scan.nextLine();
				
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}

class today{
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	@Override
	public String toString() {
		return "today [str=" + str + "]";
	}
	
}
		

