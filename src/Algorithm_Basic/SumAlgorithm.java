package Algorithm_Basic;

import java.util.Scanner;

public class SumAlgorithm {
	// �հ� �˰��� sum Algorithm �־��� ���ǿ� �ش��ϴ� �ڷ���� �հ�
	// n���� ���� �����߿��� 80���̻��� ���� �հ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int student = 0;
		int sum = 0;
		student= sc.nextInt();
		int [] scores = new int[student];
		for(int i = 0; i<student; i++) {
			scores[i] = sc.nextInt();
		}
		
		for(int i = 0; i<student; i++) {
			if(scores[i] > 80) {
				sum += scores[i];
			}
		}
		System.out.println(scores.length+"���� ���� �� 80�� �̻��� ���� :" +sum);
		
		
	}

}
