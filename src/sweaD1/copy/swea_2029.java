
package sweaD1.copy;

import java.util.Scanner;

public class swea_2029 {

	public static void main(String[] args) {
		
		// [?] ��� ������ ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("#"+TC+" "+A/B+" "+A%B);
		}
		
	
	}

}
