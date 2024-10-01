package quiz1001;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {
		
		boolean run=true;
		String name= null, namein=null;
		int choice, phone=0, phonein=0;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("1. 예약확인");
			System.out.println("2. 예약");
			System.out.println("3. 나가기");
			System.out.print(">>>>");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				if(namein ==null || phonein ==0) {
					System.out.println("먼저 예약을 해주세요");
				}else { 					
					System.out.print("예약자 성함: ");
					name = sc.next();
					System.out.print("휴대폰 뒷 4자리 ");
					phone = sc.nextInt();
					
					if(namein.equals(name)&& phone ==phonein) {
						System.out.println("예약이 확인되었습니다.");break;}
				}break;		
			case 2: 
				System.out.print("예약자명: ");
				namein = sc.next();
				System.out.print("휴대폰 뒷 4자리: ");
				phonein = sc.nextInt();
				System.out.println("예약완료!"); break;
				
			case 3:
				System.out.println("감사합니다. 테이블이 준비되면 문자로 안내해 드리겠습니다");
				run=false;
				break;
			
			
			}
		}
		

	}

}
