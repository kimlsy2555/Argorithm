package Algorithm_Basic;

import java.util.Scanner;

public class SumAlgorithm2 {
	// 1���� 20���� ������ Ȧ���� ���� ���ϴ� ���α׷�
	// ��������
	public static void main(String[] args) {

		int sum = 0;
		int[] num = new int[20];
		
		for(int i = 0 ; i <20; i++) {
			num[i] = i+1;
			
		}
		
		for(int i = 0 ; i <20; i++) {
			if(num[i] % 2 != 0) {
				sum += num[i];
				
			}
		}
		System.out.println(sum);
		
	}

}
