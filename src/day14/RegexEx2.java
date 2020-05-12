package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx2 {

	public static void main(String[] args) {
//		아이디를 입력받고 아이디가 유효한 아이디인지 검사하는 코드를 작성하세요. 단, 정규표현식 이용
//		아이디 (알파벳 + 숫자,첫글자 알파뱃,5글자이상 10글자 이하)
//		예) 아이디를 입력하세요 : 1abce
//		1abce는 유효하지 않은 아이디입니다.
//		예) 아이디를 입력하세요 : abcde1
//		abcde1은 사용가능 합니다.
		
		Scanner scan = new Scanner(System.in);
		String id = new String();
		while(true) {
			System.out.print("id를 입력하세요 : ");
			id = scan.next();
			Pattern p = Pattern.compile("[a-z,A-Z]\\w{4,9}"	);
			Matcher m = p.matcher(id);
			if(!m.matches()) {
				System.out.println(id+"는 유효하지 않은 ID입니다.");
			}else {
				System.out.println(id+"는 사용 가능합니다.");
				scan.close();
				return;
			}
		}
	}

}
