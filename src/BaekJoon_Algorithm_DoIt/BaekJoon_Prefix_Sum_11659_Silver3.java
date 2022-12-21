package BaekJoon_Algorithm_DoIt;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BaekJoon_Prefix_Sum_11659_Silver3 {
	// Main
	public static void main(String[] args) throws IOException {
		
		// [?] ���� �� ���ϱ� 4
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer  = new StringTokenizer(bufferedReader.readLine());
		
		int SuNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo =  Integer.parseInt(stringTokenizer.nextToken());
		long[] S = new long[SuNo+1];
		
		stringTokenizer  = new StringTokenizer(bufferedReader.readLine());

		for(int i=1; i<= SuNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int q=0; q<quizNo; q++) {
		 stringTokenizer  = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i-1]);
			
			
		}
	}
}
