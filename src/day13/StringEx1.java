package day13;

public class StringEx1 {
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		char []arr =new char[] {'a','b','c'};
		String str5 =new String(arr);
		System.out.println(str5.charAt(1));
		String str6 = "abcdabcd";
		String str7 = str6.replace("abc", "def");
		System.out.println(str6);
		System.out.println(str7);
		String str8 = str6.replaceAll("abc", "def");
		System.out.println(str6);
		System.out.println(str8);
		String str9 = "200101-3011111";
		String reg[] = str9.split("-");
		for(String tmp : reg) {
			System.out.println(tmp);
		}
		String str10 = "사과, 배, 오렌지";
		//reg에는 0번지에는 "사과", 1번지에는 "배", 2번지에는 "오렌지"가 저장
		reg = str10.split(",");
		for(String tmp : reg) {
			System.out.println(tmp);
		}
		System.out.println(str10.substring(1));
		//reg 배열에 저장된 각 문자열을 구분자 -를 기준으로 하나의 문자열로 만들어준다.
		String str11 = String.join("-", reg);
		System.out.println(str11);
	}

}
