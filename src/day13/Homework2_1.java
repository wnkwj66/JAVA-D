package day13;

import java.util.Scanner;

public class Homework2_1 {

	public static void main(String[] args) {
		int size = 50;
		Product product[]= new Product[size]; //참조 변수 변수명[] = new 참조변수[변수]
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
				String name = scan.next();
				System.out.print("가격 :");
				int price = scan.nextInt();
				product[cnt] = new Product(name,price);
				cnt++;  
			}
		}
		int total = 0;
		//등록된 제품 리스트 출력
		for(int i=0; i<cnt; i++) {//조건문이 참인동안 반복 : cnt가 2개이면 i= 0,1 두번 반복
			product[i].print(i+1);      //**Product 클래스의 멤버 메서드 print를 실행 : 이 방법 추천 
//메인 메서드의 메서드로 사용하면 같은 패키지에서 사용시 복사붙여넣기나 다시 메서드를 만들어야하지만, 프로덕트 클래스에 멤버변수로 사용하면 재사용성이 용이하다
//다른 패키지에서 객체 생성후 .print?로 불러주면 됨
			//print(product[i],(i+1)); 	//**print 메서드 실행 :  class Homework2_1 의 프린트 메서드를 실행하기 때문에 
			total += product[i].getPrice();
		}
		System.out.println("총 가격 : "+total +"원");
		scan.close();

	}
	//같은 클래스가 아니기 때문에  매개변수 Product product,int num 필요  : Product의 정보가 필요하기때문
	public static void print(Product product,int num) { 
		System.out.printf("상품명 : %s, 가격 : %d원\n",num,product.getName(),product.getPrice());
	}

}
class Product{
	//멤버변수 선언
	private String name;
	private int price;
	public Product() {}//기본 생성자 생성
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// get,set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//출력 메서드 생성
	public void print() {
		System.out.printf("상품명 : %s, 가격 : %d원\n",name,price);
	}
	public void print(int num) {
		System.out.print(num+". ");
		print();//메서드 오버로딩
	}
}
