package day14;

import java.util.Scanner;

public class TestEx1_1 {
	

	public static void main(String[] args) {
//	 	제목을 입력하고 , 단어 입력 후 해당 단어가 제목에 있는지 확인하는 코드 작성.
		String title, word;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("제목을 입력하세요: ");
			title = scan.nextLine();
			if(title.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("단어를 입력하세요: ");
			word = scan.nextLine();
			if(!title.contains(word)) {
				System.out.println(title + "에는"+word+"라는 단어가 없습니다.");
			}else {
				System.out.println(title + "에는"+word+"라는 단어가 있습니다.");
			}
			if(title.indexOf(word)==-1) {
				System.out.println(title + "에는"+word+"라는 단어가 없습니다.");
			}else {
				System.out.println(title + "에는"+word+"라는 단어가 있습니다.");
			}
			scan.nextLine();
		}
		scan.close();
	}
}
