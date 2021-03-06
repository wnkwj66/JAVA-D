package day9;

public class Square extends Shape {
	private static int squareEA;
	public void print() {
		System.out.println("------사각형의 정보------");
		System.out.printf("시작점 :(%d,%d)%n",getLeft(),getUp());
		System.out.printf("가로 :%.2f%n",getWidth());
		System.out.printf("세로 :%.2f%n",getHeight());
		System.out.println("-------------------");
	}
//	public Square() {}
	public Square(int left, int up, double width, double height ) {
//		부모생성자 호출: 자식 클래스의 생성자에서만 호출 가능.
		super(left,up,width,height);
//		setLeft(left);      
//		setUp(up);
//		setWidth(width);
//		setHeight(height);    // 이렇게 써도 됨.
		squareEA++;
	}
	public static void printEA() {
		System.out.println("현재까지 만들어진 사각형의 갯수: " + squareEA);
	}
}
