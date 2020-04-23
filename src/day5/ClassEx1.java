package day5;
	
import day4.Test_rivew3; //day4.* 하면 day4결과 값을 모두 불러옴 // 일반적으로 *은 '모든'이라는 의미
import day5_1.*;
public class ClassEx1 {

	public static void main(String[] args) {
		// 1. 접근제한자
		Test_rivew3.main(null);
		System.out.println();
		DefaultClassEx1.main(null);
		/*DefualtClassEx2는 다른패키지에 있는 클래스인데 접근제한자가 default라서 사용 불가 - 에러발생
		DefualtClassEx2.main(null);  */
		Point p1 = new Point(); // 객체 선언 = 생성자 호출; -> 객체 생성
		p1.x1 = 10;
		p1 = new Point(1,2);
		//p1 = new Point(3,4,5);//에러 = 매개변수가 2개인 생성자 없기 떄문
		//p1 = new Ponint(1); // 에러 = 매개변수가 1개인 생성자 없기 떄문
		//p1.x2 = 10; 은 사용x => private기 때문에 Point 클래스 안에서만 사용 가능.
	}
}
//Point : 2차원 좌표평면에서 점 1개를 나타내는 클래스
class Point{
	int x1; // x축의 좌표
	int y1; // y축의 좌표
	private int x2;
	private int y2;
	public int x3;
	public int y3;
	public Point() {
		x1= x2 =x3 =0;
		y1= y2 =y3 =0;
		System.out.println("Point의 기본생성자 호출");
	}
	//생성자 오버로딩 
	public Point(int x, int y) {
		x1= x2 =x3 = x;
		y1= y2 =y3 = y;
		System.out.println("Point의 생성자 오버로딩 호출");
	}
}