package day2;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		/* q1)변수 num를 선언하고 num의 초기값을 설정하여 
		num가 0이염 0이라고 출력하고,num가 양수이면 양수라고 출력하고
		num가 음수이면 음수라고 출력하는 코드를 if문을 이용하여 작성하세요*/
		int num = -14;
		System.out.print("정수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(num == 0) {
		System.out.println(num+"=0");		
		}
		if(num < 0) {
		System.out.println(num+" =음수");
		}
		if(num > 0) {
		System.out.println(num+" =양수");
		}
		if(num ==0) {
			System.out.println(num+"= 0");
		}else if(num < 0) {
			System.out.println(num+"= 음수");
		}else {
			System.out.println(num+"= 양수");
		}
		scan.close();
	}
}
