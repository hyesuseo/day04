package while_;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		
		int choice=0;
		String id = null, pw= null, idi= null, pwi=null;
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 나가기");
		System.out.print(">>>");
		choice = sc.nextInt();
		
			 if(choice ==1) { //2번 실행 후에 1번을 실행하면 2번에 있는 저장된 값이 사용된다
				 System.out.print("아이디 입력: ");
				 id = sc.next();
				 System.out.print("패스워드 입력: ");
				 pw = sc.next();
				 if (id.equals(idi) && pw.equals(pwi)) {
					 System.out.println("인증되었습니다");
				 }
				 else if (id==null && pw ==null)
					 System.out.println("인증실패!!");
				 else { System.out.println("인증실패!!");
					 	}
				 
			 } else if (choice ==2) {
				 System.out.print("저장할 아이디 입력: ");
				 idi = sc.next(); // idi와 pwi를 따로 입력받아야 while문 안에서 저장이 됨!
				 System.out.print("저장할 패스워드 입력: ");
				 pwi = sc.next();
				 System.out.println("가입완료!");
				 
			 } else if (choice ==3){
				 break;
			 }
		
		
		}
	}

}
