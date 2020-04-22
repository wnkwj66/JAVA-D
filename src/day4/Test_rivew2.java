package day4;

public class Test_rivew2 {

	public static void main(String[] args) {
		//1. 정수 10 개를 저장할 수 있는 배열을 선언하고 생성하세요. -> 선언 및 생성
		//2. 1부터 10 까지 차례대로 배열에 저장하세요. -> 배열 시작번지
		//3. 저장된 배열의 값을 출력하세요.=>향상된 for문
		//4. 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요.-> 반복문안에서 조건문사용, 작성방법에 따라 continue사용
		//5. 저장된 배열의 값을 다시 출력하세요. 
		
		//1. 배열 선언,생성
		//타입[] 변수명 :
		int[] arr = new int[10];
		for(int i=0; i <arr.length; i++) {
		//2. i는 0번지 부터 9번지까지 1씩 증가
			arr[i] = i+1;
		}
		for(int i =0; i<arr.length; i++) {
			System.out.printf("%2d",arr[i]);
		}
		//3. 저장된 배열의 값을 출력.
		//4. 인덱스(번지)가 짝수이면 저장된 수에 2를 곱하여 저장한다.
		System.out.println(); 
		//엔터
		
		for(int i=0; i <arr.length; i+=2) {
			arr[i] = arr[i] *2; //arr[i] *=2
			
			}
		for(int tmp : arr) {
			System.out.printf("%2d",tmp);
	    	}
		}
	}
