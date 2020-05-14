package day16;

import java.util.*;

public class ID_PW_Test1 {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("메뉴 ");
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.종료");
			System.out.println("메뉴를 선택하세요 : (1~3)");
			
			Scanner scan = new Scanner(System.in);
			
			
			int num = scan.nextInt();
			
			if(num == 1) {
				System.out.print("ID :");
				String Id = scan.next();
				System.out.print("PW :");
				String Pw = scan.next();
//				String a = add(Id,Pw);
//				a = Id;
			}else if(num == 2) {
				System.out.println("ID를 검색합니다 : ");
				String Id = scan.next();
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
//	1.등록해서 저장하는 매서드
//	2.검색해서 중복되는지 찾는 매서드
//	
//	1.
//	기능 : 스캐너를 통해 입력받은 정보(id와 pw)를  배열을 이용하여 저장
//	매개변수 : 아이디 비밀번호 => String Id,String Pw
//	리턴타입 : 문자열 string
//	
	public static String add(Scanner scan,String Id,String Pw) throws Exception {
//		예외:id가 null일때 
		if(Id == null) throw new Exception("예외 : 아이디가 입력되지 않았습니다");
		String str = new String(Id); return str;
		String str1 = new String(Pw); return str1;
		
		
	
		
	}
//	2.
//	기능 : 검색해서 있는지 없는지 확인
//	매개변수 : 검색에서 입력받은 정보, 저장된 정보 => String Id, String str
//	리턴타입 : 문자열 string
	public static void search(String Id,String str) {
		if(str==Id) {
			System.out.print(Id+"의 패스워드는 1234입니다.");
		}else if (str != Id) {
			System.out.print(Id+"는 등록되지 않은 ID입니다.");
		}
		
	}
}
