package day5;

public class MethodEx1 {

	public static void main(String[] args) { //void : 리턴 타입 없을 때 사용
		System.out.println(gcd(10,15));
		System.out.println(lcm(10,15));
		if(isPrime(11)) {
			System.out.println("343은 소수");
		}else {
			System.out.println("343은 소수가 아님");
		}
		//int res = sum(1,2);
		//char res2 = sum(1,2);  //에러발생
		/*int num1 =1 ,num2 =2;
		 * char ch =1+2;   //가능
		 * ch = num1 + num2//불가능
		 */
		//System.out.println(res);
		//1.메서드의 이해

	}
	/* 기능(function): 두 정수의 합을 알려주는 메서드
	 * 매개 변수: 두 정수 => int(자료형) num, int num2  -최소한의 정보
	 * 리턴 타입: 합 => 정수 => int                   -정보의 자료형
	 * 메서드 명: sum
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2; //메서드를 종료하고, 값을 전달하는 역할
	}
	//1-1)메서드 예제
	/* 기능 : 두 정수의 최대 공약수를 알려주는 메서드
	 * 매개 변수:두 정수 -> int num1. int num2
	 * 리턴 타입: 최대 공약수(나머지 가0) -> 정수 -> int
	 * 메서드 명: gcd?
	 */
	public static int gcd (int num1, int num2) {
		int res= 1; //최대 공약수를 저장하는 변수 (=예전예제 gcd)
		for(int i=1; i<= num1; i++) {
			if(num1 % i==0 && num2 % i ==0) {
				res = i;
			}
		}
		return res;
	}
	//1-2)메서드 활용 (간략화)
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1,num2); //최소공배수 구하는 공식 
	}
	/* 기능 : 정수가 소수인지 아닌지 판별하는 메소드
	 * 매개변수 : 정수 = int num
	 * 리턴타입 : 소수인지 아닌지 -> 참, 거짓 -> boolean
	 * 메소드명 : isPrime
	 */
	public static boolean isPrime(int num) {
		int cnt =0;
		for(int i=1 ; i*i <= num; i++) {
			if (num % i ==0) {
				cnt++;				
			}
		}
		if(cnt == 1) {			
			return true; //return은 조건값이 충족 되면 메서드 종료이기 때문에 아래코드 실행 안됨
		}//else {
		return false; // } 로 해도 가능
	}
}
