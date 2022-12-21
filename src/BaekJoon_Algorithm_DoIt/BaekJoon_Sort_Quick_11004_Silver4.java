package BaekJoon_Algorithm_DoIt;



import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class BaekJoon_Sort_Quick_11004_Silver4 {
	// Main
	public static void main(String[] args) throws Exception {
		
		// [?] K��° �� ���ϱ�
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(in.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int K = Integer.parseInt(st.nextToken());
	    st = new StringTokenizer(in.readLine());
	    int[] A = new int[N];
	    for (int i = 0; i < N; i++) {
	      A[i] = Integer.parseInt(st.nextToken());
	    }
	    quickSort(A, 0, N - 1,  K - 1);
	    System.out.println(A[K - 1]);
	  }
	  public static void quickSort(int[] A, int S, int E, int K) {
	      if(S<E){
	      int pivot = partition(A, S, E);
	      if (pivot == K) { //K��° ���� pivot�̸� ���̻� ���� �ʿ� ����
	        return;
	      }
	      else if(K < pivot) {  //K�� pivot���� ������ ���ʸ� ����
	        quickSort(A, S, pivot - 1, K);
	      }
	      else if(K > pivot){  //K�� pivot���� ũ�� ���ʸ� ����
	        quickSort(A, pivot+1, E, K);
	      }
	          }
	  }

	  private static int partition(int[] A, int S, int E){
	    if(S+1==E) {
	      if(A[S]>A[E])swap(A,S,E);
	      return E;
	    }
	    int M = (S + E) / 2;
	    swap(A, S, M); // �߾Ӱ��� 1��° ��ҷ� �̵��ϱ�
	    int pivot = A[S];
	    int i = S+1, j = E;
	    
	    while (i <= j) {
	        while (pivot < A[j] && j > 0 ){   //�ǹ����� ���� ���� ���ö����� j--
	            j--;    
	        }
	        while (pivot > A[i]  && i <A.length-1){  //�ǹ����� ū ���� ���� ������ i++
	               i ++;  
	        }
	        if (i <= j) {
	            swap (A, i++, j--);  // ã�� i�� j�� ��ȯ�ϱ�
	        }
	    }
	    // i == j �ǹ��� ���� �������� �и��� ����� ������ �����ϱ�
	    A[S] = A[j];
	    A[j] = pivot;
	    return j;
	}
	  
	  public static void swap(int[] A, int i, int j) {
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	  }
	}