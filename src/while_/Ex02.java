package while_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int i =0;
		while(true) {
			if(i==3) {
				break; //반복문 빠져나올 때 사용 break
			}
			System.out.println(i++);
			
		}
		System.out.println("다음 문장들 실행");

		for ( ;/*여기에 조건식 없으면 true임, 혹은 true넣어도 ok*/ ; ) {
			System.out.println("for + "+ i++);
			if (i == 10) {
				break; //현재 종속되어있는 위치 하나만 빠져나옴
			}
		}
		System.out.println("다음문장 실행");
		//무한 반복문 뒤에 문장을 넣으면 문법적 오류가 발생한다. 
		//실행할 수가 없으니까..ㅠㅠ
		//break로 빠져나올 수 있는 방법이 생기면 에러가 사라짐!
		
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 종료");
			num = input.nextInt();
			switch(num) {
				case 1: System.out.println("입력기능입니다"); break;
				default: System.out.println("종료합니다"); break;
				// switch문만 빠져나오는 것
				//while문을 빠져나오는 것은 아니어서 while문은 반복됨!
			}
			System.out.println("switch문 밖의 문장");
			if (num==2) {
				break;
				}// 지금까지 배운 방식으로는 아래에 if문장을 다시 써줘서 끝내면 됨!
			}
		}

}
