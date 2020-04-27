package day7;

import java.util.Scanner;

public class MethodEx5 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		int num =1;
		if(isPrime1(num)) {
			System.out.println(num+"은(는) 소수입니다.");
		}else {
			System.out.println(num+"은(는) 소수가 아닙니다.");
		}
		if(isPrime2(num)) {
			System.out.println(num+"은(는) 소수입니다.");
		}else {
			System.out.println(num+"은(는) 소수가 아닙니다.");
		}
		isPrime(1, 0);
		


	}
//	기능 : 주어진 정수가 소수 인지 아닌지 알려주는 메서드
//	매개변수 : 정수-> int num,int cnt;
//	리턴타입 : 정수가 소수인지 아닌지
//	메서드명 : isPrime
	public static void isPrime(int num,int cnt) {
		for (int i=2; i<num;i++) {
			if(num % i ==0) {
			}	
		}
		if(cnt == 0) {
			System.out.println(num+"은(는) 소수입니다.");
		}else {
			System.out.println(num+"은(는) 소수가 아닙니다");
		}
	}
//	기능: 주어진 정수가 소수인지 아닌지 알려주는 메서드
//	매개변수 : 정수 ->int num;
//	리턴타입 : 소수인지 아닌지->참/거짓 => boolean
//	메서드명 : isprime
	public static boolean isPrime1(int num) {
		int cnt = 0;
		if(num ==1)
			return false;
		for (int i=2; i<num;i++) {
			if(num % i ==0) {
			}	
		}
		if(cnt == 0) {
			return true;
		}else {
			return false;
		}
	}
//	isPrime1과 isPrime2는 같은말
	
	public static boolean isPrime2(int num) {
		if(num ==1)
			return false;
		for (int i=2; i<num;i++) {
			if(num % i ==0) {
				return false;
			}	
		}
		return true;
	}

}
