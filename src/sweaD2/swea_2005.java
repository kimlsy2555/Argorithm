
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_2005 {

	public static void main(String[] args) {
		 
		// [?] �Ľ�Į�� �ﰢ�� ***** ����
		
		// ���� ������ �ﰢ������ �迭
		// n�� �߿��� k���� �������� ���� ���
		// n��°�� �� ��� n-1���߿��� k-1���� ������
		// ������ ���� n-1���߿��� k���� ������
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int N = 0;
		
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int num = 0;
			N = sc.nextInt();
			
			System.out.print("#"+TC);
			System.out.println();
			for(int i = 0; i<N; i++) {
				for(int j = N; j > i; j--){
					num++;
				}
			}
			
			int[][] pascal = new int [num][num];
			
			// �ٽ� �ڵ� 
			for(int i = 0; i < num; i++) {
				pascal[i][0] = 1;
				for(int j = 1; j<=i; j++) {
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
				}
			}

			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i;j++) {
					System.out.print(pascal[i][j]+" ");
				}
				System.out.println();
			}
		}
		
	
	}

}
