
package sweaD1.copy;

import java.util.Scanner;

public class swea_2050 {

	public static void main(String[] args) {
		
		// [?] ���ĺ��� ���ڷ� ��ȯ
		
		Scanner sc = new Scanner(System.in);

		// A =65;
		
		String str = sc.next();
		
		for(int i=0; i<str.length();i++) {
			System.out.print((str.charAt(i) - 64)+" ");
		}
		
	
	}

}
