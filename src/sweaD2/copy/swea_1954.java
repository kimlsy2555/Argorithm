
package sweaD2.copy;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1954 {

	
	public static void main(String[] args) {
		
		// [?] ������ ����
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		int x1 = 1, x2= -1;
		int y1 = 1, y2= -1;
		
		for(int TC = 1 ; TC<= T; TC++) {
			
			int N = sc.nextInt();
			int num[][] = new int[N][N];
			int count = 1;
			for(int i=0; i<N; i++) {
				for(int j =0; j<N; j++) {
					
					num[i][j] = count++; 
				
				}
			}
			
	
			
			for(int i=0; i<N; i++) {
				for(int j =0; j<N; j++) {
					
					
						System.out.print(num[i][j]);
					
				

					// �Ʒ��� �̵� - x+1
					
					// ���� ������ �̵� - y-1
					
					// ���� ���� �̵� - x-1
					
					// ������ ������ �̵� y+1
				}
				System.out.println();
			}
			
		}
		
	
	}

}
