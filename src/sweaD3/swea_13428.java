
package sweaD3;

import java.util.Scanner;
public class swea_13428 {

	public static void main(String[] args) {
		
		// [?] ���� ����
		
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T=sc.nextInt();
		
		
		for(int TC = 1 ; TC<= T; TC++) {
			int N = 0;
			N = sc.nextInt();
			int store = N;
			// �ڸ��� ����
	        int count=0;	
	        while(true){
	            if(N == 0){
	                break;
	            }
	            N /= 10;	
	          
	            count++;	
	        }
	       // �ش簪�� �� �ڸ������� �ɰ���
	       int[] maxnum = new int [count];
	       int[] minnum = new int [count];
	       String str = "";
	        count=0;	
	        while(true){
	            if(store == 0){
	                break;
	            }
	            maxnum[count] = store % 10;
	            minnum[count] = store % 10;
	            store /= 10;	
	            count++;	
	        }
	        
	        
	        // �ִ밪 �����
	        int max = maxnum[0];
	        int maxcount = 0;
	        int temp = 0;
	        for(int i = maxnum.length-1; i >= 0;  i--) {
	        	if(max < maxnum[i]) {
	        		max = maxnum[i];
	        		maxcount = i;
	        	}
	        }
	      
	        // ��ġ ����Ī �ϱ� �ִ밪 �ִ� �ڸ����� ����Ī
	       	temp = maxnum[maxnum.length-1];
	       	maxnum[maxnum.length-1] = maxnum[maxcount];
	       	maxnum[maxcount] = temp;
	       
	        for(int i = maxnum.length-1; i >= 0;i--) {
	        	str += Integer.valueOf(maxnum[i]);
	        }
	        max =  Integer.parseInt(str);
	        

	        // �ּҰ� �����
	        str = "";
	        int min = minnum[0];
	        int mincount = 0;
	        temp = 0;

	        
	        // �ּҰ� ����Ī�� ����
	        // 1. ù �ּ��ڸ��� 1�� �ƴҶ� ���� ���� 
	        // 2. ����ü������ �ּҰ��϶�
	        // 3. �� ���ڸ��� 0�� ��� �� �� ����
	        // 4. ù �ּ��ڸ��� 1�϶� 
	        // ��ġ ����Ī �ϱ� �ּҰ� �ּ� �ڸ����� ����Ī
	        
	        // 1. ù �ּ��ڸ��� 1�� �ƴҶ� ���� ���� 
	        if((minnum[(minnum.length-1)])!=1) {
	        	
		        for(int i = minnum.length-1; i >= 0;  i--) {
		        	if(min > minnum[i]) {
		        		min = minnum[i];
		        		mincount = i;
		        	}
		        }
	        	
	        	temp = minnum[minnum.length-1];
		       	minnum[minnum.length-1] = minnum[mincount];
		       	minnum[mincount] = temp;
		       
		        for(int i = minnum.length-1; i >= 0;i--) {
		        
		        	str += (minnum[i]);
		        }
		        
		        min =  Integer.parseInt(str);
		        //System.out.println("�ּҰ� : "+min);
	        }
	        // ù �ּ� �ڸ��� 1�϶�
	        else if((minnum[(minnum.length-1)])==1) {
		        mincount = 0;
		        temp = 0;
		        for(int i = minnum.length-1; i >= 0;i--) {
		        	if(minnum[i] > 1 && min > minnum[i]) {
		        		min = minnum[i];
		        		mincount = i;
		        	}
		        }

			        for(int i = minnum.length-1; i >= 0;i--) {
			        	if(min < minnum[i]) {
			        		temp = minnum[i];
			        		minnum[i] = min;
			        		minnum[mincount] = temp;
			        		break;
			        	}
			        }

			        for(int j = minnum.length-1; j >= 0;j--) {
			        	str += (minnum[j]);
			        }
			        System.out.println(str);
			        min =  Integer.parseInt(str);
			        //System.out.println("�ּҰ� : "+min);

		        }
	        
	        System.out.println("#"+TC+" "+min+" "+max);
	        }

	        
		}
		
	
	}


