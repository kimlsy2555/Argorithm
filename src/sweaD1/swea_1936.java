
package sweaD1;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1936 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		A=sc.nextInt();
		B=sc.nextInt();
		
		if(A * B == 3) {
			// ��� �������� ������ �̰��...
			if(A < B) {
				System.out.println("A");
			}
			else {
				System.out.println("B");
			}
		}
		
		if(A * B == 2 || A * B ==6) {
			// ��� �������� ������ �̰��...
			if(A > B) {
				System.out.println("A");
			}
			else {
				System.out.println("B");
			}
		} 
		
	
	}

}
