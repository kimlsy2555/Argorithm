package BaekJoon_Algorithm_DoIt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BaekJoon_Stack_17298_Gold4 {
	// Main
	public static void main(String[] args)throws Exception {
		
		// [?] ��ū��
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int A[] = new int[n];
		int ans[] = new int[n];
		String[] str = bf.readLine().split(" ");
		for(int i=0; i<n; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(0);
		
		for(int i=0; i<n; i++) {
			while(!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				
				ans[myStack.pop()] = A[i];
			}
			myStack.push(i);

		}
		while(!myStack.empty()) {
		
			ans[myStack.pop()] =-1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0; i<n; i++) {
			bw.write(ans[i] +" ");
		}
		bw.write("\n");
		bw.flush();
		
	}

}
