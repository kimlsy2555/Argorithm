package Algorithm_Basic;

import java.util.Scanner;

public class ModeAlgorithm_answer {
	// �ֺ� �˰��� - > ���� ȿ����
	//[?] �Էµ� ������ �� ���� ���� ��Ÿ���� (�ߺ� )�� ã���ÿ�
	public static void main(String[] args) {	
		System.out.println("================================");
		System.out.println("ModeAlgorithm  : �ֺ� �˰���");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("index �迭 ũ�� �Է� : ");
		num = sc.nextInt();
		int[] index = new int[num];
		System.out.print("index �迭 ������ �Է� : ");
		int m = index.length;
		int mode = 0;
		int max = Integer.MIN_VALUE;
		int maxmax = Integer.MIN_VALUE;
		for(int i = 0; i < m; i++) {
			index[i] =sc.nextInt();
		}
		
		
		
		for(int i = 0; i < m; i++) {
			
			System.out.print("index["+i+"] : "+index[i]+" ");
		}
		
		
		for(int i = 0; i < m; i++) {
			
			if(index[i] > max) {
				max  = index[i];
			}
			
		}
		System.out.println();
		
		int[]  scores = new int[(max+1)];
		max = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < index.length;i++) {
			// 1 3 4 3 5 �� ���� �Է� ������....
			// �ٽ� ����
			// Count �˰����� ����ؾ���
			// ���� ��ü�� �Ǵٸ� �迭�� �ε����� ����
			// �� scores[0] �̶�� ���� index[0] �� �� 1�� ���� 
			// �� scores[1]�� ������ �̵��� ++ 
			// count�� �ϰ� �ȴ�. 
			// ��� ������� �Ѵٸ�
			// scores[0] -> inedx[0]-> score[1] = ++;
			// scores[1] -> index[1]-> score[3] = ++;
			// scores[2] -> index[2]-> score[4] = ++;
			// scores[3] -> index[3]-> score[3] = ++;
			// scores[4] -> index[4]-> score[5] = ++;
			//             scores      0 1 2 3 4 5
			// ���� ������ scores ���� 0 1 0 2 1 1
			// �ֺ����� 3 �ߺ� Ƚ���� 2�� �Ǵ� ���̴�....
			
			// �ſ� ��Ư�� ������ �˰����̱� ������
			// ���� �˰��� �ϳ��� �� �� �ִ�...
			
			// ���� �ֺ��� �ٽ� �˰����� ���� 
			// 2�� for���� ����Ѵٸ� �ð��ʰ��� ���ɼ��� �ſ� ����
			

			scores[index[i]]++;
		}
		for(int i = 0; i < scores.length;i++) {
			System.out.print("scores["+i+"] : "+scores[i]+" ");
			
		}
		System.out.println();

		for(int i = 0; i< scores.length;i++) {
			if(scores[i] >= max) {
				max = scores[i];
				mode = i;
			}

		}
		System.out.println("�ֺ� : "+mode + " Scores : " + max);
		System.out.println("================================");
		}
	}