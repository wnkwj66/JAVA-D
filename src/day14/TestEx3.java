package day14;

public class TestEx3 {

	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		System.out.println(p1+"과"+p2+"의 거리는"+p1.distance(p2)+"입니다");
		System.out.println(p1+"과"+p2+"는 같은점입니까? :"+p1.equals(p2));
		p2.setX(0);
		p2.setY(0);
		System.out.println(p1+"과"+p2+"는 같은점입니까? :"+p1.equals(p2));
	}
}
class Point{
	private int x,y;

	//두 점이 같은지 비교 , 한 점은 나이기 때문에 다른  점만 알면 되기 때문에 다른 점을 매개변수로 둔다.
	//매개변수를 상위인 오브젝트로 두는 이유는 최상위 클래스이기때문에 모든 클래스의 객체를 비교 가능하다.
	@Override
	public boolean equals(Object obj) { 
		//obj와 this가 같은 객체를 공유하고 있는 경우
		if (this == obj)			return true; 
		//비교할 점 obj가 없는 경우 // NullPointerException이 발생하는걸 막아주는 역할
		if (obj == null)			return false;
		//비교할 obj가 Point클래스가 아닌경우
		if (getClass() != obj.getClass())	return false;
		//obj가 Point클래스의 객체인 경우 
		Point other = (Point) obj; //형변환 가능 
		if (x != other.x)		return false;
		if (y != other.y)		return false;
		return true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	//생성자를 이용하여 변수 초기화
	public Point() {}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
//	두점의 거리를 계산하는 distance()메서드를 구현해야한다 
	public double distance(Point other) { //생성자를 이용하여 변수 초기화
		int distX = x - other.x;
		int distY = y - other.y;
		double res = Math.sqrt(Math.pow(distX,2.0) + Math.pow(distY,2.0));
		return res;	
	
			
	}	
}
