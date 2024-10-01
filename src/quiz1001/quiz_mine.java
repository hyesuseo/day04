package quiz1001;

import java.util.Scanner;

public class quiz_mine {

	public static void main(String[] args) {
		int a, i, j, k, l; //필요한 변수를 모두 선언합니다
		//증가하는 별모양과 감소하는 별 모양을 따로 떼어서 생각하면 됩니다.
		//a개만큼 증가하는 줄을 만들고
		//a-1개만큼 감소하는 줄을 만듭니다.
		
		Scanner sc = new Scanner (System.in);
		a =sc.nextInt(); 	//a의 값을 입력받습니다.
		
		//첫번째: 증가하는 별 만들기
		for (i=1; i<=a; i++) { //a개 줄까지 만들어야 하므로 i<=a로 설정해줍니다
			for (j=1; j<=i; j++) { //j=1로 두고, j가 입력받은 수만큼 커질때까지 반복하여 *를 출력합니다
				System.out.print("*");
			}System.out.println(); //각 순환마다 줄 띄움이 될 수 있게 입력해줍니다.
		}	
		//두번째: 감소하는 별모양 만들기
		for (k = 1; k<a; k++) { //a-1줄을 만들어야 하므로 k<a로 설정해줍니다
			for (l = a; l>k; l--) { //l=a로 두고 l이 k보다 작아질때까지 반복하여 *를 출력합니다.
				System.out.print("*");
			}System.out.println(); //각 순환마다 줄 띄움이 될 수 있게 입력해줍니다.
		}

	}

}

