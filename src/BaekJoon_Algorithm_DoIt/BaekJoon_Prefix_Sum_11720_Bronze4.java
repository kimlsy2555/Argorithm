package BaekJoon_Algorithm_DoIt;


import java.util.Scanner;
public class BaekJoon_Prefix_Sum_11720_Bronze4 {
	// Main
	public static void main(String[] args) {
		
		// [?] 숫자의 합 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String sNum = sc.next();
		
		char[] cNum = sNum.toCharArray();
		
		int sum = 0;
		for(int i=0; i<cNum.length; i++) {
			sum +=  cNum[i] -'0' ; // char 형변환 
		}
		
		System.out.println(sum);
		
		
	}

}
