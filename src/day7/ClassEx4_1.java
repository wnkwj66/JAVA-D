package day7;

public class ClassEx4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Student1 s1=new Student1();
		s1.printinfo();
		Student1 s2 = new Student1("디지털 컨버전스...자바","이순신");
		s2.printinfo();
		s2.in();
		s2.out();
		s2.printinfo();

	}

}
class Student1{
//	*멤버 변수
//	학생 이름
	private String name;
//	입실여부
	private boolean isEntrance;
//	수강 과정
	private String ClassName;
//	입실시간, 퇴실시간
	private String enterTime,outTime;
//	
//	*멤버 메서드
//	입/퇴실 기능
	public void in() {
		System.out.println(name+"님이 입실 했습니다.");
		isEntrance = true;
		enterTime = "9시";
	}
	public void out() {
		System.out.println(name+"님이 퇴실 했습니다.");
		isEntrance = false;
		outTime = "18시";
	}
//	학생정보 출력 기능
	public void printinfo() {
		System.out.println("과정 : " + ClassName);
		System.out.println("이름 : " + name);
		if(isEntrance) {
			System.out.println("입실 중입니다.");
			System.out.println("입실 시간: "+enterTime);
		}else {
			System.out.println("퇴실 했습니다.");
			System.out.println("입실 시간 :" +enterTime);
			System.out.println("퇴실 시간 : "+outTime);
		}
	}
//	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEntrance() {
		return isEntrance;
	}
	public void setEntrance(boolean isEntrance) {
		this.isEntrance = isEntrance;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public String getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
//	*생성자
	public Student1() {
		ClassName = "JAVA";
		name ="김원중";
		
	}
	public Student1(String ClassName, String name) {
		this.ClassName=ClassName;
		this.name=name;
	}
}

