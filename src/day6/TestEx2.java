package day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/* 문자를 입력(스캔)받아 입력받은 문자를 출력(프린트)하세요.	
		 * 단, 소문자 q를 입력하면 문자출력대신 '종료합니다.'가 출력되도록 수정하세요.
		 * ++더 이상 반복되지 않도록 수정.
		 * ++회수 제한없이 계속 출력되다가 q나오면 종료 되도록 수정*/
		System.out.println("문자를 입력하세요:");
		char op;
		Scanner scan = new Scanner(System.in);
		op =scan.next().charAt(0);
		System.out.printf("%c",op);
		for(int i=1,cnt=1; i==cnt;i++) {//++조건식 안을 무조건 ture로  만들면 무한루프에 빠져서 횟수제한없이 계속 출력됨.
			//for(; ;){ // for(int i=1; i=i){ // for (int i=1.i<=5; ){ 등 다양한 방법 있다.
			cnt++;
			//i=op; 해버리면 실행문 종료 돼서 수기로 5번 복사 해야함.
			System.out.println();
			System.out.println("문자를 입력하세요 :");
			op =scan.next().charAt(0);
			if(op !='q') //실행문이 한줄이면 {} 생략 가능
			System.out.printf("%c",op);
			else {
				System.out.println("종료합니다.");
			break;//i=op;
			}
				/*if(op=='q') {
				i=op;
				System.out.println();
				System.out.println("종료합니다."); 여기 위치하면 q종료합니다. 라고 출력됨*/
			}
		/*	System.out.println();
			System.out.println("문자를 입력하세요 :");
			op =scan.next().charAt(0);
			System.out.printf("%c",op);
			System.out.println();
			System.out.println("문자를 입력하세요 :");
			op =scan.next().charAt(0);
			System.out.printf("%c",op);
			System.out.println();
			System.out.println("문자를 입력하세요 :");
			op =scan.next().charAt(0);
			System.out.printf("%c",op);*/
		//scan.close();
		int i=1,cnt;
		while(i<=5) {
			System.out.println();
			System.out.println("문자 입력:");
			op = scan.next().charAt(0);
			System.out.printf("%c",op);
			i++;
			if(op=='q') {
				//i=op;
				System.out.println();
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}
