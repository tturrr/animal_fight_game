package 애완동물탈출하기;

public class 독거미  extends 곤충{

	int hp = 30;
	int 돈 = 10;
	int 다리 = 8;
	String 이름 = "독거미";
	int 공격력 = 10;
	
	
	public void 독묻히기() {
		
	}

	public int 방어하기(int 체력, int 적공격력) {
	
			
		hp = 체력-적공격력;
		
		
		return hp;
	
	}
}
