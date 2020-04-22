package day4;

public class Test_rivew3 {

	public static void main(String[] args) {
		// 1.정수 10개짜리 배열에 값을 랜덤으로 생성하여 저장하고(중복o)
		// 2.저장된 배열 값 중에서 가장 큰 값과 가장 작은값을 출력하는 코드 작성.
		
		int arr[] = new int [10];
		int max=100;
		int min=1;
		for(int i=0 ; i<arr.length; i++) {
			int random = (int)(Math.random()*(max-min+1)) + min;
			arr[i] = random;
			//arr[i] = (int)(Math.random()*(max-min+1)) + min; 하면 중복됨
		}
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		int Max = arr[0]; //Min = Max = arr[0]; 으로 처리 가능. 0번지의 값을 Min.Max에 넣어줌.
		int Min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > Max) {
				Max = arr[i];				
			}
			else if(arr[i] < Min) {//그냥 if문으로 처리 가능
				Min = arr[i];
			}
		}	
		System.out.println("최대값: "+Max);
		System.out.printf("최소값: "+Min);
	}

}
