
package sweaD3.copy;

import java.util.Scanner;

public class swea_1216 {

	public static void main(String[] args) {
		
		// [?] [S/W �����ذ� �⺻] 3���� - ȸ��2
		
		Scanner sc = new Scanner(System.in);
		
		for(int tc=0;tc<10;tc++) {
			int t = sc.nextInt();
			char map[][] = new char[100][100];
			int ans = 0;
			
			for(int i=0;i<100;i++) {
				String str= sc.next();
				for(int j=0;j<100;j++) {
					map[i][j] = str.charAt(j);
				}
			}
			
			// s 	: ȸ�� ���� - ���� �� ȸ���� ���� ������ �˻�
			//cnt 	: ���� ȸ�� ���� +1 (�迭�� �ε����� 99�����ϱ�)
			// i	: x��ǥ
			// j	: y��ǥ
			// k 	: ���� ��ǥ�� ȸ�� ���� �� �� �ֵ��� �������ִ� �� (ex 0.0�϶� 99������ ȸ���� ��ġ�ϴ��� ��������)
			//����
			for(int s=99;s>0;s--) { // 99���� ������ 
				int cnt = s+1;
				for(int i=0;i<100;i++) {
					for(int j=0;j<100;j++) {
						boolean flag = false;
						for(int k=0;k<cnt/2;k++) { // cnt�� ���ݸ� ���� �� 0-7,1-6,2-5,3-4�� ���ΰ�ó��
							if((j+k)>=100 || (j+s-k)>=100) { //�迭�ʰ��� true�� �ٲ��ְ� �ݺ��� ��������
								flag=true;
								break;
							}
							if(map[i][j+k]!=map[i][j+s-k]) { //���� ���ĺ����� Ȯ�� + j�� ��ġ������ ����
								flag=true;
							}
						}
						if(!flag) {
							if(ans<cnt)
								ans=cnt;
						}
					}
				}
			}
			
			//����
			for(int s=99;s>0;s--) { // 99���� ������
				int cnt = s+1;
				for(int i=0;i<100;i++) {
					for(int j=0;j<100;j++) {
						boolean flag = false;
						for(int k=0;k<cnt/2;k++) {
							if((j+k)>=100 || (j+s-k)>=100){
								flag=true;
								break;
							}
							if(map[j+k][i]!=map[j+s-k][i]) {
								flag=true;
							}
						}
						if(!flag) {
							if(ans<cnt)
								ans=cnt;
						}
					}
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}

}