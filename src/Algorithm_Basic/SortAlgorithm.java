package Algorithm_Basic;

import java.util.Scanner;

public class SortAlgorithm {
	// ��� �˰���
	//[?] n���� ���� �߿��� 80���̻� 95�� ������ ������ ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<num; i++) {
			data[i] = sc.nextInt();
			if(data[i] <=95 && data[i] >=80) {
				sum += data[i];
				count ++;
			}
		}
		double avg = ((double)sum/count);
		System.out.println(avg);
		
	}

}
