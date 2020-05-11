package day13;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
// 	제목을 입력하고 , 단어 입력 후 해당 단어가 제목에 있는지 확인하는 코드 작성.
//		예1) 제목을 입력하세요 : Java의 정석
//			단어를 입력하세요 : java
//			Java의 정석에는 java라는 단어가 없습니다.
//		예2) 제목을 입력하세요 : Java의 정석
//			단어를 입력하세요 : Java
//			Java의 정석에는  Java라는 단어가 있습니다.
		Scanner scan = new Scanner(System.in);
		String str,str1;
		System.out.println("제목을 입력하세요: ");
		str = scan.nextLine();
		System.out.println("단어를 입력하세요 :");
		str1 = scan.nextLine();
		boolean b = str.contains(str1);
		if(b==true) {
			System.out.printf("%s에는 %s가 있습니다\n",str,str1);
		}else if(b == false) {
			System.out.printf("%s에는 %s가 없습니다\n",str,str1);
		}
	}
}
