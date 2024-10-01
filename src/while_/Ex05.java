package while_;

public class Ex05 {

	public static void main(String[] args) {
	// do while 많이 사용되지는 않음
		
		int su= 5, i=1;
		do { //조건식이 밑에 있으므로 일단 한 번은 실행하게 된다.
			System.out.println("do while : "+i);
			i++;
		} while(i<su); //5<10이 아니므로 거짓!
		
		System.out.println("do while과 while의 비교=======");
		
		
		while(i<su) { //조건식이 거짓이면 실행이 안된다
			System.out.println("do while : "+i);
			i++;
		}  //10이 5보다 작다면 참이다

	}

}
