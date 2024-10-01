package quiz1001;

import java.util.Scanner;

public class quiz05 {
	public static void main (String args[]) {
		
		int money=0, menu=0, moneyin=0;
		Scanner sc=new Scanner(System.in);
		boolean run = true;
		System.out.print("돈을 넣어주세요: ");
		money=sc.nextInt();
		moneyin = money+ moneyin;
		System.out.println(""); 
		while(run) {
			System.out.println("---------------MENU----------------");
			System.out.println("1. 콜라\t300");
			System.out.println("2. 사이다\t300");
			System.out.println("3. 커피\t200");
			System.out.println("4. 돈 넣기\t");
			System.out.println("5. 잔돈 반환\t");
			System.out.println("6. 종료");
			System.out.println("-----------------------------------");
			System.out.println("현재 금액: "+moneyin);
			System.out.print("메뉴선택: ");
				menu=sc.nextInt(); 
				
			
		 switch(menu) {
		 case 1: 
			moneyin -= 300;
			System.out.println("현재 금액: "+moneyin);
			System.out.println("콜라 맛있게 드세요");
			
			System.out.println("");break;
			
		 case 2: 
			 moneyin -= 300;
			 	System.out.println("현재 금액: "+moneyin);
				System.out.println("사이다 맛있게 드세요");
				
				System.out.println("");break;
		 case 3: 
			 moneyin -= 200;	
			 System.out.println("현재 금액: "+moneyin);
				System.out.println("커피 맛있게 드세요");
				
				System.out.println("");break;
		 case 4: 
			 	System.out.println("현재 잔액: " +moneyin);
				System.out.println("금액을 입력해주세요: ");
				System.out.println("");break;
				
		 case 5: 
			 
				System.out.println("현재 잔액: " +moneyin+ "이 반환됩니다.");
				System.out.println("");
				run=false; break;
		 case 6: 
			 
				System.out.print("시스템 종료합니다.");
				run= false;
				System.out.println("");break;
				
				
		 }
		
		
		}
		
		
	
	
	
	}
}
