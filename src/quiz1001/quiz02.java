package quiz1001;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0, j=0, choice=0, tel1=0, tel2=0, tel3=0, tel4=0, tel5=0;
		String name1=null, name2=null, name3=null, name4=null, name5=null;

		for(i=1; ; i++) {
			System.out.println("1.연락처");
			System.out.println("2.연락처 등록");
			System.out.println("3.종료");
			System.out.println(">>>>>");
			choice=sc.nextInt();
			switch(choice) {
			case 1: System.out.println("이름\t전화번호\t");
			for(int k =0 ; k<j; k++) {
				switch(k) {
				case 0: System.out.println(name1+"\t"+tel1+"\t"); break;
				case 1: System.out.println(name2+"\t"+tel2+"\t"); break;
				case 2: System.out.println(name3+"\t"+tel3+"\t"); break;
				case 3:	System.out.println(name4+"\t"+tel4+"\t"); break;
				case 4: System.out.println(name5+"\t"+tel5+"\t"); break;

				}
			}	break;


			case 2: switch(j) {
				case 0: System.out.print("이름"); 
				name1 = sc.next();
				System.out.print("연락처");
				tel1 = sc.nextInt();
				j++; break;
				case 1: System.out.print("이름"); 
				name2 = sc.next();
				System.out.print("연락처");
				tel2 = sc.nextInt();
				j++; break;
				case 2: System.out.print("이름"); 
				name3 = sc.next();
				System.out.print("연락처");
				tel3 = sc.nextInt();
				j++; break;
				case 3: System.out.print("이름"); 
				name4 = sc.next();
				System.out.print("연락처");
				tel4 = sc.nextInt();
				j++; break;
				case 4: System.out.print("이름"); 
				name5 = sc.next();
				System.out.print("연락처");
				tel5 = sc.nextInt();
				j++; break;

			}
			case 3: System.out.println("종료합니다"); return;



			} 

		}

	}

}
