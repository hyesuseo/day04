package quiz1001;

import java.util.Scanner;

public class quiz04 {
	public static void main (String []args) {

		Scanner sc=new Scanner(System.in);
	String oper=null, plus="+", min="-", mul="*", div="/";
	boolean run = true;
	int A,B;
	while(run) {
		System.out.println("덧셈: +");	
		System.out.println("뺄셈: -");	
		System.out.println("곱셈: *");	
		System.out.println("나눗셈: /");	
		System.out.println("종료: x");	
		System.out.print("해당되는 연산자를 입력하시오: ");
		oper=sc.next();
		
		switch(oper) 
		{
		case "+": System.out.println("A + B : 덧셈");
		System.out.print("A를 입력하시오:");
		A=sc.nextInt();
		System.out.print("B를 입력하시오:");
		B=sc.nextInt();
		System.out.println("A + B :"+ (A+B) );
		System.out.println("----------------");
		break;
		
		case "-": 
		System.out.println("A - B : 뺄셈");
		System.out.print("A를 입력하시오:");
		A=sc.nextInt();
		System.out.print("B를 입력하시오:");
		B=sc.nextInt();
		System.out.println("A - B :"+ (A-B) );
		System.out.println("----------------");
		break;
		
		case "*": 
			System.out.println("A * B : 곱셈");
			System.out.print("A를 입력하시오:");
			A=sc.nextInt();
			System.out.print("B를 입력하시오:");
			B=sc.nextInt();
			System.out.println("A + B :"+ (A*B) );
			System.out.println("----------------");
			break;
			
		case "/": 
			System.out.println("A / B : 나눗셈");
			System.out.print("A를 입력하시오:");
			A=sc.nextInt();
			System.out.print("B를 입력하시오:");
			B=sc.nextInt();
			System.out.println("A / B :"+ (A/B) );
			System.out.println("----------------");
			break;
		
		case "x":
			System.out.println("이용해주셔서 감사합니다");
			run=false;
			break;
		
		
		}
		
	
	
	}
	
		
		
		
		
	}
}



