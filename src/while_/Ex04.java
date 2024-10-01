package while_;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int i =0;
		boolean bool = true;
		while(bool) {
			i++;
			if (i==3) {
				//break;
				bool = false; //요렇게 쓰면 i=3까지 사용할 수 있음
			}
			System.out.println(i);
		}
		System.out.println("다음 문장들 실행");

		//문제를 풀기 위해서 필요한 기능: 문자열 비교기능
		// name1.equals(name2) : 값이 T F로 나온다
		Scanner sc = new Scanner (System.in);
		String name1, name2; 
		System.out.print("1.이름입력: ");
		name1 = sc.next();
		System.out.print("2.이름입력: ");
		name2 = sc.next();
		System.out.println("n1 == n2: "+ (name1 == name2));
		//==는 문자열은 비교 불가능, 숫자만 비교가능함!
		System.out.println("n1.equals(n2): "+ (name1.equals(name2) ));
		//equals쓸때는 어떤 문자를 먼저 쓰든 상관이 없다.
		if (name1.equals(name2)) {
			System.out.println("두 사람의 이름이 같다");
		}else {
			System.out.println("두 이름은 다르다");
		
			
			//null pointer exception error???
			
		String n1=null, n2="test"; //변수형,자료형이 대문자인 것만 .을 사용할 수 있음
		int n=0;
		// 단순 null값 비교는 ==를 사용해서 할 수 있다
		
		if (n2.equals(n1)) { //값이 있는 상태에서 써야한다
			System.out.println("같다");
		} else {
			System.out.println("n1, n2 다르다");
		}
		
		
		}
		
	}

}
