
package sweaD3;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1215 {

	public static void main(String[] args) {
		// [?] [S/W �����ذ� �⺻] 3���� - ȸ��1
		Scanner sc = new Scanner(System.in);
		for(int TC = 1 ; TC<= 10; TC++) {
			// 1. ���Է�
			char[][] arr = new char[8][8];
			int n = 0;
			n = sc.nextInt();
			int count = 0;
			// �ش� ���ڿ��� �Ѵܾ �ɰ��� �Է� �Է¹ް� ����
			for(int i = 0; i < 8; i++) {
				String str = sc.next();
				for(int j = 0; j < 8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			// ������ ���
			int k = 0;
			while( k != 8) {
				boolean flag = false;
				for(int i = 0; i < (8-n)+1; i++){
					// �μ� ���ڿ� �񱳸� ���ؼ� �迭 ������
					char[] word = new char[n];
					for(int j = 0; j < n; j++){
						word[j] = arr[k][j+i];
					}
					for(int j = 0; j < n/2; j++){
						if(word[j] == word[(n-j)-1]) {
							flag = true;
						}
						else {
							flag = false;
							break;
						}
					}
					if(flag == true) {
						count++;
					}
				}
				k++;
			}
			// ������ ���
			k = 0;
			while( k != 8) {
				boolean flag = false;
				for(int i = 0; i < (8-n)+1; i++){
					char[] word = new char[n];
					for(int j = 0; j < n; j++){
						word[j] = arr[j+i][k];
					}
					for(int j = 0; j < n/2; j++){
						if(word[j] == word[(n-j)-1]) {
							flag = true;
						}
						else {
							flag = false;
							break;
						}
					}
					if(flag == true) {
						count++;
					}
				}
				k++;
			}
			System.out.println("#"+TC+" "+count);
		}
	}
}
