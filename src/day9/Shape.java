package day9;

public class Shape{
	private int left; //시작점의 x좌표
	private int up;   //시작점의 y좌표
	private static int EA;   //도형의 갯수
	public static void printEA() {
		System.out.println("현재까지 만들어진 도형의 갯수: " + EA);
	}
	private double width; //폭(가로)
	private double height; //높이(세로)
	public void print() {
		System.out.println("------도형의 정보------");
		System.out.printf("시작점 :(%d,%d)%n",left,up);
		System.out.printf("가로 :%.2f%n",width);
		System.out.printf("세로 :%.2f%n",height);
		System.out.println("-------------------");
	}
	//생성자 : public 클래스명(){}
	public Shape() {EA++;}
	public Shape(int left, int up, double width, double height ) {
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		EA++;
	}
	public void move (int left,int up) {
		this.left = left;
		this.up = up;
	}
	//크기 조절 할 때 아래로만 한다고 가정(가로 세로값만 변한다고 생각)
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	//getter . setter -> 접근제한자가 private이기 때문.
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}

