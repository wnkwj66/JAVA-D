package day3;

public class ForEx9 {
/* *****   i=1 *=5
 * *****   i=2 *=5
 * *****   i=3 *=5
 * *****   i=4 *=5
 * *****   i=5 *=5
 */
	
/* *       i=1 *=1
 * *       i=2 *=2
 * *       i=3 *=3
 * *       i=4 *=4
 * *       i=5 *=5
 *             *=i
 */	
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=10-i;j++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
/* *       i=1  공백 =4 *=1
 * *       i=2  공백 =3 *=2
 * *       i=3  공백 =2 *=3
 * *       i=4  공백 =1 *=4
 * *       i=5  공백 =0 *=5
 *              공백 5-*=i
 */

