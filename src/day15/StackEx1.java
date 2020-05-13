package day15;

import java.util.*;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		//다양한 방법으로 1 ,2 ,3 추가
		stack.push(1);
		stack.push(new Integer(2));
		stack.push(Integer.parseInt("3"));
//		pop은 마지막 요소를 꺼낸다 => 마지막 요소를 반환한다
		System.out.println(stack.pop()+"을 스택에서 꺼냈습니다.");
		System.out.println(stack.pop()+"을 스택에서 꺼냈습니다.");
//		stack.pop();//3 사라짐
//		stack.pop();//2 사라짐 
		for(Integer tmp : stack) {
			System.out.println(tmp);
		}
	}

}
