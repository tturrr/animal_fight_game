package 애완동물탈출하기;

public class 바퀴벌레  extends 곤충{

	int hp = 50;
	int 돈 = 30;
	int 다리 = 6;
	String 이름 = "독거미";
	int 공격력 = 15;
	
	
	public void 끈질긴생명력() {
		
		hp = hp+hp;
		
	}

	public int 주먹지르기(int hp, int 적공격력) {
	
			
		hp = hp-적공격력;
		
		
		return hp;
	}
}
