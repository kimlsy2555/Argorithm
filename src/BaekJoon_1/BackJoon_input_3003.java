package BaekJoon_1;

import java.util.Scanner;
public class BackJoon_input_3003 {
	// Main
	public static void main(String[] args) {
		
		// [?] ŷ, ��, ��, ���, ����Ʈ, ��
		// ü���� �� 16���� �ǽ��� ����ϸ�, ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8���� �����Ǿ� �ִ�.
		Scanner sc = new Scanner(System.in);
		
		int king = 0;
		int Queen = 0;
		int Rook = 0;
		int Bishop = 0;
		int Night = 0;
		int Pawn = 0;
		
		king = sc.nextInt();
		Queen = sc.nextInt();
		Rook = sc.nextInt();
		Bishop = sc.nextInt();
		Night = sc.nextInt();
		Pawn = sc.nextInt();
		
		int king_count = 0;
		int Queen_count = 0;
		int Rook_count = 0;
		int Bishop_count = 0;
		int Night_count = 0;
		int Pawn_count = 0;
		
		while(king !=1 ) {
			if (king < 1) {
				king ++;
				king_count++;
			}
			else {
				king --;
				king_count--;
			}
			
		}
		
		
		while(Queen !=1 ) {
			if (Queen < 1) {
				Queen ++;
				Queen_count++;
			}
			else {
				Queen --;
				Queen_count--;
			}
			
		}
		
		while(Rook !=2 ) {
			if (Rook < 2) {
				Rook ++;
				Rook_count++;
			}
			else {
				Rook --;
				Rook_count--;
			}
			
		}
		
		while(Bishop !=2 ) {
			if (Bishop < 2) {
				Bishop ++;
				Bishop_count++;
			}
			else {
				Bishop --;
				Bishop_count--;
			}
			
		}
		
		while(Night !=2 ) {
			if (Night < 2) {
				Night ++;
				Night_count++;
			}
			else {
				Night --;
				Night_count--;
			}
			
		}
		
		while(Pawn !=8 ) {
			if (Pawn < 8) {
				Pawn ++;
				Pawn_count++;
			}
			else {
				Pawn --;
				Pawn_count--;
			}
		}
		
		System.out.println(king_count+" "+Queen_count+" "+Rook_count+" "+Bishop_count+" "+Night_count+" "+Pawn_count);
		
		
	
	}

}
