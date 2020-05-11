package day13;

public class ObjectEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A(); //클래스 A에 a1이라는 변수명을 가진 객체 생성 
		A a2 = a1; // 클래스 A에 a2 객체에 a1값을 대입(복사)
		System.out.println(a1.num +","+a2.num);
		a1.num =20;
		System.out.println(a1.num +","+a2.num);
		a2.num =30;
		System.out.println(a1.num +","+a2.num);
		try {
			A a3 = (A)a1.clone(); //(A) a1.이 object클래스(상위)이기 때문에 (A)명시적으로 자식이름 넣어줘야함.
			a3.num = 40;
			System.out.println(a1.num + ","+ a3.num);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=================");
		B b1 = new B();
		b1.a = new A();
		b1.a.num = 10;
		B b2 = b1.clone();
		System.out.println(b1.a.num+","+b2.a.num);
		b2.a.num =30;
		System.out.println(b1.a.num+","+b2.a.num);
		
		System.out.println("-------toString 예제-------");
		C c = new C();
		System.out.println(c);
	}

}
class A implements Cloneable{
	int num;
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public A() {}
	public A(int num) {
		this.num = num;
	}
}
class B implements Cloneable{
	A a;
	@Override
	public B clone() {
		B obj =null;
		try {
			obj = (B)super.clone();
		}catch(Exception e) {
			System.out.println("예외");
		}
		if(obj instanceof B) {
			obj.a = new A (((B)obj).a.num);
		}
		return (B)obj;
	}
}
class C{
	int num1, num2, num3,num4,num5;

	@Override
	public String toString() {
		return "C [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}
	
}
