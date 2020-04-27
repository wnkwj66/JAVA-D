package day7;

public class ClassEx3 {

	public static void main(String[] args) {
//		클래스 매서드 호출은 '클래스명.클래스메서드명' / '객체.클래스메서드명' 둘 다 가능
		SamsungCar.printInfo();
		SamsungCar c1= new SamsungCar();
		//c1.printInfo();//<ㅡ 가능은 하나 권장하진 않음
		c1.printCarInfo();
		SamsungCar.printInfo();
		SamsungCar c2 = new SamsungCar("마스터",6);
		c2.printCarInfo();
		SamsungCar.printInfo();
		for(int i=0; i<10; i++) {
			c2.accel();
			c2.printSpeed();
		}
		for(int i = 0; i<20; i++) {
			c2.stopbreak();
			c2.printSpeed();
		}
	}

}
// sm3,xm3,sm5
class SamsungCar {
	//클래스 변수 : 객체 상관 없이 
	private static String manufacturer = "Samsung";
	private static int salesnumber = 0;
 		
	//객체 변수 : 자동차가 만들어 지고 결정
	int wheel;
	boolean power;
	int speed;
	String carName; 
	String carNum;
	
	//클래스 메소드
	public static String getManufacturer() {
		return manufacturer;
	}
	public static int getSalesnumber() {
		return salesnumber;
	}
	public static void printInfo() {
		System.out.println("제조사: "+manufacturer);
		System.out.println("판매량: "+salesnumber+"대");
	}
	//객체 메소드
	public void turnOn() {
		System.out.println("시동이 켜졌습니다.");
		power = true;
	}
	public void turnOff() {
		if(speed ==0) {
			System.out.println("시동을 끕니다.");
			power = false;
		}else {
			System.out.println("P에 위치 후 시동을 꺼주십시오.");
		}
	}
	public void accel() {
		speed++;
	}
	public void stopbreak() {
		if(speed>0)
			speed--;
	}
	public void printSpeed() {
		System.out.println("현재 주행 속도는"+speed+"km/h입니다.");
	}
	public void printCarInfo() {
		System.out.println("차종 : "+carName);
		System.out.println("바퀴 수 : "+wheel);
		printSpeed();
	}
	//생성자
	public SamsungCar() {
		wheel = 4;
		carName = "";
		salesnumber++;
		//나머지(speed,power)	는 다 기본값과 일치하기때문에 휠만 초기화 시켜주면 됨. 
	}
	public SamsungCar(String carName,int wheel) {
		//멤버 변수의 이름과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다.
		//이러한 경우 멤버변수를 의미하기 위해 , 변수 명 앞에 this와 .을 써서
		//this.멤버변수명으로 사옹한다. this는 자기자신을 의미하는 객체.
		this.carName = carName; 
		this.wheel = wheel;
		salesnumber++;
	}
	
}
