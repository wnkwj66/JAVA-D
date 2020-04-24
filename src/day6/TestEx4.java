package day6;

public class TestEx4 {

	public static void main(String[] args) {
		/* 정수형 배열 5개짜리를 생성하여, 0번지에는 0을 1번지에는 1을 넣도록 작성하고,
		 * 배열의 값을 출력하여 제대로 들어갔는지 확인하세요.
		 */
		int arr[] = new int[5];
		//배열의 값을 0번지부터 마지막까지 접근하는 반복문(암기)
		printArr(arr);
		System.out.println();
		/*0번지에 0을 1번지에 1을 ...4번지에는 4가 저장되도록 작성*/
		for(int i=0 ; i < arr.length; i++) {
			arr[i] = i;
		}
		printArr(arr);

		
//		 num에 1을 저장 후 num의 값이 arr에 있는지 없는지를 확인하여 있으면 있습니다.
//		 없으면 없습니다. 라고 출력하는 코드 작성.
		int num =5;
		if(isDuplicated(arr,num)) {
			System.out.println(num + "은(는) 있습니다.");
		}else {
			System.out.println(num + "은(는) 없습니다.");
		}

//		int num =5;//Why? 위에 메인 int [5]이기 때문에 배열 0 1 2 3 4 중에서 5가 있는지 찾는것이기때문
//		for(int i =0; i<arr.length;i++) {
//			if(arr[i] == num) {
//				System.out.println(num+ "있습니다.");
//				break;
//			}//arr.length-1은 배열 arr마지막 번지.
//			if(i==arr.length-1) {//마지막 번지 -1 : 마지막번지까지 확인했으나 1이 없다는 말 -> 없음
//				System.out.println(num+ "없습니다.");
//			}		
	}			
	/* 메소드 만들기
	 * 기능: 배열이 주어지면 주어진 배열의 각 원소의 값들을 출력하는 메서드
	 * 매개변수 : 배열 ->int[]arr
	 * 리턴타입 : 없다
	 * 매서드명 :
	 */
	public static void printArr(int []arr) {

		for(int i=0 ; i < arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
	}
	/* 기능: 배열 arr 에 정수 num 의 값이 있는지 없는지 확인하는 메서드
	 * 매개변수 : int //배열arr(arr[])에 정수 값(num)이 있는지 없는지 확인
	 * 리턴타입 : 있느지 없는지 => boolean
	 * 메서드명 : isDuplicated
	 */
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
