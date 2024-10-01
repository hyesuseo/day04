package while_;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//continue는 반복문 안에서만 사용가능
		int i = 0;
		while(i<5) {
			i++;
			if(i==3) {
				System.out.println(3333333);
				//break; //여기 break가 들어가면 i==3에서 멈추게 됨!
				continue; //continue가 들어가면 i: 3의 실행이 안된다!
			}
		System.out.println("i: "+i);
		}
	System.out.println("다음 문장들 실행");

	//continue를 언제 사용하는가?
	System.out.println("--------------------");
	Scanner input=new Scanner(System.in);
	int num, sum=0;
	
	while(true) {
		System.out.print("1~10 사이 수 입력: ");
		num = input.nextInt();
		if (num>0 && num<=10) {
			break; //정확히 입력을 받으면 반복문을 빠져나온다
		} else if(num <=0 || num>10) {
			System.out.println("범위를 벗어남. 다시 입력");
			continue; // 이렇게 컨틴뉴를 써주면 된다.
		}
		
	}
	
	for (i = 1; i <=num; i++) {
		sum +=i;
	}System.out.println("1~ "+num+"까지의 합: "+sum);
	
	
	}

}
