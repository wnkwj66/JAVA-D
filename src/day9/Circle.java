package day9;

public class Circle extends Shape {
	private double centerX, centerY;
	public static int circleEA;
	public static void printEA() {
		System.out.println("현재까지 만들어진 원의 갯수: " + circleEA);
	}
	public void print() {
		System.out.println("------원의 정보------");
		System.out.printf("중심점 :(%.1f,%.1f)%n",centerX,centerY);
		System.out.printf("반지름 :%.2f%n",getWidth()/2);
		System.out.println("------------------");		
	}
	public Circle() {circleEA++;}
	public Circle(int left,int up, double radius) {
		super(left,up,radius*2,radius*2);
	 	centerX =left + radius;
		centerY = up - radius;
		circleEA++;
//		setLeft(left);
//		setUp(up);
//		setWidth(radius*2);
//		setHeight(radius*2);
	}
	public void move(int left, int up) { 
		super.move(left, up);
		centerX = left + getRadius();
		centerY = up - getRadius(); //getWidth()/2 도 가능 원은 가로세로가 같기때문
	}
	//매개변수의 left, up 이기 때문에 사용 가능 ( 부모 클래스에서 left,up 아님)
	public void resize(double radius) {
		//부모클래스랑 다르기 때문에 오버로딩
		resize(2*radius,2*radius);
		centerX = getLeft() + radius;
		centerY = getUp() - radius;
	}
	public double getRadius() {
		return getWidth()/2;
	}

}
