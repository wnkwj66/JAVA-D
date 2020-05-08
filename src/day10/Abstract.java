package day10;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class A{
	int a; //멤버변수 받을 수 있다.
	public void print() {System.out.println(a);} //일반적인 메서드 받을 수 있다.
	public abstract void test();
}
//추상 클래스로부터 상속받는 자손클래스는 오버라이딩을 통해 조상인 추상클래스의 추상메서드를 모두 구현해주어야 한다.
class B extends A{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	} 
	
}