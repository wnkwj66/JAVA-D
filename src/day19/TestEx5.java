package day19;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
//		 - 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하세요
//		 예) 
//		 정수를 입력하세요 : 12345
//		 결과 : 54321
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		int tmp = num;
		String res="";
		while(tmp != 0) {
			res += tmp %10;
			tmp = tmp/10;			
		}
		if(num!=0)
			System.out.println(res);
		else
			System.out.println(num);

		res = " "+ num;
		String reverseRes = "";
		for(int i = res.length()-1; i>=0; i--) {
			reverseRes += res.charAt(i);
		}
		System.out.println(reverseRes);
		scan.close();
		
	}

}
