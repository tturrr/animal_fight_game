package 애완동물탈출하기;

import java.util.Random;

public class 플레이어캐릭터 extends 캐릭터 {

	int hp = 250;
	int 공격력 = 5;
	String 이름 = "햄토리";
    int 돈 = 0;
	
	
	
	public void 체력회복하기() {
		
	}
	
	
	public void 해독하다() {
		
	}
	
	public void 무기를사다() {
		
	}
	
	public int 돈을얻다(int 플레이어돈, int 적돈) {
		System.out.println(this.이름+"가"+적돈+"원을 얻었습니다");
		돈 = 플레이어돈 + 적돈;
		return 돈;
	}
	

	public int 방어하기(int 체력, int 적공격력) {
	
			
		hp = 체력-적공격력;
		
		
		return hp;
	}

	public void 상태정보(int hp,int 공격력,int 돈 , String name) { 
		
		this.hp = this.hp;
		공격력 = this.공격력;
		돈 = this.돈;
		name = this.name;
		System.out.println("------------------");
		System.out.println("            "+name+"     ");
		System.out.println("      "+hp+"      ");
		System.out.println("       "+공격력+"     ");
		System.out.println("       "+돈+"      ");
	}


		
	}


