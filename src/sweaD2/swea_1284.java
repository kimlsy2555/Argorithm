
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1284 {

	public static void main(String[] args) {

		// [?] ���� ��� * 
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int chargeA = 0;
		int chargeB = 0;
		int P,Q,R,S,W = 0;
		
		
		for(int i = 1 ; i<= T; i++) {
			P = sc.nextInt(); // A���� 1���ʹ� ���
			Q = sc.nextInt(); // B���� R���� ���� ��� Q B���� �⺻ ���
			R = sc.nextInt(); // B���� ���� 
			S = sc.nextInt(); // B���� 1���ʹ� ���  
			W = sc.nextInt(); // �����̰� �Ѵ� �� ��� �ϴ� ������ ��
			
			chargeA = P * W; 
			
			if(W < R) {
				chargeB = Q;
			} 
			else {
				
				chargeB = (W - R);
			
				chargeB *= S;
		
				chargeB += (Q);
				
			}
			if(chargeA < chargeB) {
				System.out.println("#"+i+" "+chargeA);
				
			}
			else {
				
				System.out.println("#"+i+" "+chargeB);
			}
			
		}
		
	}

}
