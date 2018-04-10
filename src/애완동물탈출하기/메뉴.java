package 애완동물탈출하기;

import java.util.Scanner;

public class 메뉴 {
  
	Scanner sc= new Scanner(System.in);	
	public void 가방() {

	}
	
	
	public void 상점() {
		
		System.out.println("상점입니다.");
		System.out.println("1.무기 2.방어구 3.물약");
		int a = sc.nextInt();
		if(a==1) {
			
			System.out.println("무기를 골라주세요.");
			System.out.println("1.검 2.화살 3.총");
			int b = sc.nextInt();
			if(b==1 ) {
				System.out.println("검을 구매하였습니다.");
	
				}
			else if(b==2 ) {
				System.out.println("화살을 구매하였습니다.");
			}
		
		}
	}
}
