package BaekJoon_Algorithm_DoIt;


import java.util.Scanner;
public class BaekJoon_Greedy_1541_Silver2 {
	// Main
	static int answer = 0;
	public static void main(String[] args) {
		
		// [?] �Ҿ���� ��ȣ Silver2
		Scanner sc = new Scanner(System.in);
		
		String ex  = sc.nextLine();
		
		String[] str = ex.split("-");
		
		
		for(int i=0; i<str.length; i++) {
			int temp = mySum(str[i]);
			if(i==0)answer+= temp;
			else answer-=temp;
		}
		System.out.println(answer);
		
	}
	private static int mySum(String ex) {
		int sum = 0;
		// Exception in thread "main" java.util.regex.PatternSyntaxException: Dangling meta character '+' near index 0
		// split + �� �ν��� �߸��� [+] �ذ� 
		String[] temp = ex.split("[+]");
		for(int i=0; i<temp.length; i++) {
			sum += Integer.parseInt(temp[i]);
		}
		return sum;
	}

}
