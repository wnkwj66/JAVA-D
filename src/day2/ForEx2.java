package day2;

public class ForEx2 {

	public static void main(String[] args) {
		// 구구단 7단을 출력하는 코드 For문 이용하여 작성
		/* int i, num = 7
		 * for( ; ; ){
		 * }
		 */
		int i, num =6;
		for(i=1;i<=9;i++) {
			System.out.println(i*7);
		}
		for(i=1;i<=9;i+=1) {
			System.out.printf("%d x %d = %d\n",num,i,num*1);
		}
		for(i=1; i <=9; i+=1) {
			System.out.println(num+"x"+i+"="+num*1);
		}
		
	}

}
