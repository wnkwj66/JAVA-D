package day6;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		/* (+++여러명)(++5명)학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요.
		 * +++학생의 성적이 음수가 입력되면 종료하세요.
		 * 100 ~ 90 : A
		 * 89 ~ 80 : B
		 * 79 ~ 70 : C
		 * 69 ~ 60 : D
		 * 59 ~ 50 : F
		 * 100점이상 : 잘못된 수입니다.	
		 */
		Scanner scan = new Scanner(System.in);
		int num;
		/*int num = 0;
		num =scan.nextInt();*/
		for(int i = 1;i==i ;i++) {
			System.out.print("점수를 입력 하세요(종료하려면 음수입력) :");
			num = scan.nextInt();
			if(num <= 100 && num >= 90 ){
				System.out.printf("%d = A학점",num );
				System.out.println();
			}else if(num <= 89 && num >=80){
				System.out.printf("%d = B학점",num );
				System.out.println();
			}else if(num <= 79 && num >=70) {
				System.out.printf("%d = C학점",num);
				System.out.println();
			}else if(num <= 69 && num >=60) {
				System.out.printf("%d = D학점",num);
				System.out.println();
			}else if(num <=59 && num > 0  ) {
				System.out.printf("%d = F학점",num);
				System.out.println();
			}else if(num >100 ){
				System.out.println("잘못된 점수입니다.");
			}else {
				System.out.println("지금까지 입력확인한 학생의 수는"+(i-1)+"명 입니다.");
				System.out.println("종료합니다.");
				break;
			}
		}scan.close();
	}
}
