package day6;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		//**숙제 풀이**
		int num = 5;
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}
		/* 문자 상수 a + 상수 1을 하면 자료형변환이 일어나지 않고 더해지기 때문에
		 * 결과가 문자 b가 나오면 바로 문자형 변수 ch에 저장이 가능하다.
		 */
		char ch = 'a'+1;//유니코드 활용
		//ch= (char)(ch+1); 로 해줘야 c 나옴// '상수+정수=??'
		System.out.println(ch);
		System.out.println(ch+1);
		System.out.println((char)(ch+1));
		// 문자 변수ch + 상수를 하면 문자 변수가 정수형int로 형변환되어  더해지기 때문에 결과가 정수가 된다.
		
	System.out.println("===============================================");
		
		int row,col;
		System.out.println("두 수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		row = scan.nextInt();
		col = scan.nextInt();
		for(int i=0, cnt =1; i<row; i++) {
			for(int j=0; j<col; j++) {//초기값(초기화)은 1부터 해도 되지만, 1부터 할경우 안의 수식값이 바뀜
				System.out.printf("%3d",cnt);
				//cnt 안쓰는경우 System.out.prinf("%3d".col*i + j + 1);
				cnt++; // 그냥 위 cnt 자리에 cnt++ 써도 됨. (난 모르겠음)
			}
			System.out.println();
		
		}
	}

}
