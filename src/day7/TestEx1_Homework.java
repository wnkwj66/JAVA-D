package day7;

public class TestEx1_Homework {
//	***야구 게임
	public static void main(String[] args) {
		int size =3;
		int com[] = new int [size];
		int min =1 , max= 9;
		createArray(min, max, size, com);
		printArr(com);
		//반복 시작(3s나올 때 까지 반복) 스트라이크/볼 판정 메서드 3아웃은 메서드 만들필요 x
		//사용자가 세 수를 입력
		
		//스트라이크 판별
		
		//볼 판별
		
		//3아웃 판별
		//반복 끝
	}
//	기능 : min에서 max사이의 중복되지 않는 n개의 랜덤값을 생성하여 배열에 저장하는 메서드.
//	매개변수 : min에서 max,n개,배열 =>int min, int max, int n, int []arr
//	리턴타입 : 예외처리를 위해 1(true)이면 배열 생성,
//			0(false)이면 배열생성 실패. ->boolean 
//	메서드명: creatArray
//	ex) min =1, max =3, n=4인경우 min~maxt사이의 중복되지않는 랜덤한 수는 3개인데,
//		n=4이기 때문에 4개를 만들어야 하니, 1개를 만들 수 없어서 무한루프에 빠짐.
//		번지 0 1 2 3
//		값   1 3 2
//		r 1 3 1 3 1 2
//		max - min +1 >= n 이면 배열 생성 가능, 아니면 배열 생성 실패
	public static boolean createArray(int min,int max, int n, int []arr) {
		if(arr == null)//null은 참조변수만 선언한 경우.
			return false;
		if(max-min+1 < n)
			return false;
		int cnt = 0;// 현재 배열에 저장된 원소의 갯수
		while(cnt < n) {
			int r= random(min,max);
			if(!isDuplicated(arr, r)) { //중복 되는지 안되는지 체크
				arr[cnt]=r; //[]안에 cnt ++해도 됨
				cnt++; //cnt가 증가하기때문에 배열이 증가?
			}
		}
		return true;
	}
	
	
	
	public static int random(int min,int max) {
		//1,9로 알려줘야하는데(min~max) 9,1로 알려준 경우(max,min)로 1,9(min,max)로 처리하기 위한 작업
		if(min > max) {
			int tmp =min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max -min +1)+min);
		
	}
	public static void printArr(int []arr) {

		for(int i=0 ; i < arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
	}
	public static boolean isDuplicated(int arr[],int num) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
			/*if(i==arr.length-1) {
				System.out.println(num+"없습니다.");
				return false;
			}*/
		}
		return false;
	}
	
	
	

}
