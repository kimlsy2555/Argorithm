package Algorithm_Basic;

import java.util.Scanner;

public class ModeAlgorithm {
	// �ֺ� �˰��� - > ���� Ǭ��
	//[?] �Էµ� ������ �� ���� ���� ��Ÿ���� (�ߺ� )�� ã���ÿ�
	public static void main(String[] args) {		
		System.out.println("ModeAlgorithm  : �ֺ� �˰���");
		Scanner sc = new Scanner(System.in);
		

		int num = 0;
		System.out.print("index �迭 ũ�� �Է� : ");
		num = sc.nextInt();
		int[] index = new int[num];
		System.out.print("index �迭 ������ �Է� : ");
		int m = index.length;
		
		for(int i = 0; i < m; i++) {
			index[i] =sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < m; i++) {
			
			System.out.print("index["+i+"] : "+index[i]+" ");
		}
		
		
		for(int i = 0; i < m; i++) {
			
			if(index[i] > max) {
				max  = index[i];
			}
			
		}
		System.out.println();
		System.out.println("�ִ밪 : "+(max));
		
		int[]  scores = new int[(max+1)];
		

		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j< index.length;j++) {
				if(i == index[j]) {
					scores[i]++; 
				}
			}
		}
		
	for(int i = 0; i < scores.length; i++) {
			
			System.out.print("scores["+i+"] : "+scores[i]+" ");
		}
		
		System.out.println();
		max = 0;
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] > max) {
				max  = scores[i];
			}
		}
		System.out.println("���� ���� ��Ÿ�� �� : "+max);
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] == max) {
				max  = i;
			}
		}
		System.out.println("�ֺ� : "+max);
		
		
			System.out.println("ModeAlgorithm  : �ֺ� �˰���");
		}
	}