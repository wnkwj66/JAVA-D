package day19;

import java.util.Scanner;

public class TestEx5_1 {
//	정수를 입력받아 입력받은 정수를 거꾸로 만들어 원래 정수와 거꾸로한 정수의 합을 출력하는 코드를 작성하세요
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		int tmp = num;
		String res="";
		while(tmp != 0) {
			res += tmp %10; // res = res + tmp %10
			tmp = tmp/10;			
		}
		if(num!=0)
			System.out.println("거꾸로한 정수:"+res);
		else {
			System.out.println("거꾸로한 정수:"+num);
			res = "0"; // 예외처리
		}
		int reverseNum = Integer.parseInt(res);
		int sum = num + reverseNum;
		System.out.println(sum);
		scan.close();
	}


}
