package Algorithm_Basic;

import java.util.Scanner;

public class RankAlgorithm {
	// ���� �˰��� �ſ� �߿� : ����,ū �����͸� �������� ������� �̵�
	//[?] ������ �����͸� ������� ��������/�������� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int[] data = new int[num];

		int temp = 0;
		for(int i = 0; i < data.length; i++) {
			data[i] =sc.nextInt();

		}

		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j <data.length ; j++) {
				
				if(data[i] < data[j]) {
					temp    = data[i];
					data[i] = data[j];
					data[j] = temp;
					
				}
			}
		}
		
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		
		
		
		
		
		
	}
}


