package �ֿϵ���Ż���ϱ�;

import java.util.Random;

public class �÷��̾�ĳ���� extends ĳ���� {

	int hp = 250;
	int ���ݷ� = 5;
	String �̸� = "���丮";
    int �� = 0;
	
	
	
	public void ü��ȸ���ϱ�() {
		
	}
	
	
	public void �ص��ϴ�() {
		
	}
	
	public void ���⸦���() {
		
	}
	
	public int �������(int �÷��̾, int ����) {
		System.out.println(this.�̸�+"��"+����+"���� ������ϴ�");
		�� = �÷��̾ + ����;
		return ��;
	}
	

	public int ����ϱ�(int ü��, int �����ݷ�) {
	
			
		hp = ü��-�����ݷ�;
		
		
		return hp;
	}

	public void ��������(int hp,int ���ݷ�,int �� , String name) { 
		
		this.hp = this.hp;
		���ݷ� = this.���ݷ�;
		�� = this.��;
		name = this.name;
		System.out.println("------------------");
		System.out.println("            "+name+"     ");
		System.out.println("      "+hp+"      ");
		System.out.println("       "+���ݷ�+"     ");
		System.out.println("       "+��+"      ");
	}


		
	}


