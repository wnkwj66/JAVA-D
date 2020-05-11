package day13;

import java.util.Scanner;

public class Homework_1 {

	public static void main(String[] args) {
//		1~50사이의 랜덤한 수를 컴퓨터가 생성하고, 사용자가 해당수를 맞추는 게임
//		1.랜덤한 수를 생성
		int max = 50 , min = 1 ;
		int random = (int)((Math.random()*max-min+1)+min);

		Scanner scan = new Scanner(System.in);
		int num = min -1;
		
//		2.반복문을 작업 => 랜덤수를 맞출 때까지
		while(num != random) {
//		3.정수 입력
		num = scan.nextInt();
//		4.비교를 통해 up or Down출력
			if(num > random) {
			System.out.println("Down");
			}else if (num < random) {
			System.out.println("Up");
			}else {
				System.out.println("정답입니다");
			}
		}scan.close();
	}
}
