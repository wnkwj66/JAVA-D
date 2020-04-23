package day5;

public class ClassEx2 {

	public static void main(String[] args) {
		Point1.printCount();
		Point1 p1 = new Point1();
		p1.printPoint();
		p1.moveXY(4, 5);
		p1.printPoint();
		//getter,setter출력 테스트
		p1.setX1(2);
		p1.printPoint();
		p1.setY1(7);
		p1.printPoint();
		Point1.printCount();
		//새로운 객체 
		Point1 p2 = new Point1(10,10);
		p2.printPoint();
		Point1.printCount();
	}

}
/* 클래스명 : Point1
 * 멤버변수 : x1좌표, y1좌표 -> 외부에서 접근이 불가능 하도록
 * 기능(메서드)
 *  -1) 현재 좌표를 출력하는 기능
 *  -2) x,y좌표가 주어지면 해당 좌표로 이동하는 기능
 *  -3) x의 값이 주어지면 x1의 값을 수정하는 기능
 *  -4) y의 값이 주어지면 y1의 값을 수정하는 기능
 *  -5) x1의 값을 가져오는 기능
 *  -6) y1의 값을 가져오는 기능
 * 생성자
 *  -기본 생성자
 *  -x,y좌표가 주어졌을 때 객체를 생성하는 생성자
 */
class Point1{
	//접근제한자 (static) 리턴 타입 메서드명(매개변수){
	private int x1,y1; // why: private 메서드명 (int x, int y) 안되는지
	/* 기능 :1) 현재 나의 좌표를 출력하는 기능
	 * 매개변수: 없음 (현재 나의 정보이기 때문)
	 * 리턴타입: 없음
	 * 메소드명: printPoint
	 */
	private static int count;
	public void printPoint() {
		System.out.printf("(%d,%d)\n",x1,y1);
	}
	/* 기능: 2)x,y좌표가 주어지면 해당 좌표로 이동하는 기능
	 * 매개변수 : x,y 좌표 => int x, int y 
	 * 리턴타입 : 없음
	 * 메소드명 : moveXY
	 */
	public void moveXY(int x, int y) {
		x1 =x;
		y1 =y;
	}
	/* Getter/Setter [Alt+Shift+s ->Generate getters/setters]
	 * Getter: 멤버변수가 private인 경우,직접 멤버 변수의 값을 가져올 수 없기 때문에
	 * 멤버 변수의 값을 가져 올 수 있는 메서드
	 * Setter: 멤버변수가 private인 경우,직접 멤버 변수의 값을 가져올 수 없기 때문에 
	 * 멤버 변수의 값을 설정 할 수 있는 메서드
	 */
	//멤버 변수(x)의 값을 가져오는 기능 3)~6)
	public int getX1() {
		return x1;
	}
	//멤버 변수(y)의 값을 셋팅하는 기능
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	//생성자 1)기본생성자
	//생성자가 하나도 없으면 기본 생성자를 생략해도 기본 생성자를 통해 객체를 생성할 수 있다.
	//(기본생성자 자동생성)
	//생성자가 오버로딩 돼있고 기본생성자가 없으면,이 때는 자동으로 기본생성자 만들지 않아,
	//기본생성자를 이용한 객체를 만들 수 없다.
	public Point1() {
		count++;
	}
	//생성자 2)x,y좌표가 주어졌을 때 객체를 생성하는 생성자
	public Point1(int x,int y) {
		count++;
		x1= x; y1 =y;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Point1.count = count;
	}
	public static void printCount() {
		//System.out.println(x1); 에러 발생/ x1이라는 객체변수는 객체를 생성해야 사용가능
		// ↑클래스 메소드에는 객체(멤버)변수를 사용할 수 없다.
		System.out.println("지금까지 만들어진 좌표의 갯수 :"+count);
	}	
}