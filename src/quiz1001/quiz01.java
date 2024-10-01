package quiz1001;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int a,b,c,grade=0, money=0;
		String name=null, search=null;
		
		while(true) {
		System.out.println("====동아리====");
		System.out.println("1.신규회원 등록:");
		System.out.println("2.회원 별 회비 금액 확인: ");
		System.out.println("3.가입 회원 현황");
		System.out.print(">>>>>>");
		c=input.nextInt();
		switch(c) {
		case 1:
			System.out.print("신규 회원 이름: ");
			name = input.next();
			System.out.print("회원 등급 설정: ");
			grade = input.nextInt();
			System.out.print("회비 설정: ");
			money = input.nextInt();
			continue;
			
		case 2: 
			System.out.println("확인하고자 하는 회원 이름");
			System.out.print(">>>>>>");
			search = input.next();
			if(search.equals(name)) {
				System.out.println(name+"회원의 회비는 "+money+"원 입니다");
			continue;
			}else
				System.out.println("등록되지 않은 회원입니다");
			continue;
			
		case 3:
			if(name ==null || grade ==0|| money==0) {
				System.out.println("정보가 입력되지 않았습니다.");
			}
			
			System.out.println("회원명\t회원등급\t회비\t");
			System.out.println(name+"\t"+grade+"\t"+money+"\t");
			break;
			
			
		}
	
		}
	
	}
}
