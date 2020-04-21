package day3;

public class WhileEx2 {

	public static void main(String[] args) {
		// 두 정수 num1과 num2의 최소 공배수를 구하는 코드를 작성하세요.
		// 최소 공배수: 두 수의 공배수중 가장 작은수 / 공배수: 두 수의 배수중 공통인 배수
		// 1. 반복횟수 : i는 1부터 num1*num2까지 1씩 증가
		// 2. 규칙성 : i가 num1에 배수이고 , i가 num2의 배수 이(면) i를 출력하고, 반복문을 종료)
		// 3. 반복문 종료 후 : 없음
		int num1 =10, num2 = 15;
		int i=1;
		//초기화 i=1
		i=1;
		while(i <= num1*num2) {
			if(i % num1 ==0 && i % num2 == 0)/*i가 넘버1의 배수이고 i가 num2의 배수이다*/ {
			System.out.printf("%d와 %d의 최소공약수: %d\n",num1,num2,i);	
			break;//반복문 종료
			} i++;
			/*위 예제는 i가 1부터 시작해서 최소 공배수를 구하기 때문에 최소 공배수가 큰 경우 반복횟수가 많아진다.
			 *아래처럼 i를 num1부터 시작 하여  nm1의 배수로 한다면 반복횟수가 줄어든다.
			 * */
		i=num1;
		while(i <= num1*num2) {
		  if(i % num2 == 0)/*i가 넘버1의 배수이고 i가 num2의 배수이다*/ {
			System.out.printf("%d와 %d의 최소공약수: %d\n",num1,num2,i);	
			break;//반복문 종료
				}
			}i+=num1;
		}	
	}
}
