//package day19;
//
//import java.util.*;
//
//public class TestE3 {
////	아래 Student 클래스를 이용하여 학생 관리 프로그램을 만들려고 한다.
////	기능은 학생 정보 추가, 학생정보 수정, 학생 정보 삭제가 있다
////	이때 필요한 메소드를 선언부만 정의하시오(구현x)
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
////		Student s = new Student("홍길동","2020100110","컴공","1");
//		List<Student> list = new ArrayList<Student>();
//		Student s;
//		
////		insertStudent(list, s);//list에 학생추가
////		insertStudent(list, s);//중복되기 때문에 추가 안됨
////		insertStudent(list, new Student("임꺽정","2020100111","컴공","1"));//학번 달라서 가능 
////		modifyStudent(list, new Student("임꺽정","2020100111","전기","2"));
////		deleteStudent(list, new Student("유관순","2020100111","전기","2"));
//		
//		}
//		public static void printStudent(List<Student>list) {
//			if(list == null || list.size() ==0)
//				System.out.println("-------학생정보가 없습니다-----");
//			System.out.println("---------------이름-------학번----------전공-------학년----");
//			for(Student tmp:list) {
//				System.out.println(tmp);
//		}
//		int menu = 0;
//		while(menu != 4) {
//			printMenu();
//			menu = scan.nextInt();
//			switch(menu) {
//			case 1:
//				System.out.println("학생정보 추가기능");
//				insertStudent(list, s);  
//				break;
//			case 2:
//				System.out.println("학생정보 수정기능");
//	
//				
//				modifyStudent(list, s);
//				break;
//			case 3:
//				System.out.println("학생정보 삭제기능");
//				deleteStudent(list, s);
//				break;
//			case 4:
//				System.out.println("종료합니다.");
//				break;
//			}
//		}
//			
//		
//		scan.close();
//
//				
//
//	}
//	
////	기능 :스캐너를 이용하여 학생정보를 입력하면 학생 객체를반환하는 메서드
////	매개변수 : 스캐너 => Scanner scan
////	리턴타입 : 학생 객체 => Student
////	매서드명 : inputStudent
//	
//	public static Student inputStudent (Scanner scan) {
//		
//		Student s = new Student();//학생정보 객체 만들어서
//		
//		System.out.print("학번 : ");  //입력 하나씩 다 받고
//		String num = scan.next();
//		System.out.print("학년 : ");
//		String grade = scan.next();
//		System.out.print("이름 : ");
//		String name = scan.next();
//		System.out.print("전공 : ");
//		String major = scan.next();
//		
//		s.num = num;  //s.으로 학생정보 객체 s에 넣어줌
//		s.name = name;
//		s.grade = grade;
//		s.major = major;
//		
//		return s;
//	}
////	1.학생정보 추가기능
//	
////	기능: 주어진 학생 정보를 학생정보 리스트에 저장하는 메서드 . 중복되는지 확인하고 중복되면 x 중복되지 않으면 저장
////	매개변수: 학생 정보 , 학생 정보 리스트 =>List<Student> list, Student s
////	리턴타입 : 저장 여부 => boolean
////	메서드명 : insertStudent
//	public static boolean insertStudent (List<Student> list, Student s) {
//		if(list == null || s == null) return false; //학생정보 리스트가 없거나 학생정보 없을때
//		if(!list.contains(s)) { 
//			list.add(s);
//			return true;//학생정보가 리스트 안에 중복 되지 않으면 추가
//		}else {
//			return false;//아니면 false
//		}
//	}
////	2. 학생정보 수정기능
//	
////	기능: 주어진 학생 정보를 학생정보 리스트에서 수정하는 메소드.중복되는지 확인하고 중복되면 수정/중복되지않으면 수정 x
////	매개변수 : 주어진 학생정보, 학생정보 리스트=>List<Student> list, Student s
////	리턴타입 : 수정 여부 => boolean
////	메서드명 : modifyStudent
//	public static boolean modifyStudent (List<Student> list, Student s) {
//		if(list == null || s == null) return false;
//		if(list.contains(s)) { //있다면 수정
//			list.remove(s);
//			list.add(s);
//			return true;
//		}return true;
//	}
////	3.학생정보 삭제기능
//	
////	기능: 주어진 학생 정보를 학생정보리스트에서 삭제하는 메서드.중복되는지 확인 후 중복되면 삭제,중복되지 않으면 삭제x
////	매개변수: 주어진 학생정보, 학생정보 리스트 =>List<Student> list,Student s
////	리턴타입: 삭제여부 => boolean
////	메서드명: deleteStudent
//	public static boolean deleteStudent (List<Student> list, Student s) {
//		if(list == null || s == null) return false;
//		if(list.contains(s)) return false; //있다면 수정
//			list.remove(s);	return true;
//	}
//	public static void printMenu() {
//		System.out.println("1.학생정보 추가");
//		System.out.println("2.학생정보 수정기능");
//		System.out.println("3.학생정보 삭제기능");
//		System.out.println("4.종료");
//		System.out.printf("메뉴를 선택하세요.:");
//	}
//}
//class Student{
//	String name;//이름
//	String num; //학번 ->고유번호 중복x
//	String major;//전공
//	String grade;//학년
//	
//	public Student() {}
//	//학생정보 출력 하려고 toString 메서드 
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", num=" + num + ", major=" + major + ", grade=" + grade + "]";
//	}
//	//학생정보 중복을 확인하는 기능 // equals 사용하려면 스튜던트 클래스에서 사용해야한다.
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((num == null) ? 0 : num.hashCode());
//		return result;
//	}
//	
//	//using field
//	public Student(String name, String num, String major, String grade) {
//		super();
//		this.name = name;
//		this.num = num;
//		this.major = major;
//		this.grade = grade;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (num == null) {
//			if (other.num != null)
//				return false;
//		} else if (!num.equals(other.num))
//			return false;
//		return true;
//	}
//}