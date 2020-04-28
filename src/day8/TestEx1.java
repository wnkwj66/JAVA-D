package day8;

public class TestEx1 {

	public static void main(String[] args) {
//		'5~8 res = 까지  sum(num1,num2);에서 '11~12열' 
//		끌어 와서 다시 8에 집어넣고,9번 출력 후 실행문 종료
//		int num1 = 1, num2 = 2;
//		int res = sum(num1, num2);
//			System.out.println(res);
		int num1 = 1, num2 = 2;
		int res = sum2(num1, num2,3);
			System.out.println(res);
		
	}
	public static int sum(int num1 ,int num2) {
		return num1 + num2;
	}
	public static int sum2(int num1,int num2,int num3) {
		return sum(num1,num2)+num3;
	}
}
//5~12 res = 까지  실행 -> sum2 메서드 만나서 19열 메서드로 이동 후 int num1,int num2,
//int num3 입력 후(복사받아서 변수 입력) 20열 리턴값 sum이 있는 16열로 가서 복사 후 17열 리턴 값
//받아서 13열 출력 후 종료
