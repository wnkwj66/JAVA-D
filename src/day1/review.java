package day1;

public class review {
	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		System.out.println(year);
		System.out.println(age);
		year = age + 2000;
		age = age + 1;
		System.out.println(year);
		System.out.println(age);
		
		int x = 10, y = 20;
		int box = 0;
		
		System.out.println("x:"+ x + "y:" + y);
		
		box= x;
		x = y;
		y = box;
		
		System.out.println("x:"+x+"y:"+y);
		
	}

}
