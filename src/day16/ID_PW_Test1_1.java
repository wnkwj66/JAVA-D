package day16;

import java.util.*;

public class ID_PW_Test1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Map 인터페이스를 이용하여 객체를 만들 수는 없지만(new를 통해) // (Map<String,String> map = new Map<String, String>()) 불가능
//		Map 인터페이스를 구현한 HashMap을 이용하여 객체를 만들어서
//		Map 인터페이스를 객체에 저장할 수 있다. //HashMap 쓰는 이유 HashMap 은 클래스이기 때문에 
		Map<String,String> map = new HashMap<String, String>();// 아래 case1:에 inputInfo에 사용하기위해 객체 추가
		int menu = 3;
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: 
				inputInfo(scan,map); //아이디와 비밀번호를 받아서 맵에 추가하는 메서드
				break;
			case 2: 
				searchInfo(scan,map); //스캐너를 이용해서 정보를 받으면 맵에 잇는지 없는지 확인
				break;
			case 3: 
				modifyInfo(scan, map);
				break;
			case 4: System.out.println("종료합니다"); break;
			default : System.out.println("잘못된 메뉴입니다");
			}
		}while(menu != 4);
		
	}
	//출력문 만드는 메서드
	public static void printMenu() {
		System.out.println("========메뉴=======");
		System.out.println("1.등록");
		System.out.println("2.검색");
		System.out.println("3.수정");
		System.out.println("4.종료");
		System.out.println("=================");
		System.out.print("메뉴를 선택하세요 (1~4): ");
	}
//	기능 : 스캐너를 이용하여 아이디와 패스워드를 입력받아 맵에 저장하는 매서드
//	매개변수 : 스캐너 ,map => Scnaner scan , Map<String, String> map 
//	리턴타입 : 없다 => void 매개변수가 참조변수(map)일경우 주소값이 변하기 때문에 반환값이 필요없다.
//	메서드명 : inputInfo
	public static void inputInfo (Scanner scan,Map<String,String> map) {
		System.out.print("ID: ");
		String id = scan.next();
		System.out.print("PW: ");
		String pw = scan.next();
		map.put(id, pw); // 맵에 입력받은 아이디와 패스워드 정보 저장.
	}
//	기능 : 스캐너를 이용하여 아이디를 입력받아 map에 해당 ID 와 일치하는 정보가 있는지 있으면 ID,PW출력 없으면 없으면 없다고 출력
//	매개변수 : Scanner,map => Scanner scan , Map<String,String> map
//	리턴타입 : void =>출력하고 끝나기 때문
//	메서드명 : searchInfo
	public static void searchInfo (Scanner scan,Map<String,String> map) {
		System.out.println("ID : ");
		String id = scan.next();
		String pw = map.get(id); // id랑 일치하는 정보가 있으면 pw를 가져오고 없으면 null
		if(pw == null) {
			System.out.println(id+"없는 아이디입니다.");
		}else {
			System.out.println(id+"의 비밀번호는"+pw+"입니다.");
		}
	}
//	기능: 스캐너를 이용하여 id를 입력받고, map에서 id와 일치하는 정보가 있으면 비밀번호를 입력받아 수정하는 메소드
//	매개변수: 스캐너, 맵 => Scanner scan,Map<String,String>map
//	메서드명 :modifyInfo
	public static void modifyInfo (Scanner scan,Map<String,String> map) {
		System.out.println("ID : ");
		String id = scan.next();
		String pw = map.get(id);
		if(pw == null) {
			System.out.println(id+"없는 아이디입니다.");
			return;
		}
		System.out.print("PW(now) : ");
		String ipw = scan.next(); 
		System.out.print("PW(new) : ");
		String inewpw = scan.next();
		if(!pw.equals(ipw)) { // ipw랑 같지 않으면
			System.out.println("비밀번호 수정에 실패했습니다.");
		}else {
			map.replace(id, inewpw); //지정된 id값을 지정된 inewpw로 대체;
			System.out.println("비밀번호를 수정 했습니다.");
		}
	}
}
