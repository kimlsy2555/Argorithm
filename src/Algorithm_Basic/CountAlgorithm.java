package Algorithm_Basic;

import java.util.Scanner;

public class CountAlgorithm {
	// ���� �˰��� : �־��� ������ �־��� ���ǿ� �ش��ϴ� �ڷ���� ����
	// [?] : 1���� 1,000 ������ ���� �� 13�� ��� ����
	public static void main(String[] args) {

		int[] num = new int[1000];
		
		int count = 0;
		
		for(int i=0;i<1000;i++) {
			num[i] = i+1;
			if(num[i] %13 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
