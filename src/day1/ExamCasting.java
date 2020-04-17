package day1;

public class ExamCasting {

	public static void main(String[] args) {
		// 정수형 변수 num에 실수1.23.을 저장하면 0.23이 사라지기 때문에 에러발생. *해결 위해 명시적 자료형 변환 이용하여 1.23을 1로 바꾸어 저장
        int num=(int)1.23;
        double dnum=1;
        //실수형 변소 dnum에 정수1을 저장하면 자동자료형변완으로 인해 1.00으로 저장된다.
        double dnum1 = 1;
        float fnum = 1.23f;
        //float fnum = (float)1.23;
        /* 자동 자료형 변환이 되는 경우
         * 정수 ㅡ> 실수
         * 바이트가 작은것 ㅡ> 큰 것
         * float ㅡ> double
         * byte ㅡ> short(char) ㅡ> int ㅡ> long
         */
	}
	

}
