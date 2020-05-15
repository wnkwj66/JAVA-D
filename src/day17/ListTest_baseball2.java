package day16;

import java.util.*;

public class ListTest_baseball2 {
	public static void main(String[] args) {
		ListTest_baseball1.set(1, 20);
		ListTest_baseball1.play();
	}
}
class ListTest_baseball1{
	static int min =1 , max = 9;
	static int strike = 0, ball= 0;
	static int size = 3;
	static List<Integer> user = new ArrayList<Integer>();
	static List<Integer> com = new ArrayList<Integer>();
	
	public static void set(int min1, int max1) {
		min = min1;
		max = max1;
	}
	
	public static void play() {
		com = createRandomList();
		System.out.println(com);
		Scanner scan = new Scanner(System.in);
		while(strike != size) {
			// 4-2) 정수 세개를 입력 받아 중복된 내용이 있으면 다시 입력받게 함.
			user.clear();
			
			if(!insertUser(scan)) { //중복된 숫자가 있는 경우
				System.out.printf("입력한 숫자 중에 중복된 숫자가 있거나 입력된 숫자가"+"%d~%d 사이의 숫자가 아닙니다.\n",min,max);
				continue;
			}
			System.out.println(user);
			// 4-3) 스트라이크와 볼을 판별
			strike = 0;
			ball = 0;
			for(int i =0; i< com.size(); i++) {
				//스트라이크 개수 판별
				if(com.get(i)==user.get(i)) {
					strike++;
				}
				//스트라이크 + 볼 개수 판별
				if(com.contains(user.get(i))){
					ball++;
				}
			}
			ball = ball- strike;
			// 4-4) 판별한 스트라이크와 볼을 이용하여 출력
			if(strike != 0) {
				System.out.print(strike+"S");
			}
			if(ball != 0) {
				System.out.print(ball+"B");
			}
			if(strike == 0 && ball == 0) {
				System.out.println("3 Out");
			}
			System.out.println();
		}
		System.out.println("정답입니다.");
	}
	public static int random(int min, int max) {
		if(max < min)
			throw new ArithmeticException("예외 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
		
	}
	private static int random() {
		if(max < min)
			throw new ArithmeticException("예외 발생 : 최대값과 최소값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min+1)+min;
	}
	public static List<Integer> createRandomList(){
		if(size > max-min +1)
			throw new ArithmeticException("예외 : 랜덤 범위보다 만들어야 하는 개수가 더 많습니다");
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < size) {
			int r = random();
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		return list;
	}
	private static boolean insertUser (Scanner scan) {
			int i = 0;
			System.out.print("중복되지 않은 숫자"+size+"개를 입력하세요 ("+min+"~"+max+"):");
			while( i++  <size) { //비교할때는 0 들어갈때는 1 > 비교 1 들어갈때 2 > 비교 2 들어갈때 3 :후위연산
				user.add(scan.nextInt());
			}
			i = 0;
			List<Integer> tmpList = new ArrayList<Integer>();
			while(user.size() !=0 ) {
				int tmp = user.remove(0);
				if(tmp < min || tmp > max || user.contains(tmp)) { //입력받은 수(user)와 tmp에  들어온 수 (remove 된 0번지의 값) 가 중복이 되면
					return false;
				}
				tmpList.add(tmp);
			}
//				user = tmpList; 일때 원본에 tmpList값이 추가되지 않음
			user.addAll(tmpList);
			return true;
	}
}
