
package sweaD3.copy;

import java.util.Scanner;

public class swea_1209 {

	public static void main(String[] args) {
		
		// [?] [S/W �����ذ� �⺻] 2���� - Sum
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		
		
		for(int TC = 1 ; TC<= 10; TC++) {
			T=sc.nextInt();
			int num[][] = new int[100][100];
		
			int sum = 0;
		
			int max = Integer.MIN_VALUE;
			for(int i =0; i<num.length; i++) {
				for(int j=0; j<num.length; j++) {
					num[i][j] = sc.nextInt();
				}
			}
			
			// ���� ����
			for(int i = 0; i < num.length; i++) {
				for(int j = 0; j < num.length; j++) {
					sum += num[i][j]; 
				}
				
				if(max < sum) {
					max = sum;
				}
				sum = 0;
			}
		
			
			// ���� ����
			for(int i = 0; i < num.length; i++) {
				for(int j = 0; j < num.length; j++) {
					sum += num[j][i]; 
				}
				
				if(max < sum) {
					max = sum;
				}
				sum = 0;
			}
			// �밢 ����1
			for(int i = 0; i < num.length; i++) {
			
				sum += num[i][i]; 

			}
			if(max < sum) {
				max = sum;
			}
			sum = 0;
			
			// �밢 ����2
			for(int i = num.length-1; i > 0; i--) {
				sum += num[i][i]; 
			}
			if(max < sum) {
				max = sum;
			}
			sum = 0;
			
	
			System.out.println("#"+TC+" "+max);
			
			
			
		}
		
	
	}

}
