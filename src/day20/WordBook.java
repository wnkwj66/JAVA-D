package day20;

import java.util.*;

public class WordBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 할 스캐너 객체 생성
		List<Book> list = new ArrayList<Book>();
//		List<String> wordClass = new ArrayList<String>();
//		List<String> meaning = new ArrayList<String>();
//		wordClass.add("명사");
//		wordClass.add("명사");
//		meaning.add("고양이1");
//		meaning.add("고양이2");
		Book b = new Book();
		
		int menu = 0;
		do {
			printMenu();
			menu = sc.nextInt();
			switch(menu) {
			case 1 : 
				System.out.println("단어를 등록 합니다");
				b = inputBook(sc);  //북 클래스의 참조변수  b에 input메서드 대입
				if(!insertWord(list, b)) { //이
					System.out.println("단어가 중복됩니다.");
				}else { 
					System.out.println("단어를 추가했습니다.");
					break;
				}
			case 2 :
				System.out.println("단어를 수정합니다");
				b = inputBook(sc);  //북 클래스의 참조변수  b에 input메서드 대입
				if(!modifyWord(list, b)) {
					System.out.println("해당 단어가 없습니다.");
				}else { 
					System.out.println("단어를 수정했습니다.");
					break;
				}break;
			case 3:
				System.out.println("단어를 삭제합니다");
				b = inputBook(sc);  //북 클래스의 참조변수  b에 input메서드 대입
				if(!deleteWord(list, b)) {
					System.out.println("해당 단어가 없습니다.");
				}else { 
					System.out.println("단어를 삭제했습니다.");
					break;
				}
				break;
			case 4:
				System.out.println("단어를 검색합니다.");
				break;
			case 0:
				printBook(list);
				break;
			}
		}while(menu != 5);	
	}
	public static void printBook(List<Book>list) {
		if(list == null || list.size()==0)
			System.out.println("---단어정보가 없습니다---");
		else {
			System.out.println("---단어   품사     뜻---");//보기 이쁘게
			for(Book tmp :list) {
				System.out.println(tmp);
			}
		}
	}
//	0. 영어 단어 등록 메서드
//	기능 :스캐너를 통해 영어 단어를 입력 하여 객체에 저장(대입)하고 객체를 반환 하는 메서드
//	매개변수 : 입력받을 영단어 => 스캐너
//	리턴타입 : 영단어 객체
//	메서드명 : inputBook
	public static Book inputBook(Scanner sc) {
		List<String> wordClass = new ArrayList<String>(); //객체에 단어를 복수개 입력하려면 객체생성을 해주어햐 함? 
		List<String> meaning = new ArrayList<String>(); 
		Book b = new Book(); //단어를 하나 입력할때마다 클래스 Book에 객체하나씩 생성.
		System.out.print("단어 :");
		
		sc.nextLine();
		String word = sc.nextLine();
		char ch = 0;
		
		do {
			System.out.print("품사 :");
			wordClass.add(sc.next());
			System.out.print("뜻 :");
			sc.nextLine();
			meaning.add(sc.nextLine());
			
			System.out.print("더 입력하시겠습니까?(y/n): ");
			ch = sc.next().charAt(0);
			
		}while(ch != 'n' && ch !='N' ); //ch가 n이 아니고  동시에 N이 아닐때 반복 ?   

		// 객체 b가 호출한다 Book클래스의 word객체를 거기에 입력한 word값을 대입한다.?
		b.word = word; //b는 메서드의 객체.word는 호출된 Book클래스의 객체 = 입력한 값?
		b.wordClass = wordClass;
		b.meaning = meaning;
		return b; //객체 b의 값을 반환한다.(단어 품사 뜻)	
	}
//	1. 영어 단어 등록(추가) //위의 과정을 한번에 가능?
//	기능 : 주어진 영어 단어를  영단어 리스트에 영단어가 있는지 확인 한 뒤, 있으면 추가안함, 없으면 추가 
//	매개변수 : 주어진 영단어, 영어단어 리스트 => Book b,List<Book>
//	리턴타입 : 중복여부? =>boolean
//	매서드명 : insertWord
	public static boolean insertWord(List<Book>list, Book b	) { //따로 리스트 객체(?)를 생성하지 않고도 매개변수로 사용 가능한가보다
		if(list == null || b == null) return false;
		if(list.contains(b)) return false; //리스트에 b가 있으면 false
			list.add(b);
			return true;	
	}
//	2. 영어 단어 수정 
//	기능 : 주어진 영어 단어를 영단어 리스트에 있는지 확인한 뒤, 있으면 수정(삭제 후 추가? 아니면 수정) 없으면 수정 안함.
//	매개변수 : 주어진 영단어, 영단어 리스트 
//	리턴타입 : 중복여부 => boolean
//	매서드명 : modifyWord
	public static boolean modifyWord(List<Book>list,Book b) {
		if(list == null || b == null)return false;
		if(list.contains(b)) {
			list.remove(b);
			list.add(b);
			return true;
		}
			return false;
	}
//	3. 영어 단어 삭제
//	기능: 주어진 영단어가 영단어 리스트에 있는지 확인한 뒤, 있으면 remove/ 없으면 안함
	public static boolean deleteWord(List<Book>list,Book b) {
		if(list.contains(b)) return false;
		list.remove(b);
		return true;
	}
//	4. 영어단어 검색
//	기능 : 주어진 영단어가 리스트에 있는지 확인하여 있으면 2,3번 메서드 수행
//	리턴타입: 
	public static void search(List<Book>list,Book b) {
		
	}
	
	
	
	private static void printMenu() {
		System.out.println("========영어 단어장========");
		System.out.println("1.등록");
		System.out.println("2.수정");
		System.out.println("3.삭제");
		System.out.println("4.검색");
		System.out.println("5.종료");
		System.out.println("=======================");
		System.out.print("메뉴 선택 : ");
	}

}
class Book{
	String word;//	단어
	List<String>wordClass = new ArrayList<String>();//	품사 여러개 -> 리스트
	List<String>meaning = new ArrayList<String>();//	뜻  여러개 -> 리스트
	//북클래스에 쉽게 쓸 객체들 정리해놓음
	//단어는 중복되면 안되기 때문에 이퀄스 이용해서 정리
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	//상위 클래스에서 호출하기위해 생성자 만듦//만들지 않으면 기본생성자(매개변수x) 자동으로 생성
	public Book(String word, List<String> wordClass, List<String> meaning) {
		super();
		this.word = word;
		this.wordClass = wordClass;
		this.meaning = meaning;
	}
	Book(){} //기본생성자 생성 : 위에 기본생성자를 사용하려면 클래스 Book에 기본생성자를 만들어 주어야 하거나 위의 클래스에서 생성자를ㄹ 생성해주어야한다.
	//보기 편하게 toString 이용
	@Override
	public String toString() {
		return "Book [word=" + word + ", meaning=" + meaning + ", wordClass=" + wordClass + "]";
	}
}