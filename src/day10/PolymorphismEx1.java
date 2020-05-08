package day10;

public class PolymorphismEx1 {

	public static void main(String[] args) {
             		CaptionTv ct = new CaptionTv();
//		자식 객체를 생성하여 부모가 참조하는 경우 -> 자식 클래스의 멤버 변수 : power,ch,text 가 만들어진 후 부모클래스가 
//		poewr, ch만 사용하기 때문에 가능
		Tv t1 = new CaptionTv();
//		부모 객체를 생성하여 자식이 참조하는 경우 -> 부모 클래스 멤버 변수 : power,ch 가 만들어 진 상태에서 자식클래스가
//		text를 사용 할 수 없기 때문에 에러
//		CaptionTv ct1= new Tv();
		SmartTv st= new SmartTv();
		ct = new CaptionTv();
		Tv.display(st);
		Tv.display(ct);

	}

}
class Tv{
	boolean power = false;
	int ch;
	void power() { power = !power; }
	void chUp() { ch++;}
	void chDown() { ch--;}
	public static void display(Tv t) {
		if(t instanceof CaptionTv) {
			System.out.println("캡션Tv");
		}
		else if(t instanceof SmartTv) {
			System.out.println("스마트Tv");
		}
	}
}
class CaptionTv extends Tv{
	String text;
	void caption() {System.out.println("캡션 :"+ text);}
	
}
class SmartTv extends Tv{
	String ip;
}