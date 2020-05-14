package day16;

import java.util.*;

public class ListTest_baseball {

	public static void main(String[] args) {
//	컴퓨터가 랜덤한 수 3개를 생성하고 그걸 리스트에 저장 중복되지 않게.
//	내가 입력한 수 3개 와 중복되는지 확인
//	숫자와 자리 모두가 같으면 strike
//	숫자만 같으면 ball
//	하나도 안맞으면 out
//	다맞으면 정답 3S
	중복되지 않는 랜덤한 수 3개를 만드는 메서드를 만들고 그 값을 리스트에 저장.
	스캐너를 통해 정수 3개를 입력 받고, 그 값을 리스트에 저장
	contains 인터페이스를 통해 
		 
		Scanner scan = new Scanner(System.in);
		
		List<Integer> cpu = new ArrayList<Integer>();//객체 생성 랜덤한 수를 담는 객체 
		List<Integer> user = new ArrayList<Integer>();//내가 입력한 수를 담는 객체
		
		while(cpu.size()<3) {
			int r = new Random().nextInt(9)+1;
			if(!cpu.contains(r)) {
				cpu.add(r);
			}
		}
		System.out.println(cpu);
		int num = scan.nextInt();
		num = cpu.get(num); //num랑 일치하는 수가 cpu에 있으면 가져오고 아니면  null
		
	}
}
