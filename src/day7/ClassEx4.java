package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		Student.printinfo();
		Student.getAcademyName();

	}

}
class Student{
//	클래스변수
	private static String AcademyName ="Green CPU";
			
//	객체변수
	String StudentName;
	boolean isEntrance;
	int EnterTime = 9;
	int OutTime = 16;
	String ClassName;
//	클래스메서드
	public static String getAcademyName() {
		return AcademyName;
	}
	public static void printinfo() {
		System.out.println("학원 이름 :"+AcademyName);
	}
	
//	객체메서드
	public void printClassinfo() {
		System.out.println("학생 이름: "+StudentName);
		System.out.println("강의 명: "+ClassName);
	}
	public void printEnter() {
		System.out.println("입실 확인되었습니다.");
		isEntrance=true;
	}
	public void printTime() {
		System.out.println("입실 시간: "+EnterTime);
		System.out.println("퇴실 시간: "+OutTime);
	}
//	생성자
	public Student() {
		StudentName = "김원중";
		ClassName = "JAVA S/W";
		
	}
}