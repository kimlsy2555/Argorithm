package Algorithm_Basic;

import java.util.Scanner;

public class SearchAlgorithm {
	// �˻� �˰��� ���� �˻� (�̺� Ž��)��
	// ����Ͽ� �ݾ� ������ �˻� �־��� ������ ���� Ư�� ������ ã�� 
	// �� ���� �Ǿ� �ִ� �����͸� �������� ��
	//[?] 
	public static void main(String[] args) {
		
		
		
		System.out.println("SearchAlgorithm : ���� �˻� �˰���");
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("�迭 ũ�� �Է� : ");
		num = sc.nextInt();
		int[] data = new int[num];
		System.out.print("�迭 ������ �Է� : ");
		int n = data.length;
		int temp = 0;
		int search = 0;
		for(int i = 0; i < n; i++) {
			
			data[i] =sc.nextInt();
		}
		for(int i = 0; i <n; i++) {
			for(int j = i+1; j <n ; j++) {
				// ���� ���� ���� DESC
				if(data[i] > data[j]) {
					temp    = data[i];
					data[i] = data[j];
					data[j] = temp;
					
				}
			}
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		System.out.print("������ ��Ͽ��� �˻��� �����͸� �Է� �ϼ��� : ");
		search = sc.nextInt();
		
		int low = 0;
		int high = n;
		int mid = (low + high)/2;
		while(true) {
			if(data[mid] == search) {
				System.out.print("���� �˻� ��� �迭�� ["+mid+"]�� °�� �ش� ���� �ֽ��ϴ�.");
				break;
			}
			else if(data[mid] < search) {
				low = mid;
				low++;
				mid = (low + high)/2;
				System.out.println(data[mid]);
			}
			else if(data[mid] > search) {
				mid /=2;
				System.out.println(mid);
			}
		}
	}
}


