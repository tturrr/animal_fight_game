package 애완동물탈출하기;

import java.util.Scanner;

public class 게임 {
		
		플레이어캐릭터 햄토리 = new 플레이어캐릭터();
		Scanner sc = new Scanner(System.in);
	
		public void game() {
		
		
		System.out.println("게임을 시작하다.");
		System.out.println("-----------");
		System.out.println("1.정보 2.던전");
		int a = sc.nextInt();
		
		if(a==1) {
			System.out.println("-----정보창----");
			System.out.println(햄토리.hp);
		
		
		}
		
		
	}
	
	
	
	
}
