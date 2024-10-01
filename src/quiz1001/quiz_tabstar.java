package quiz1001;

import java.util.Scanner;

public class quiz_tabstar {

	public static void main(String[] args) {
		int a,i,j,k;
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		
		for (i = 0; i < a; i++) {		//한 줄을 나타내므로, 계속 증가해야 한다++
            for (j = a - 1; j > i; j--) {// 공백은 입력한 숫자보다 -1만큼 출력해야 한다
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {	//공백 뒤 별은 입력해야할 줄 수만큼 하나씩 많아지게 출력
                System.out.print("*");;
            }
            System.out.println();
        }
		
	}

}
