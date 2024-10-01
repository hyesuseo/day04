package quiz1001;

import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = null, rename = null;
		int number, renumber = 0; 
		
		while(true) {
		System.out.println("1. 예약확인");
		System.out.println("2. 예약");
		System.out.println("3. 나가기");
		int num = input.nextInt();
		if (num == 3) { //3입력하면 종료됨
			System.out.println("감사합니다. 테이블이 준비되면 문자로 안내해드리겠습니다.");
			break;
		}
		
		switch (num) {
		case 1 : //1입력하면 예약확인페이지 이동
			if (rename == null) {
				System.out.println("먼저 예약 해주세요.");
				continue;
			}else
			System.out.println("예약자 성함 확인 : "); //이름을 입력받고 예약자이름, 휴대폰 번호와 비교
			name = input.next();
			System.out.println("예약자 휴대폰 마지막 4자리 확인 : ");
			number = input.nextInt();
		if (name.equals(rename) && number==renumber){ //같으면 정상적으로 예약확인
			System.out.println(name + "님 환영합니다. 예약 확인되었습니다.");
		}else //다르면 다시 입력하도록 안내
			System.out.println("예약내역이 없습니다. 다시 확인해주세요");
		break;
		
		case 2 :
			System.out.println("예약자 성함 : "); //2입력하면 예약페이지 이동
			rename = input.next();
			System.out.println("휴대폰 마지막 4자리 : ");
			renumber = input.nextInt();
			System.out.println(rename+","+renumber+"\n예약 완료!!!"); //예약완료 안내
			break;
			}
		}
	}
}