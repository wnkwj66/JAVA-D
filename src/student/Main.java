package student;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Student s = new Student();
//		s.setScore(new Subject("국어",40,40,10,10),
//				new Subject("영어",30,10,10,10)
//				new Subject("수학",20,20,10,10));
//		s.printScore();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
//		Main m = new Main();
		Student tmpStudent; //이건 참조변수 Student
		int size = 30; // 저장하고 싶은 학생 수  30명
		Student std[] = new Student[size]; //  Student 클래스에 size 만큼 배열 만듦.
		int cnt = 0; // 현재 저장 된 학생 수  0명 
//		Subject subjectList[]; //입력 받은 배열을 저장
//		String title;
//		int midterm, finals, performance, attendance;
		
		String name;
		
		while(menu != 5){
			printMenu(); //m.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("학생정보 추가기능을 구현해야합니다.");
				tmpStudent = searchInfo(scan); //?  이게 뭐지 불러오는건가 생성하는건가
				System.out.println("이름: ");
				name = scan.next();
				tmpStudent.setName(name);
				//여기서 겹치는지 검사 . 만약 겹치면 작업 중지 ( 아래 작업 안함)
				if(isDuplicated(std, cnt, tmpStudent)!=-1) {
					System.out.println("중복된 정보입니다.");
					break;
				}
				std[cnt] = tmpStudent; // 후위 연산자를 이용하여 []안에 cnt++로 저장해도 됨.
				//과목정보에 대한 작업 해야함
				System.out.println("과목 정보를 입력하시겠습니까?(y/n)");
				char subjectMenu = scan.next().charAt(0);
				switch(subjectMenu) {
				case'y': case'Y':
					inputSubject(scan, std[cnt]);
//					break;
//					}
//					//궁극적으로 학생정보에 추가해야 하기 때문에 아래 작업
//					std[cnt].setScore(subjectList);
					break;
				}
				cnt++;
				tmpStudent = null;
				break;
				
			case 2:
				modifyStudent(std, cnt, scan);
				break;
				
			case 3:
				System.out.println("학생정보 삭제기능을 구현해야합니다.");
				System.out.println("삭제할 학생 정보를 입력하세요.(검색)");
				tmpStudent = searchInfo(scan);
				if(deleteStudent(std, tmpStudent, cnt))
//		  		리턴타입이 int인 경우 : cnt = deleteStudent(std, deleteStudent, cnt)
					cnt--;
				break;
			case 4:
				printStudent(std,cnt);
//				for(int i = 0; i<cnt ; i++) {
//					Student tmp = std[i];
//					System.out.printf("%d %d %d %s\n",tmp.getGrade(),
//							tmp.getClassNum(),tmp.getNum(),
//							tmp.getName());
//					*********이부분 강사님이랑 비교  tmp =std[i] 없애고 tmp -> std[i]로 비교해도 된다.
//				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
				}
			}				
		}
//	아래 코드에 static을 빼면 객체 메서드가 되기 때문에 에러가 발생한다.
//	해결하려면 main클래스에 객체를 생성해주면 된다.
	public static void printMenu() {
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정기능");
		System.out.println("3.학생정보 삭제기능");
		System.out.println("4.모든 학생정보 출력");
		System.out.println("5.종료");
		System.out.printf("메뉴를 선택하세요.:");
		
	}
	public static Student searchInfo(Scanner scan){ // 매개변수로 스캐너 넣으면 메인에서 스캔 메서드 사용시 이리로 옴.
		System.out.print("학년: ");
		int grade = scan.nextInt();
		System.out.print("학반: ");
		int classNum = scan.nextInt();
		System.out.print("번호: ");
		int num = scan.nextInt();
		Student s = new Student(); // 기본 생성자 (비어 있는 학생정보 1)
		s.setGrade(grade);
		s.setClassNum(classNum);
		s.setNum(num);
		return s; 
	}
//	A
//	void : 출력만 하고 끝나기 때문에 리턴타입이 필요가 없다.(콘솔에 출력하고 알려 줄 정보가 없어서_
//	int : 출력학생 수를 확인
//	boolean : 학생정보를 출력하면 true, 실패하면 false
//	B
//	Student : 한명의 학생정보
//	Student [] : 여러명의 학생 정보
//	cnt : 현재 출력할 학생 수
	public static void printStudent (Student[] std,int cnt){     //학생 정보 출력 메서드
		for(int i = 0; i<cnt ; i++) {
			System.out.println("-------------------");
			System.out.println("학년: " + std[i].getGrade());
			System.out.println("학반: " + std[i].getClassNum());
			System.out.println("번호: " + std[i].getNum());
			System.out.println("이름: " + std[i].getName());
			System.out.println("---------------------");
			std[i].printScore();
		}
	}
//	기능: 콘솔에서 정보를 입력받고 입력받은 정보를 통해 과목들을 저장 -> 저장한 과목을 학생정보에 추가하는 기능.
//	리턴타입 A: ( x )student 저장한 과목을  학생정보에 추가해야하기 때문에 ?
//	void :
//	int : 추가된 과목 수를 알고싶은 경우
//	매개변수 B:  (x) subjectList : 입력받은 과목정보를 토대로 작성해야 하기때문에.
//	Scanner : 콘솔에서 입력받기 위해.
//	Student : 학생정보 (학년,반 ,번호,이름)에 추가해야하기 때문에

	public static void inputSubject(Scanner scan, Student s){
		System.out.print("입력할 과목 수 :");
		int subjectCnt = scan.nextInt();
		Subject [] subjectList = new Subject[subjectCnt];
		// 여러 과목 정보를 입력.
		for(int i =0 ; i < subjectCnt ; i++) {
			System.out.print("과목명 :" );
			String title = scan.next();
			System.out.print("중간고사 :");
			int midterm = scan.nextInt();
			System.out.print("기말고사 :");
			int finals = scan.nextInt();
			System.out.print("수행평가 :");
			int performance = scan.nextInt();
			System.out.print("출석점수 :");
			int attendance = scan.nextInt();
			subjectList[i]
					= new Subject(title, midterm, finals, performance, attendance);		
		}
		if(s == null)
			return; //void 일경우에도 return사용 가능하지만 값이 없어야함.
		//궁극적으로 학생정보에 추가해야 하기 때문에 아래 작업
		s.setScore(subjectList);	
	}
