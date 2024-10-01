package while_;

public class Ex06 {
	public static void main(String[] args) {
// 이런식으로 보면 흐름이 잘 보이는 것 같다.

		
		for(int k = 0; k<3; k++) {
			System.out.println("---상위반복 시작");
			for(int i =0;i<3; i++) {
				System.out.println(i+".하위 for");
			}
			System.out.println(k+"상위반복 끝---");
		}
		System.out.println("-------------------------");
		System.out.println("구구단 출력하기");
		
		for (int i = 1; i<=9; i++) {
			for (int k=1; k<=9; k++) {
				System.out.println(i +" * "+ k+" = "+ i*k);
				
			} System.out.println("-------------------");
		}

	}

}
