package day3;

public class ForEx5 {

	public static void main(String[] args) {
		int i;
		/*조건식 ( ; ; ) 무한 루프 (조건식이 없으면 참(true))이기 때문.
		for( ; ; ) {
			System.out.println("Hellow");
			
		}
		System.out.println("Hellow"); 에러발생 ,무한 루프로 인해 실행 되지않음*/
		
		int sum = 0;
		/* i값이 변경되지 않아 무한루프 빠짐
		 *
		for(i=1; i<=5; sum++) {
			System.out.println("Hellow");
		}*/
		
		
		/* i가 계속 감소하여 언더플로우로 인해 정수 최대값이 되는 순간까지 반복 되는 코드
		
		for(i=1; 1<=5; i--) {
			System.out.println("Hellow");
		}*/
		
		
		//반복문이 한번도 실행되지 않은 경우
		for(i=10; i<=5; i++) {
			System.out.println("Hellow");
		}
		//변수는 선언한 위치부터 변수가 선언되어 {} 안에서 유효하다. (사용할 수 있는 범위 달라짐)
		//j는 for문의 초기화 위치에서 선언되었기 때문에 반복문 안에서 유효하다
		for(int j=1; j<=5; j++) {
			System.out.println(j);
			char ch = 'A';
			System.out.println((char)(ch+j));
		}
		//System.out.println(j); 에러발생, j의 사용범위 밖에서 j를 선언했기 때문

	}

}
