package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEx4 {
//	- 정수 n개를 입력받아 저장하고, 저장된 n개의 정수를 거꾸로 출력하는 코드를 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력받을 정수의 개수 :");
		int size = scan.nextInt();
//		int [] arr = new int[size];
		List<Integer>arr = new ArrayList<Integer>();
		System.out.print("정수"+ size + "개를 입력하세요 :");
		for(int i =0; i < size; i++) {
			int tmp = scan.nextInt();
			//arr[i] = tmp;
			arr.add(tmp);
			//arr[i] = scan.nextInt();
			//arr.add(scan.nextInt());
			//저장
		}
		System.out.println("입력 받은 정수를 거꾸로 출력:");
		for(int i =size-1 ; i>=0; i--) {
			//System.out.print(arr[i]+" ");
			System.out.print(arr.get(i)+" ");
		}
	}
}
