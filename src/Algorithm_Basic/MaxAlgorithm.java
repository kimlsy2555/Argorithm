package Algorithm_Basic;

import java.util.Scanner;

public class MaxAlgorithm {
	// �ּڰ�
	//[?] n���� ���� �߿��� 80���̻� 95�� ������ ������ ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];
		int max = Integer.MIN_VALUE;
		
		
		for(int i=0; i<num; i++) {
			data[i] = sc.nextInt();
		
			}
		for(int i = 0; i< data.length;i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		System.out.println(max);
	
		
		
		}
	

		
		
	}


