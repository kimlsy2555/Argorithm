
package sweaD2;

import java.util.Scanner;
import java.io.FileInputStream;
public class swea_1288 {

	public static void main(String[] args) {
		
		// [?] ���ο� �Ҹ��� ġ��� ***
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		int num = 0;
		String[] count = {"0","1","2","3","4","5","6","7","8","9"};
		int sheep = 0;
		for(int i = 1 ; i<= T; i++) {
			String[] sheepcount = new String [10];
			num = sc.nextInt();
			int j = 1;
			while(true) {
				sheep = num * j;
				
				// �ٽ� �ڵ�  �� ���ڸ� ������ ��ȯ�Ѵ�.
				// �� ���ڸ� ����  �� ���ڵ��� count[]�� ���Ѵ�
				String str = Integer.toString(sheep);
				String[] strArray = str.split(""); 
				
				for(String s : strArray) {
					// ���ؼ� ���� ������ sheepcount[]�� �ش簪�� ����.
					for(int k = 0; k < count.length; k++) {
						if(s.equals(count[k])) {
							sheepcount[k]=s;
						}
					}
				}
				j++;
				if(sheepcount[0] != null &&  sheepcount[1] != null &&  sheepcount[2] != null &&  sheepcount[3] != null &&  sheepcount[4] != null && 
				   sheepcount[5] != null &&  sheepcount[6] != null &&  sheepcount[7] != null &&  sheepcount[8] != null &&  sheepcount[9] != null)
				{
					System.out.println("#"+i+" "+sheep);
					break;
				}
			}
		}
	}
}
