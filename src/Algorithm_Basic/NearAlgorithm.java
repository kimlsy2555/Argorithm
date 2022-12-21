package Algorithm_Basic;

import java.util.Scanner;

public class NearAlgorithm {
	// �ٻ簪
	//[?] ���� ������ �߿��� ��� �����Ϳ� ���� ����� ���밪
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];
		
		int min = Integer.MAX_VALUE; // ���հ� ������ �ּڰ��� ��� �׸�
		int near = 0; // �ٻ�
		int target = 0; // Ÿ�ٰ�
		target = sc.nextInt();
		
		int[] targeting = new int[num];
		for(int i=0; i<num; i++) {
			data[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			targeting[i] =  Math.abs((data[i] - target));
			if(targeting[i] < min) {
				min = targeting[i];
			}
		}
		
		System.out.println(target+"��/�� ���� ����� ���� : "+(min+target));
		
	}
}