//	리턴타입 A : (x) void 삭제하고 끝이기 때문? 
//	int: 삭제 된 뒤의 학생 수를 줄이고 리턴값을 반환.
//	boolean : 삭제 여부 ( 이 경우 학생 수를 메인에서 관리)
//	매개변수 B : Student 입력받는 정보를 삭제해야하기 때문에.
//	int cnt : 현재 학생 수 
//	Student []std : 저장된 학생 정보
//	Student s : 삭제할 학생 정보
	public static boolean deleteStudent(Student std[], Student deleteStudent,int cnt) {
		if(std==null || deleteStudent == null || cnt <= 0) return false; // 삭제 실패
		
		int pos = isDuplicated(std, cnt, deleteStudent);//삭제할 학생정보가 배열에서 어디있는지 찾는역할
		
		//for(int i = 0; i<cnt; i++) {
			//하나씩 검색 해서 tmpStudent와 같은 학생이 있는지 확인
			//있으면 삭제 후 하나씩 밀어준다.
			//if(deleteStudent.equal(std[i])) {
		if(pos != -1) {
				for(int j=pos; j<cnt-1 ;j++) { //cnt-1인 이유 : 앞을 기준으로 하나씩 땡겨와야하기 때문.
					std[j]= std[j+1];
				}
				System.out.println("삭제가 완료되었습니다.");
				System.out.println();
				return true;
			}
		return false; // 삭제 실패
	}	
//	리턴타입 A : boolean 있으면 true 없으면 false
//			int: 중복 여부와 몇번지에 있는지 확인 가능 (int사용 시 삭제부분에서 이 메서드 이용 가능)
//	매개변수 B : Student[] std : 저장된 학생 정보
//	Stuent s : 이번에 입력된 정보.
//	Int cnt 총 학생수를 볼 필요가 없기 때문에
	public static int isDuplicated(Student std[], int cnt, Student s) {
		for(int i = 0; i<cnt; i++) {
			if(std[i].equal(s)) {
				return i;
			}
		}
		return -1;
	}
//	리턴타입 A: void
//	매개변수 B :
//	Student std[] : 학생들 정보
//	int cnt : 저장된 학생 수
//	Scanner scan :학생정보 입력받기 위해서
	public static void modifyStudent(Student std[],int cnt, Scanner scan) {
		System.out.println("학생정보 수정기능을 구현해야합니다.");
		System.out.println("수정할 학생 정보를 입력하세요.(검색)");
		Student tmpStudent = searchInfo(scan);
		int pos = isDuplicated(std, cnt, tmpStudent);
		if(pos == -1) {
			System.out.println("없는 학생 정보입니다.");
			return;
		}
		System.out.println("이름: ");
		String name = scan.next();
		tmpStudent.setName(name);
		System.out.println("----과목수정----");
		System.out.println("1.수정");
		System.out.println("2.추가");
		System.out.println("3.종료");
		System.out.println("과목을 수정하시겠습니까?");
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1:
			Subject sList[] = std[pos].getScore();
			//해당 학생의 과목정볼르 가져옴
			if(sList == null) {
				System.out.println("수정할 과목이 없습니다.");
				break;
			}
			//수정할 과목을 입력
			System.out.println("과목: ");
			String title = scan.next();
			//수정할 과목이 있는지 찾아야 함.있으면 아래 작업을 진행 ,없으면 종료
			int subPos = -1;
			for(int i = 0; i<sList.length; i++) {
				if(sList[i].getTitle().equals(title)) {
					subPos = i;
					break;
				}
			}
			if(subPos == -1) {
				System.out.println("등록되지 않은 과목입니다.");
				break;
			}
			
			//중간,기말,수행,출석 다시 입력 (하나하나 따로 할수있지만 경우의 수가 너무 많아지므로 한번에 네개 다 입력하는거로 함)
			System.out.print("중간고사 : "	);
			int midterm = scan.nextInt();
			System.out.print("기말고사 : " );
			int finals = scan.nextInt();
			System.out.print("수행평가 : " );
			int performance = scan.nextInt();
			System.out.print("출석점수 : " );
			int attandance = scan.nextInt();
			sList[subPos].setMidterm(midterm);
			sList[subPos].setFinals(finals);
			sList[subPos].setPerformance(performance);
			sList[subPos].setAttendance(attandance);
			break;
		case 2:
			Student s = new Student();
			inputSubject(scan, s);
			std[pos].addScore(s.getScore()); //setScore로 하면 이전 정보가 다 지워지고 덮어쓰기하기때문에 add씀 (set은 내가 그렇게 만들어놓음)
			break;
		}
	}
}
/* 1. 데이터 관리를 위한 작업
 *   => 변수나 클래스를 이용
 *   학생 정보=>Student 클래스
 *   과목 정보=>Subject 클래스
 * 2. 기능 구현
 *   => main메소드에 바로 구현
 * 	 => 또는 기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스
 * 3. 테스트
 * */
interface Manage{
	public int insertStuent(Student []arr, Student std);
	public void modifyStuent(Student []arr, Student std);
	public int deleteStuent(Student []arr, Student std);
	public void printStuent(Student []arr,int count);
}

