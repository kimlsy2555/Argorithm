
package sweaD1.copy;



public class swea_2027 {

	public static void main(String[] args) {
		
		// [?] �밢�� ����ϱ�
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<=i; j++){
				
				if(i==j) {
					System.out.print("#");
				}
				else{
					System.out.print("+");
				}
			}
			
			for(int j=4; j>i; j--){
				System.out.print("+");
			}
			
			System.out.println();
		}
		
	
	}

}
