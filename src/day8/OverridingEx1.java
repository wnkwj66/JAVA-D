package day8;

public class OverridingEx1 {

	public static void main(String[] args) {
		Duck d = new Duck();
		d.cry();
		Sparrow s = new Sparrow();
		s.cry();
		s.cry(0);//(0)은 매개변수 '정수형'
		Sparrow s2 = new Sparrow(1);
		System.out.println(s.getWing());
		System.out.println(s2.getWing());
	}
}

class Bird{
	protected int wing; 
	public void cry() {
		System.out.println("새가 웁니다.");
	}
	public Bird() {wing=2;}
	public Bird(int wing) {this.wing = wing;}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
}
class Duck extends Bird{
	@Override
	public void cry() {
		System.out.println("오리 : 꽥꽥");
	}
//	public Duck() {super();} //생성자가 하나도 없으면 기본 생성자가 자동으로 생성 된다.
}
class Sparrow extends Bird{
//	메소드 오버로딩
	public void cry(int num) {
		super.cry(); // 부모 클래스에 있는 cry를 불러옴
		cry(); //위에 super.cry()와 같음 super는 메서드 오버라이딩 할 때 주로 사용.
			   // super없이 cry();만 사용하면 내 클래스의 메서드로 호출되어, 재귀호출이 된다. =>에러발생
		       // 부모클래스의 메서드를 의미하기 위해 앞에 super붙임.
		System.out.println("참새 : 짹짹");
	}

	public Sparrow() {
		super();  //부모클래스의 기본 생성자.
	}

	public Sparrow(int wing) {
		super(wing);
	}
	
}