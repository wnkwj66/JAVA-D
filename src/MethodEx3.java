
public class MethodEx3 {

	public static void main(String[] args) {
		/*매개 변수가 일반 변수이면 매개변수의 원본값이 변경되지 않는다.
		 * 메모장을 복사하여 메모장 -복사본 만들고 메모장 복사본의 내용을 수정해요 메모장원본의 내용이 바뀌지 않는 원리*/
		int num1 =10, num2 = 20;
		System.out.printf("num1=%d, num2=%d(main)%n",num1,num2);
		swap(num1,num2);
		System.out.printf("num1=%d, num2=%d(main)%n",num1,num2);
		
		int arr[] = new int[4];
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		/*매개 변수가 참조 변수이면 매개변수의 원본값을 바꿀 수 있다.
		 * exe.파일과 exe(복사본)이랑 같은 폴더를 공유하고 있기 때문에 둘다 같은 파일이다.*/
		setArray(arr, 5);
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
	}
	public static void swap(int num1,int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.printf("num1=%d, num2=%d(swap)%n",num1,num2);
	}
	/* 기능 : 배열의 모든 값을 num로 변경하는 메서드*/
	public static void setArray(int[]arr,int num) {
		for(int i=0; i <= arr.length-1;i++) {
			arr[i] = num;
		}
	}
}
