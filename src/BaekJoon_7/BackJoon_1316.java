package BaekJoon_7;

import java.util.Scanner;
public class BackJoon_1316 {
	// Main
public static void main(String[] args) {
		
		// [?] �׷� �ܾ� üĿ
		
		// 1. ���� �̾Ƴ���.
	    // 2. �̾Ƴ����� ���ؼ� �ܾ� üĿ�� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		N = sc.nextInt();
		for(int i=0; i < N; i++) {
			String[] str = new String [N];
			str[i] = sc.next();
	
			String answer = "";
			char[] ch1 =  new char[str[i].length()];
			char[] ch2 =  new char[answer.length()];
			
			boolean flag = true;
			
			// �Է¹��� �� ���� �ɰ��� �ֱ�
			for (int j = 0; j < str[i].length(); j++) {
				ch1[j] = str[i].charAt(j);
			}
			
			// �ߺ��Ǵ� �� Ȯ��
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].indexOf(str[i].charAt(j)) == j) answer += str[i].charAt(j);
			}
			
			
			// �ߺ��� �� ���� �ֱ�
			for (int j = 0; j < answer.length(); j++) {
				 ch2[j] =  answer.charAt(j);
			}
			
			
			while(true) {
				
				for (int j = 0; j < str[i].length(); j++) {
					
					for (int k = 0; k < answer.length(); k++) {
						if(ch1[j] == ch2[k]) {
							
						}
						
						
					}
					
				}
				
				
				
			}
		
		
			
		
			
			
		}
		
		
	}

}
