package �ֿϵ���Ż���ϱ�;

import java.util.Random;
import java.util.Scanner;

public class ��ŸƮ {


	

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		�÷��̾�ĳ���� ���丮 = new �÷��̾�ĳ����(); 
		���� ���� = new ����();
		�޴� �޴� = new �޴�();
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		
		System.out.println("�ȳ��ϼ��� ������ �����մϴ�.�޴� ȭ�� �Դϴ�.");
		System.out.println("1.�������� 2.�κ��丮 3.���� 4.����");
		int a =sc.nextInt();

		
			
			
		for(;;) {
			if(a == 1) {
				���丮.��������(���丮.hp, ���丮.���ݷ�,���丮.��,���丮.�̸�);
			break;
			}
			if(a == 4) {
			����.�����̵��ϱ�();
			���Ź� �Ź� = new ���Ź�();
			
			int b = sc.nextInt();
				while(�Ź�.hp>0) {
				 if(�Ź�.hp<=0) {
					 break;
				 }
					if(b==1) {
					System.out.println("�Ź̰� ������ �մϴ�.");
					���丮.����ϱ�(���丮.hp,�Ź�.���ݷ�);
					
					System.out.println("���丮�� hp : "+���丮.hp);
					System.out.println("------------------");
					System.out.println("���丮�� ������ �մϴ�.");
					�Ź�.����ϱ�(�Ź�.hp, ���丮.���ݷ�);
					System.out.println("�Ź��� hp : "+�Ź�.hp);
					}
					
					if(b==2) {
						System.out.println("--�ڷε��� ���ϴ�.---"); 
					break;
					}			
				}//While End
			}
	    } //for End 
	}
	
	
	public void ����() {
		
	}
}
					
		
		
					
	
									
														
		
