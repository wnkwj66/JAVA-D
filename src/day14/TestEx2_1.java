package day14;

import java.util.Scanner;

public class TestEx2_1 {
	

	public static void main(String[] args) {
//		문2)주민등록번호를 입력하여 남자인지 여자인지 판별하세요.
		String registerNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 : ");
		registerNum = scan.nextLine();
		registerNum = registerNum.replaceAll("-", ""); // '-' 제거
		registerNum = registerNum.replaceAll(" ", ""); // 공백 제거
		if(registerNum.length() != 13) {
			System.out.println("주민번호 길이가 잘못되었습니다.");
			scan.close();
			return;  //보이드 타입이라 리턴안해도 되는데 강제종료하고싶으면 리턴 넣어야함
		}
		if(!isValid(registerNum.substring(0,6))) {
			System.out.println("유효 하지 않은 생년월일입니다.");
			scan.close();
		}
		char gender = registerNum.charAt(6);
//		if(gender == 1 || gender == 3	) {
//			System.out.println("남자");
//		}else if(gender ==2 || gender ==4){
//			System.out.println("여자");
//		}else {
//			System.out.println("해당 주민번호는 외국인입니다.");
//		}
		switch(gender) {
		case '1': case '3': case '9' :
			System.out.println("남자");
			break;
		case '2': case '4': case '0':
			System.out.println("여자");
			break;
		case '5': case '7':
			System.out.println("외국 남자");
			break;
		case '6': case '8' :
			System.out.println("외국 여자");
			break;
		}
	}
	public static boolean isValid(String birth) {
		if(birth ==null || birth.length() != 6) return false;
		//0번지에서 2번지 앞까지 부분문자열 생성 => 0~1번지까지 부분문자열
		String sYear = birth.substring(0,2);
		//2번지에서 4번지 앞까지 부분문자열 생성 => 2~3번지까지 부분문자열
		String sMonth = birth.substring(2,4);
		//4번지에서 6번지 앞까지 부분문자열 생성 => 4~5번지까지 부분문자열
		String sDay= birth.substring(4,6);
		
		int year, day,month;
		try {
			year = Integer.parseInt(sYear);
			day = Integer.parseInt(sDay);
			month = Integer.parseInt(sMonth);
		}catch(Exception e) {
			return false;
		}
		int lastDay =31;
//		if(month < 1 || month >12) return false;
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDay = 31; break;
		case 4: case 6: case 11:
			lastDay = 30; break;
		case 2 :
			lastDay = 28; break;
		default:
			return false;
		}
		if(day<1 || day >lastDay)return false;
		return false;
	}
}
