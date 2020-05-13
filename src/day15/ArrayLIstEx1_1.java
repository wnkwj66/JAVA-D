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
//******메서드 이용해서 만들어 보기
public class ArrayLIstEx1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			System.out.println("오늘의 할 일을 추가하시겠습니까 ? (y/n) :");
			char menu = scan.next().charAt(0);
			scan.nextLine();
			if(menu == 'y' || menu == 'Y') {
				System.out.println("오늘의 할일을 입력하세요 : ");
				String toDo = scan.nextLine();
				list.add(toDo);
			}else if(menu == 'n' || menu == 'N') {
				for(int i=0; i<list.size(); i++) {
					System.out.println(i+1 + "." + list.get(i));
				}
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
