package day4;

import java.util.Scanner;

public class Test_rivew {

	public static void main(String[] args) {
		/*두 정수와 문자하나를 입력받아 출력하는 코드를 작성하세요.
		 * 두 정수와 문자 하나를 입력받아 -> 정수형 변수 2개 선언하고, 문자형 변수 1개 선언후 Scanner를 통해 
		 * 정수와 문자를 입력받아 출력 하는(system.out.println)것을 활용할 수 있다.
		 */
	/*System.out.print("정수를 입력하시오: ");
	int num1 ,num2; 
	char a;
	Scanner scan = new Scanner(System.in);
	num1 = scan.nextInt();
	a = scan.next().charAt(0);
	num2 = scan.nextInt();
	
	System.out.printf("%d %c %d%n",num1,a,num2);
	scan.close();
	*/
	
	
	/*int Num1, Num2;
	//char op;
	String str;
	Scanner Scan = new Scanner(System.in);
	System.out.println("두 정수와 문자를 입력하세요. (ex 1+2:)");
	Num1 = Scan.nextInt();
	//op = Scan.next().charAt(0);
	str = Scan.next();
	Num2 = Scan.nextInt();
	System.out.println(""+Num1+" "+str+" "+Num2);//★★★★★★★문자열 "" + 정수(1) 은 "1" 이라는 문자열★★★★★★★
	System.out.printf("%d %s %d\n",Num1,str,Num2);
	Scan.close();
	
	/*입력 받은 문자가 +이면 두 수의 합을 출력하고
	 * -이면 두 수의 차를 출력하고
	 *  /이면 두 수의 나눈 결과를 출력 하고
	 *  *이면 두 수의 곱한 결과를 출력 하고
	 *  %이면 두 수의 나머지 결과를 출력하는 코드를 작성하세요.
	 */
	int num1 = 0, num2 =0;
	int i,w,e,r;
	char op;
	Scanner SCAN = new Scanner(System.in);
	System.out.println("두 수와 연산을 입력하시오 :");
	num1 =SCAN.nextInt();
	op = SCAN.next().charAt(0);
	num2 =SCAN.nextInt();
	if(op=='+') {
		i = (num1+num2);
		System.out.printf("%d %c %d = %d",num1,op,num2,i);
		}
	else if(op=='-') {
		w = num1-num2;
		System.out.printf("%d %c %d = %d",num1,op,num2,w);
	}
	else if(op=='*') {
		e = num1*num2;
		System.out.printf("%d %c %d = %d",num1,op,num2,e);
	}
	else if(op=='/') {
		System.out.printf("%d %c %f = %f%n",num1,op,(float)num2,(float)num1/num2);
	}                               //%.2f 소숫점 2번째 자리까지 표현
	else if(op=='%') {
		r = num1%num2;
		System.out.printf("%d %c %d = %d",num1,op,num2,r);
	}
	else {
		System.out.println("산술 연산자가 아닙니다.");
	}
	SCAN.close();
	//switch처리 방법
	switch(op) {
		case'+' :
			System.out.printf("%d %c %d = %d",num1,op,num2,num1+num2);
			break;
		case'-' :
			System.out.printf("%d %c %d = %d",num1,op,num2,num1*num2);
			break;
		case'*':
			System.out.printf("%d %c %d = %d",num1,op,num2,num1*num2);
			break;
		case'/':
			System.out.printf("%d %c %d = %.2f%n",num1,op,num2,(float)num1/num2);
			break;
		case'%':
			System.out.printf("%d %c %d = %d",num1,op,num2,num1%num2);
			break;
		default:
			System.out.println("산술 연산자가 아닙니다.");
		
		}
	}	
}

