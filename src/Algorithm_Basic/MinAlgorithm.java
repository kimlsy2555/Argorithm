package Algorithm_Basic;

import java.util.Scanner;

public class MinAlgorithm {
	// �ּڰ�
	//[?] �־��� �������� ���� ���� ¦�� ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];
		int min = Integer.MAX_VALUE;
		
		
		for(int i=0; i<num; i++) {
			data[i] = sc.nextInt();
		
			}
		for(int i = 0; i< data.length;i++) {
			if(data[i] < min && data[i] %2 == 0) {
				min = data[i];
			}
		}
		System.out.println("¦�� �ּ� �� : "+min);
	
		
		
		}
	

		
		
	}


