package student;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
//		(int)(Math.random()*(MAX-MIN+1))+1 랜덤한 수 min~max사이의 랜덤한 수 만드는 메서드
		int User = 0;
		int Cpu = (int)(Math.random()*50)+1;  //1~50까지의 랜덤한 수 입력
		
		Scanner scan = new Scanner(System.in);
		User = scan.nextInt();
		
		 
//		do {//맞을경우 까지 반복
//			System.out.println("정수를 입력하세요 (1~50): ");
//			User = scan.nextInt();
//			if(User > Cpu) { //입력한 값이 >랜덤한 값보다 클경우
//				System.out.println("Down");				
//			}else if(User <Cpu) {
//				System.out.println("Up");
//			}
//		}
//		while(User != Cpu);
//		System.out.println("정답입니다");
		while(User != Cpu) {
			System.out.println("정수를 입력하세요 (1~50): ");
			User = scan.nextInt();
			if(User > Cpu) { //입력한 값이 >랜덤한 값보다 클경우
				System.out.println("Down");
				break;
			}else if(User <Cpu) {
				System.out.println("Up");
				break;
			}
		}System.out.println("정답입니다");
	}

}
