package day20;

import java.util.*;

public class WordBook1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(inputAllWord(scan));
	}
	/* 기능 : 단어, 품사, 뜻을 입력받아 단어를 만들어 반환하는 메소드
	 * 매개변수 : 스캐너 => Scanner scan
	 * 리턴타입 : 단어 => Word
	 * 메소드명 : inputAllWord 
	 */
	public static Word inputAllWord(Scanner scan) {
		Word word = new Word();
		char menu ='y';
		String tmp ="";
		System.out.print("단어 : ");
		word.word = scan.next();
		do {
			System.out.print("품사 : ");
			while((tmp=scan.nextLine()).trim().length()==0);
			word.wordClass.add(tmp);
			
			System.out.print("의미 : ");
			while((tmp=scan.nextLine()).trim().length()==0);
			word.meaning.add(tmp);
			System.out.print("품사와 의미를 더 입력하시겠습니까?(y/n)");
			menu = scan.next().charAt(0);
		}while(menu == 'y' || menu == 'Y');
		return word;
	}
	/* 기능 : 단어장(리스트)에 단어를 추가하는 메소드로 단어장에 추가하면 true를 추가하지 못하면 
	 *       false를 반환함
	 * 매개변수 : 단어장, 단어 => List<Word> list, Word word
	 * 리턴타입 : true아니면 false => boolean
	 * 메소드명 : insertWord 
	 * */
	public static boolean insertWord(List<Word>list,Word word) {
		if(list == null || word == null || list.contains(word))
			return false;
		list.add(word);
		return true;
	}
}
class Word{
	String word;
	List<String>meaning = new ArrayList<String>();
	List<String>wordClass = new ArrayList<String>();
	@Override
	public String toString() {
		return "Word [word=" + word + ", meaning=" + meaning + ", wordClass=" + wordClass + "]";
	}
	
}
