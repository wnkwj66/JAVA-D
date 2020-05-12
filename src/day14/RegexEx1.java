package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
//		문2)주민등록번호를 입력하여 남자인지 여자인지 판별하세요.
		String registerNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 : ");
		registerNum = scan.nextLine();
		Pattern p = Pattern.compile("(\\d{6}-\\d{7})|(\\d{13})");
		Matcher m = p.matcher(registerNum);
		if(!m.matches()) {  //!p.matcher(registerNum).matches())로 줄여서 사용가능. 위의 문자 생략
			System.out.println("올바른 주민번호 형태가 아닙니다.");
			scan.close();
			return;
		}
		char gender;
		if(registerNum.contains("-"))
			gender = registerNum.charAt(7);
		else
			gender = registerNum.charAt(6);
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
}