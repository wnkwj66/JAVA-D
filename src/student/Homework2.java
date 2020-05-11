package student;

import java.util.Scanner;

public class Homework2 {
	//상품을 등록하고 ,등록된 상품을 출력하는 코드를 작성하세요.
	//예)
	//상품을 등록하시겠습니까 ?(y/n) :y
	//상품명 : 가방
	//가격 : 10000
	//
	//상품을 등록하시겠습니까 ? (y/n) :y
	//상품명: 마우스
	//가격 :1000
	//
	//상품을 등록하시겠습니까? (y/n) :n
	//지금까지 등록된 상품 리스트
	//1. 상품명: 가방 , 가격 : 10000원
	//2. 상품명: 마우스. 가격 :1000원
	//
	//배열을 이용하여 해결 하면 클래스를 이용하여 해결 해보자!

	public static void main(String[] args) {
		int size = 50;
		String [] productName = new String[size];
		int [] productPrice = new int[size];
		char menu = 'y';
		Scanner scan = new Scanner(System.in);
		int cnt = 0;     // 현재 저장된 제품의 갯수
		//1.반복문
		while(menu != 'n') {  //조건문이 참인동안 반복(거짓이 될때까지 반복) // 메뉴가 n이 아닐동안 반복
			//2.입력을 받음(y/n)
			System.out.print("상품을 등록하시겠습니까?(y/n) :");
			menu = scan.next().charAt(0);
			//3. 입력 받은 값을 통해 제품 리스트를 출력할지 제품을 등록할지를 결정
			if(menu =='y') {
				//제품을 등록
				System.out.print("상품명 :");
				productName[cnt] = scan.next();
				System.out.print("가격 :");
				productPrice[cnt] = scan.nextInt();
				cnt++;  
			}
		}
		//등록된 제품 리스트 출력
		for(int i=0; i<cnt; i++) {//조건문이 참인동안 반복 : cnt가 2개이면 i= 0,1 두번 반복
			System.out.printf("%d.상품명 : %s, 가격 : %d원\n",i+1,productName[i],productPrice[i]); //해당하는 번지를 가져와야하기때문에 [i]
		}
	}

}
