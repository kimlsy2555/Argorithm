
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1209 {

	public static void main(String[] args) {
		
		// [?] [S/W �����ذ� �⺻] 2���� - Sum
		
		Scanner sc = new Scanner(System.in);
		int T = 0;

		for(int TC = 1 ; TC<= 10; TC++) {
			T=sc.nextInt();
			int [][] num = new int [100][100];
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for(int i = 0; i < num.length; i++){
				for(int j = 0; j < num.length; j++){
					num[i][j] = sc.nextInt();
				}
			}
			// ���� ū��
			for(int i = 0; i < num.length; i++){
				for(int j = 0; j < num.length; j++){
					 sum += num[i][j];
					
				}
			
				if(sum > max) {
					max = sum;
				}
				sum = 0;
			}
			
			// ���� ū��
			for(int i = 0; i < num.length; i++){
				for(int j = 0; j < num.length; j++){
					 sum += num[j][i];
					
				}
				 
				if(sum > max) {
					max = sum;
				}
				sum = 0;
			}		
		
			// �밢 ��� 1
			for(int i = 0; i < num.length; i++){
					 sum += num[0+i][((num.length)-1)-i];
				
				if(sum > max) {
					max = sum;
				}
				
			}	
			sum = 0;
			// �밢 ��� 2
			for(int i = 0; i < num.length; i++){
					 sum += num[((num.length)-1)-i][0+i];
				
				if(sum > max) {
					max = sum;
				}
				
			}
			
			System.out.println("#"+T+" "+max);
			
		}
		
	
	}

}
