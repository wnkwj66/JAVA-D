package day7;

public class MethodEx6 {
	
	public static void main(String[] args) {
		int max =10, min =1;
		int r = random(min,max);
		System.out.println(r);
	}
//	기능 : min부터 max사이의 임의의 정수를 생성하여 알려주는 메서드
//	매개변수 : 범위값중 최솟값과 최댓값 ->int min, int max
//	리턴타입 : 임의의 정수 -> int
//	메서드명 :random
	public static int random(int min,int max) {
		//1,9로 알려줘야하는데(min~max) 9,1로 알려준 경우(max,min)로 1,9(min,max)로 처리하기 위한 작업
		if(min > max) {
			int tmp =min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max -min +1)+min);
		
	}
}
