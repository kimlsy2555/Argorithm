package Algorithm_Basic;

import java.util.Scanner;

public class MergeAlgorithm {
	// 2�� ���� �迭 ��ġ�� , �� 2���� �迭�� �������� ���ĵ�
	// ����Ͽ� �ݾ� ������ �˻� �־��� ������ ���� Ư�� ������ ã�� 
	// �� ���� �Ǿ� �ִ� �����͸� �������� ��
	//[?] 
	public static void main(String[] args) {		
		System.out.println("MergeAlgorithm  : ���� �˰���");
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("data1 �迭 ũ�� �Է� : ");
		num1 = sc.nextInt();
		
		
		int[] data1 = new int[num1];
		System.out.print("data1�迭 ������ �Է� : ");
		int m = data1.length;
		int temp = 0;

		
		
		for(int i = 0; i < m; i++) {
			data1[i] =sc.nextInt();
		}
		
		
		for(int i = 0; i < m; i++) {
			for(int j = i+1; j <m ; j++) {
				// �������� ����
				if(data1[i] > data1[j]) {
					temp    = data1[i];
					data1[i] = data1[j];
					data1[j] = temp;
					
				}
			}
		}
		
		
		System.out.print("���ĵ� data1 �� : ");
		for(int i = 0; i < data1.length; i++) {
			System.out.print(data1[i]+" ");
		}
		
		System.out.println();
		
		System.out.print("data2 �迭 ũ�� �Է� : ");
		num2 = sc.nextInt();
		int[] data2 = new int[num2];
		System.out.print("data2�迭 ������ �Է� : ");
		int n = data2.length;
		temp = 0;
		
		for(int i = 0; i < n; i++) {
			data2[i] =sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j <n ; j++) {
				// �������� ����
				if(data2[i] > data2[j]) {
					temp    = data2[i];
					data2[i] = data2[j];
					data2[j] = temp;
					
				}
			}
		}
		
		
		System.out.print("���ĵ� data2 �� : ");
		for(int i = 0; i < data2.length; i++) {
			System.out.print(data2[i]+" ");
		}
		
		System.out.println();
	
		int[] mergedata = new int [n+m];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < m && j < n) {
			
			if(data1[i] <  data2[j]) {
				mergedata[k++] = data1[i++];
			}
			else {
				
				mergedata[k++] = data2[j++];
			
			}
		}
		while(i < m) {
			mergedata[k++] = data1[i++];
		}
	
		while(j < n) {
			mergedata[k++] = data2[j++];
		}
	
			
		for( int ii = 0; ii < mergedata.length; ii++) {
			System.out.print(mergedata[ii]+" ");
		}
		
		System.out.println("MergeAlgorithm  : ���� �˰���");
	}
}


