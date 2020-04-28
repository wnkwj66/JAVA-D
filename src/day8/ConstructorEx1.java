package day8;

public class ConstructorEx1 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(1,2);
		p2.print();
	}
}
class Point{
	int x=1;
	int y=1;
//	초기화 블럭
	{           x=10;
	            y=10;}
	void print() {
		System.out.printf("(%d,%d)",x,y);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
//		this(0,0);
		this(100,100);
	}
	//복사 생성자 : 나와 같은 객체를 복사 
	public Point(Point p) {
		this(p.x, p.y);
		//다른 생성자 this()를 이용할 때는 메서드의 첫번째 줄에 넣어야한다.
		this.x = p.x;
		this.y = p.y;
	}
}