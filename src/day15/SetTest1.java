package day15;

import java.util.*;


public class SetTest1 {
	public static void main(String[] args) {
//		로또 만들기 예제
//		1. 중복되지 않는 랜덤한 수 6개를 배열에 저장하고 , 중복되지 않는 랜덤한 수 1개를 변수에 저장(1~45)//당첨번호
//		2. 중복되지 않는 랜덤한 수 6개를 배열에 저장(1~45): 자동 생성번호
//		3. 맞은 개수를 체크 + 보너스 번호가 맞는지 체크
//		4. 맞은 개수와 보너스 번호 맞는지 여부에 따라 등수에 출력
		int lotto[] = new int[6];
		int min = 1, max = 45;
		int auto[] = null;
		int bonus = 0;
//		createRandomArray(min, max, lotto);
		try { // 예외처리
			auto = createRandomArray(min, max, 6);
			createRandomArray(min, max, lotto);
		
			bonus = min-1;
			while(!(bonus >= min && bonus <= max)) {
				bonus = random(min, max);
				if(contains(lotto, bonus)) {
					bonus = min -1;{
					}
				}
			}	

			printArray(lotto);
			System.out.println("보너스 :"+ bonus);
			
			printArray(auto);
			System.out.println();
			//등수 출력하는 코드
			int rank = rank(lotto, bonus,auto);
			if(rank != -1) {
				System.out.println(rank+"등 당첨!");
			}else {
				System.out.println("꽝!");
			}
			
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for(int tmp : lotto) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		for(int tmp : auto) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		//마지막 메서드 두번째 기능 으로 만들기
	
	}
//	기능 : min과 max가 주어지면  min<= x <=max 인 랜덤한 수를 반환하는 메서드
//	매개변수 : 최소값과 최대값 => int min , int max
//	리턴타입 : 랜덤한 수 => 정수 => int
//	메소드명 : random
	public static int random(int min,int max) {
		if(max < min)
			throw new ArithmeticException("예외: 최소값과 최대값 순서가 바뀌었습니다.");
		return new Random().nextInt(max-min)+min;
	}
//	기능 : 배열에 정수 num의 값이 있는지 없는지 알려주는 메서드(중복체크)
//	매개변수: 배열, 정수 num => int[]arr,int num
//	리턴타입: 있는지 없는지 => ,boolean
//	매서드명: contains
	public static boolean contains(int []arr,int num) {
		for(int tmp : arr) {
			if(tmp == num)
				return true; //이때 어떻게 반환시키고
		}//배열의 값을 확인 할때 향상된 for문을 사용하는게 편하다.
		return false;//이땐 어떻게 반환시키는지 
	}
//	기능  : 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 만들어서 배열의 갯수만큼 저장하는 메서드
//	기능2: 최소값과 최대값 사이에서 랜덤한 수를 중복되지 않게 cnt개 만들어서 배열에 저장하는 메서드
//	매개변수 : 최솟값, 최대값, 배열 => int min, int max, int []arr
//	매개변수2: 최솟값, 최대값  => int min, int max, int cnt
//	리턴타입 : 없음 -> void //참조변수가 매개변수일때는 주소의 값을 넘겨주기때문에 반환값을 알려줄 필요가 없다.
//	리턴타입2: 배열 -> int[]
//	메서드명 :createRandomArray
	  //매개변수가 중복되지 않기 때문에 오버로딩을 통해 아래에 작업함
	public static void createRandomArray(int min, int max,int[]arr) 
			throws Exception, NullPointerException {
		if(arr==null) throw new NullPointerException("예외:빈 배열입니다.");
		if(arr.length > max - min+1) throw new Exception("예외:랜덤한 수의 범위보다 배열의 크기가 크다.");
		
		int nowCnt = 0;
		while(nowCnt < arr.length) {
			int r = random(min,max);
			if(!contains(arr, r)) { //포함되어 있지 않으면 (중복되지 않으면)
				arr[nowCnt] = r;
				nowCnt++;
			}
		}
	}
	//오버로딩 된 기능 2
	public static int[] createRandomArray(int min, int max,int cnt) throws Exception {
		if(cnt > max - min+1) throw new Exception("예외:랜덤한 수의 범위보다 배열의 크기가 크다.");
		int []arr = new int[cnt];
		int nowCnt = 0;
		while(nowCnt< arr.length) {
			int r = random(min,max);
			if(!contains(arr, r)) { //포함되어 있지 않으면 (중복되지 않으면)
				arr[nowCnt] = r;
				nowCnt++;
			}
		}
		return arr;
	}
	public static void printArray(int [] Array) {
		for(int tmp : Array) {
			System.out.printf("%3d",tmp);
		}		
	}
//	기능 : 당첨번호를 기준으로 자동생성된 번호가 몇등인지 알려주는 메서드 (꽝 :-1)
//	매개변수 : 당첨 번호, 자동 생성 번호 = int [] lotto, int bounus, int [] auto
//	리턴타입 : 등수 => 정수
//	메서드명 : rank
	public static int rank(int []lotto, int bonus, int[]auto) {
		int sameCnt = 0;
		for(int tmp : lotto) {
			if(contains(auto, tmp)) {
				sameCnt++;
			}
		}
		switch(sameCnt) {
		case 6: return 1;
		case 5: //5개 맞으면 2등 아니면 3등임 
			if(contains(auto,bonus)) return 2;
			return 3;
		case 4: return 4;
		case 3: return 5;
		}
		return-1;
	}
}
