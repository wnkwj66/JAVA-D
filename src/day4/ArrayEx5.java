package day4;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 배열의 내용을 정렬하는 예제
		int arr[] = new int [10];
		int max=100;
		int min=1;
		for(int i=0 ; i<arr.length; i++) {
			int random = (int)(Math.random()*(max-min+1)) + min;
			arr[i] = random;
			//arr[i] = (int)(Math.random()*(max-min+1)) + min; 하면 중복됨
		}
		for(int tmp:arr) {
			System.out.printf("%3d",tmp);
			
		}
		System.out.println();
	
		// 크기 대로 순서 나열	
		// 80   16   93   85   30   65   60   37   58   78   
		/* 16   80
		 * 16   80   93
		 * 16   80   85   93 - - -
		 * 16   80   85   30   65   60   37   58   78   90 -한 번하면 가장 큰값 알수있음.*/
		
		for(int i=0;i <arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					//두수 바꾸기 사용/ 최소공배수에서 활용 했었음
					int tmp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
			}
		}
		for(int tmp:arr) {
		System.out.printf("%3d",tmp);
		}
		System.out.println();
	}
}
