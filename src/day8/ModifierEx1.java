package day8;

public class ModifierEx1 {

	public static void main(String[] args) {
//		String s; //대표적인 final 클래스
		final int MAX = 10;
//		MAX = 20; final 변수는 상수이다. 이름 붙은 상수
		System.out.println(Math.PI);
		D d = new D();
		Object o1= new Object();
		d.print1(o1);
//		A a = new A();
//		d.print(a);
		d.print1(new A());
	}

}
//final 클래스는 부모가 될 수 없다 (final :마지막의 ,변경될 수 없는)
final class A{
	public int a;
}
class B{
	//final 메서드는 오버라이딩 할 수 없다.
	public final void print() {
		System.out.println("클래스 B입니다.");
	}
}
class C extends B{
	public final int num;
	public C() {
		num = 0;
	}
	public C(int num) {
		//final 멤버 변수는 선언과 동시에 초기화 하지 않아도 초기화를 생성자에서 할 수 있다.
		this.num = num;
	}
//	public void print() {}
//Cannot override the final method from B
	
}
//class B extends A{ //he type B cannot subclass the final class A
//class B extends String{The type B cannot subclass the final class String
class D{
	//매개변수로 클래스 Object의 객체 obj가 오면 실제 넣어주는 정보는
	//Object 클래스의 객체도 가능하지만 Object 클래스를 상속받은 자식 클래스들도 가능
	public void print1(Object obj) {
		//obj객체가 클래스 A로 형 변환 가능한지를 확인하는 연산 : instanceof
		if(obj instanceof A)
			System.out.println("A클래스로 형 변환 가능합니다.");
		else
			System.out.println("Object입니다.");
		
	}
	public void print2(B obj) {
		System.out.println("B입니다.");
	}
}
	
	
