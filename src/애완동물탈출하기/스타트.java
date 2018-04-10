package 애완동물탈출하기;

import java.util.Random;
import java.util.Scanner;

public class 스타트 {


	

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		플레이어캐릭터 햄토리 = new 플레이어캐릭터(); 
		던전 던전 = new 던전();
		메뉴 메뉴 = new 메뉴();
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		System.out.println("안녕하세요 게임을 시작합니다.메뉴 화면 입니다.");
		System.out.println("1.상태정보 2.인벤토리 3.상점 4.던전");
		int a =sc.nextInt();

		
			
			
		for(;;) {
			if(a == 1) {
				햄토리.상태정보(햄토리.hp, 햄토리.공격력,햄토리.돈,햄토리.이름);
			break;
			}
			if(a == 4) {
			던전.던전이동하기();
			독거미 거미 = new 독거미();
			
			int b = sc.nextInt();
				while(거미.hp>0) {
				 if(거미.hp<=0) {
					 break;
				 }
					if(b==1) {
					System.out.println("거미가 공격을 합니다.");
					햄토리.방어하기(햄토리.hp,거미.공격력);
					
					System.out.println("햄토리의 hp : "+햄토리.hp);
					System.out.println("------------------");
					System.out.println("햄토리가 공격을 합니다.");
					거미.방어하기(거미.hp, 햄토리.공격력);
					System.out.println("거미의 hp : "+거미.hp);
					}
					
					if(b==2) {
						System.out.println("--뒤로돌아 갑니다.---"); 
					break;
					}			
				}//While End
			}
	    } //for End 
	}
	
	
	public void 리턴() {
		
	}
}
					
		
		
					
	
									
														
		
