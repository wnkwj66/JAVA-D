package day2;

public class ForEx3 {

	public static void main(String[] args) {
		/* 1부터 5까지의 합을 구하는 코드를 for문으로 작성하세요.
		 * 1.반복횟수: i는 1부터 5까지 1씩증가
		 * 2.규칙성: sum = sum + i (실행문)
		 * 3.반복문 종료 후: 1부터15까지의 합 sum출력
		 * sum = 0;
		 * i=1, sum = 0 + 1
		 * i=2, sum = 0 + 1 + 2
		 * i=3, sum = 0 + 1 + 2 + 3
		 * i=3, sum = 0 + 1 + 2 + 3 + 4
		 * i=3, sum = 0 + 1 + 2 + 3 + 4 + 5
		 * sum0 = 0;
		 * i=1, sum1 = sum0 + 1
		 * i=2, sum2 = sum1 + 2
		 * i=3, sum3 = sum2 + 3
		 * i=4, sum4 = sum3 + 4
		 * i=5, sum5 = sum4 + 5
		 *      sum = sum + ??		 * */
		int sum = 0;
		for(int i=1; i <=5; i +=1) {
			System.out.println(sum=sum+i);
		}
		
		int i, Sum= 0;
		for(i=1; i<=5; i+=1) {
			Sum = Sum + i; //sum += i;
		}
		System.out.println("1부터 5까지의 합:"+ Sum);
	}

}
