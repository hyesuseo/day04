package quiz1001;
import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		boolean shopping = true;
		String fruit = null;
		int apple=0, banana=0,peach=0,grape=0, money=10000,qua=0;
		//상품 목록, 쇼핑 카트, 계산에 쓸 변수를 초기화했습니다.
		//과일의 변수 이름은 과일의 수량(예를 들어 apple은 사과의 수량), qua는 임시 수량을 의미합니다.(번역기로 quantity래서...) 그외의 변수는 이름과 비슷한 역할입니다.
		
		int paidapple=0, paidbanana=0,paidpeach=0,paidgrape=0, paidmoney=0, paidcost=(paidapple*3000+paidbanana*6000+paidgrape*4000+paidpeach*2000);
		//결제 내역에서 쓸 변수도 미리 초기화해뒀습니다.
	
		Scanner input = new Scanner(System.in);
		
		while (shopping) {
			
			int cost=(apple*3000+banana*6000+grape*4000+peach*2000);
			
			
			//기본 메뉴
			
			
			System.out.println("\t\t[청과점]");
			System.out.println("\t\t\t소지금 : "+money+"원");
			System.out.println("=================================");
			System.out.println("[1] 상품 목록");
			System.out.println("[2] 쇼핑 카트");
			System.out.println("[3] 계산");
			System.out.println("[4] 결제 내역");
			System.out.println("[5] 종료");
			
			int menu= input.nextInt();
		
			switch (menu) {
			case 1:{ //상품 목록을 보는 곳입니다.
				while (true) {
					System.out.println("\t\t[상품 목록]");
					System.out.println("");
					System.out.println("품목\t\t가격");
					System.out.println("=================================");
					System.out.println("[1]사과\t\t3000원");
					System.out.println("[2]바나나\t\t6000원");
					System.out.println("[3]포도\t\t4000원");
					System.out.println("[4]복숭아\t\t2000원");
					System.out.println("");
					System.out.println("[0]종료");
					System.out.println("");
					//Dictionary와 for문을 사용하면 주문 내역이나 상품 목록을 좀 더 깔끔하게 다룰 수 있을 것 같습니다. (아직 안 배움)
					
					System.out.println("주문하실 번호 혹은 상품 이름을 입력해주세요.");
					System.out.print(">>>");
					fruit = input.next(); //번호만 입력해도 되겠지만, 오늘 eqauls를 배웠으니 거 상품 이름도 인식할 수 있게 해봤습니다!
	
					if (fruit.equals("종료")||fruit.equals("0")){ //상품 목록을 나갑니다.
						System.out.println("");
						System.out.println("");
						System.out.println("");			
						break;}
					while (true)
						if (fruit.equals("사과")||fruit.equals("1")||fruit.equals("바나나")||fruit.equals("2")||fruit.equals("포도")||fruit.equals("3")||
								fruit.equals("복숭아")||fruit.equals("4"))
							break;
						else{
							System.err.println("상품을 다시 입력해주세요.");
							System.out.print(">>>");
							fruit = input.next();}
					
					
					
					System.out.println("구매를 원하시는 수량을 입력해주세요.");
					System.out.print(">>>");
					qua = input.nextInt();
					
					while (qua<=0) {
						System.err.println("1개 이하는 구매할 수 없습니다!");
						//물건을 -1개나 0개 살 수 없으므로 제한을 걸어뒀습니다.
						System.out.print(">>>");
						qua = input.nextInt();}
					
					if (fruit.equals("사과")||fruit.equals("1")) {
						apple+=qua;
						System.out.println("현재 사과 "+apple+"알이 쇼핑 카트에 있습니다.");
					}
					else if (fruit.equals("바나나")||fruit.equals("2")) {
						banana+=qua;
						System.out.println("현재 바나나 "+banana+"송이가 쇼핑 카트에 있습니다.");
					}
					else if (fruit.equals("포도")||fruit.equals("3")) {
						grape+=qua;
						System.out.println("현재 포도 "+grape+"송이가 쇼핑 카트에 있습니다.");
					}
					else if (fruit.equals("복숭아")||fruit.equals("4")) {
						peach+=qua;
						System.out.println("현재 복숭아 "+peach+"알이 쇼핑 카트에 있습니다.");
					}
					//아까 말했던 Dictionary를 쓰면 더 깔끔하게 줄일 수 있을 것 같습니다. Dictionary를 쓸 줄 아시는 분이면 활용해보셔도 좋을 것 같습니다.
					//다만 python에서 배운 개념이라 자바에서도 똑같이 될지는 모르겠네요...
					
					
					
				
				}

					
				break;}
				
				
			case 2:{
				System.out.println("\t\t[쇼핑 카트]");
				System.out.println("");
				System.out.println("품목\t수량\t\t가격");
				System.out.println("=================================");
				
				if (apple+banana+grape+peach==0){ //아직 물건을 고른 적 없다면 이 내용이 실행됩니다.
					System.out.println("");
					System.out.println("");
					System.out.println("\t아직 담은 과일이 없습니다.");
					System.out.println("");
					System.out.println("");
					break;}
				
				if (apple>=1) {
					System.out.println("사과\t"+apple+"\t\t"+(apple*3000)+"원");}
				if (banana>=1) {
					System.out.println("바나나\t"+banana+"\t\t"+(banana*6000)+"원");}
				
				if (grape>=1) {
					System.out.println("포도\t"+grape+"\t\t"+(grape*4000)+"원");}

				if (peach>=1) {
					System.out.println("복숭아\t"+peach+"\t\t"+(peach*2000)+"원");}
				
				//내가 카트에 담은 물건만 표시될 수 있게 이렇게 작성했습니다.
				
				System.out.println("=================================");
				System.out.println("결제 금액\t\t\t"+cost+"원");
				System.out.println("소지 금액\t\t\t"+money+"원");
				System.out.println("반환 금액\t\t\t"+(money-cost)+"원");
				System.out.println("=================================");

				//가격을 예상할 수 있습니다. 생각해보니까 계산이랑 쇼핑 카트는 합쳐도 괜찮을 거 같아요...ㅎㅎ

				System.out.println("");
				System.out.println("");
				break;}

			case 3:{
				System.out.println("\t\t[계산]");
				System.out.println("");
				System.out.println("품목\t수량\t\t가격");
				System.out.println("=================================");
				
				if (apple+banana+grape+peach==0){
					System.out.println("");
					System.out.println("");
					System.out.println("\t아직 담은 과일이 없습니다.");
					System.out.println("");
					System.out.println("");
					break;}
					
				if (apple>=1) { //품목의 수량 * 개당 가격을 하면 품목의 총 금액이 나오겠죠.
					System.out.println("사과\t"+apple+"\t\t"+(apple*3000)+"원");}
				if (banana>=1) {
					System.out.println("바나나\t"+banana+"\t\t"+(banana*6000)+"원");}
				
				if (grape>=1) {
					System.out.println("포도\t"+grape+"\t\t"+(grape*4000)+"원");}

				if (peach>=1) {
					System.out.println("복숭아\t"+peach+"\t\t"+(peach*2000)+"원");}
				
				
				System.out.println("=================================");
				System.out.println("결제 금액\t\t\t"+cost+"원"); 
				//cost는 모든 금액을 합쳐놓은 변수로, 16줄에 따로 초기화해뒀습니다.
				//정확한 이유는 모르지만 아마 매번 금액이 변하니까 최상위 반복문(while)이 한번 돌아갈 때마다 설정을 해줘야하는 것 같습니다.
				System.out.println("소지 금액\t\t\t"+money+"원");
				System.out.println("반환 금액\t\t\t"+(money-cost)+"원");
				System.out.println("=================================");
				System.out.println("");
				
				if (money<=cost) {			//소지금보다 결제 금액이 높으면 이 내용이 실행됩니다.
					System.err.println("결제 금액이 "+(cost-money)+"원 부족합니다!");
					System.err.println("연결된 계좌에서 만원 단위로 자동 충전되며, 남은 돈이 반환됩니다.");} 
				
				System.out.println("");
				System.out.println("[1] 계산");
				System.out.println("[2] 변경");
				System.out.println("[3] 종료");
				System.out.println("");
				System.out.print(">>>");
				menu=input.nextInt();
				
				switch (menu) {
				case 1:{
					System.out.println();
					System.out.println("결제가 완료되었습니다.");
					
					if (money<=cost) { //만약 소지금보다 결제 금액이 높으면, 충분해질 때까지 소지금에 1만원을 더한다는 내용입니다.
						int i=0;
						for(;money<=cost;i++)
							money+=10000;
						System.out.println();
						System.out.println((i*10000)+"원이 자동결제 되었습니다.");} //그리고 결제가 끝나면 얼마가 자동 결제 되었는지 알려줍니다.
					
					//기껏 구매했는데 물건이 아직 쇼핑 카트에 들어있으면 이상하므로 결제 내역에 표시될 값들은 미리 만들어둔 paid~~ 변수에 넣고 값을 0으로 초기화합니다.
					paidmoney=money;
					paidcost=cost;
					money-=cost;
					
					paidapple=apple;	
					paidbanana=banana;
					paidgrape=grape;
					paidpeach=peach;
					
					apple=banana=grape=peach=cost=0; //다 0이니까 그냥 한꺼번에 0으로 초기화했어요...ㅎㅎ
					
					
					
					System.out.println("영수증은 결제 내역을 확인해주세요."); //결제 내역을 확인하고 싶은 손님한테 안내하는 문구
					System.out.println();
					System.out.println();
					break;
					}
					
					
				case 2:{ //수량을 수정할 수 있는 내용입니다.

					while (true){
						System.out.println("바꾸고 싶은 품목을 입력해주세요.");
						System.out.print(">>>");
						fruit=input.next();
						System.out.println("추가하거나 빼고 싶은 갯수를 입력해주세요.");
						System.out.println("(빼는 경우는 앞에 - 기호를 붙여주세요.)");
						System.out.print(">>>");
						qua=input.nextInt();
						System.out.println("");
						
						if (fruit.equals("사과")&& apple+qua>=0) { 
							//입력한 품목이 사과이고, 현재의 품목과 변경하고 싶은 수량을 계산했을 때, 수량이 0보다 크거나 같을 때 true가 되는 내용입니다.
							//품목을 삭제할 때 정확한 숫자를 입력하기 귀찮다면 apple+qua>=0 부분을 빼도 괜찮습니다.
							//다만 그럴 경우 apple+qua가 음수일 경우 apple을 0으로 설정해주는 내용을 넣어야 사과 -3개 같은 상황이 일어나지 않습니다.
							apple+=qua;
							break;
						}
						else if (fruit.equals("바나나")&&banana+qua>=0) {
							banana+=qua;
							break;
						}
						else if (fruit.equals("포도")&&grape+qua>=0) {
							grape+=qua;
							break;
						}
						else if (fruit.equals("복숭아")&&peach+qua>=0) {
							peach+=qua;
							break;
						}
						System.out.println("입력하신 품목이 쇼핑카트에 없거나, 쇼핑 카트 안에 있는 품목이 입력하신 수량보다 적습니다.");}
						//발생할 수 있는 오류 두개를 구분하기 귀찮아서 합쳤는데, 이렇게 되면 품목은 제대로 썼는데 수량 잘못 써서 다시 품목부터 해야하는 경우도 생겨서
						//분리하게 된다면 사용자 입장에서는 편할 수도 있겠습니다. (확신 X)
						System.out.println();
					
					break;}
					
				
				default:
					break;
				}
				break;}
			
			
			case 4:{
				System.err.println("최신 결제 내역의 1건만 표시됩니다."); 
				//지금 배운 것만 가지고 과거의 내역을 모두 볼 수 있게 하려면 변수가 너무 많이 필요하는 바람에... 가장 마지막 내역 하나만 볼 수 있게 헸습니다.
				System.out.println("");
				
				System.out.println("\t\t[결제 내역]");
				System.out.println("품목\t수량\t\t가격");
				System.out.println("=================================");
				if (paidcost==0){
					System.out.println("");
					System.out.println("");
					System.out.println("\t결제 내역이 없습니다.");
					System.out.println("");
					System.out.println("");
					}
				else { //205~ 215줄에서 설정한 paid~~ 변수를 여기서 활용합니다.
					if (paidapple>=1) {
						System.out.println("사과\t"+paidapple+"\t\t"+(paidapple*3000)+"원");}
					if (paidbanana>=1) {
						System.out.println("바나나\t"+paidbanana+"\t\t"+(paidbanana*6000)+"원");}
					
					if (paidgrape>=1) {
						System.out.println("포도\t"+paidgrape+"\t\t"+(paidgrape*4000)+"원");}

					if (paidpeach>=1) {
						System.out.println("복숭아\t"+paidpeach+"\t\t"+(paidpeach*2000)+"원");}
				

					System.out.println("=================================");
					System.out.println("결제 금액\t\t\t"+paidcost+"원");
					System.out.println("소지 금액\t\t\t"+paidmoney+"원");
					System.out.println("반환 금액\t\t\t"+(paidmoney-paidcost)+"원");
					System.out.println("=================================");
				}
				
			break;}
			
			
				
	
			default: //메인 메뉴에서는 5를 눌러야 종료가 된다고 적어놨지만, 1부터 4 외의 숫자는 쓰지 않으므로 그냥 이를 제외한 어떤 숫자를 눌러도 종료되게 만들었습니다.
				System.out.println("");
				System.out.println("즐거운 하루 되세요.");
				shopping=false;
				break;
			}
			
		}
		
	}

}
