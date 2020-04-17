package day1;

import java.util.Scanner;

public class ExamVariable {
	  public static void main(String[] args){
	    /* 콘솔에 원하는 문자열을 출력한 후에 엔터를 치는 것(메소드)*/
	    System.out.println("Hello world!");
	    int num1 = 10, num2 = 20;
	    System.out.println(num1 + ","+ num2);
	    num1 = 9;
	    num2 = 11;
	    System.out.println(num1 + ","+ num2);
	    System.out.printf("%2d,%2d\n",num1,num2);
	    double dnum =1.23;
	    System.out.println(dnum);
	    System.out.printf("%f\n",dnum);
	    System.out.printf("%.4f\n",dnum);
	    System.out.printf("%7.4f\n",dnum);

	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    System.out.println(num);
	    char ch = scan.next().charAt(2);
	    System.out.println(ch);
	    //문자열을 관리하는 String 클래스
	    String str = new String();
	    str = scan.next();
	    System.out.println(str);
	    scan.close();
	  }

}
