package day14;

import java.util.Objects;

public class ObjectsEx1 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		
		System.out.println("객체 str은 null입니까?"+Objects.isNull(str));
		System.out.println("객체 str은 null이 아닙니까?" + !Objects.isNull(str));
		System.out.println("객체 str은 null이 아닙니까?" + Objects.nonNull(str));
		String str2 ="";
//		System.out.println(str.equals(str2)); //객체가 만들어지지 않은 상태에서 접근하기 때문에? 예외
		System.out.println(Objects.equals(str, str2));
	}

}
