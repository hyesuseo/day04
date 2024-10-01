package quiz1001;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class quiz07 {

	public static void main(String[] args) {
	
		Map<String, Integer> hashMap = new HashMap<>();
		Scanner sc=new Scanner (System.in);
		hashMap.put("샤넬", 5000);
		hashMap.put("디올", 3500);
		hashMap.put("랑콤", 3000);
		hashMap.put("르라보", 4000);
		 
		int 샤넬가격 = hashMap.get("샤넬");
		int 디올가격 = hashMap.get("디올");
		int 랑콤가격 = hashMap.get("랑콤");
		int 르라보가격 = hashMap.get("르라보");
		
		int choice, cha=0, di=0, lan=0, le=0, amount=0, money=0, monpocket=10000;
		int paidcha=0, paiddi=0, paidlan=0, paidle=0, monpaid=0, sumcost=(paidcha*5000 + paiddi*3500 + paidlan*3000 + paidle*4000);
		String goods=null, chanel, dior, lancom, lelabo;
		boolean cart = true;
		while (cart) {
			System.out.println("\t[향수전문점]");
			System.out.println("\t\t소지금 : "+ monpocket+"원");
			System.out.println("===========================");
			System.out.println("[1] 상품 목록");
			System.out.println("[2] 쇼핑 카트");
			System.out.println("[3] 계산");
			System.out.println("[4] 결제 내역");
			System.out.println("[5] 종료");
			System.out.print(">>>>>");
			choice= sc. nextInt();
				switch(choice) {
				case 1 :
					System.out.println("\t[상품 목록]");
					System.out.println("품목\t가격");
					System.out.println("================");
					System.out.println("[1]샤넬\t5000원");
					System.out.println("[2]디올\t3500원");
					System.out.println("[3]랑콤\t3000원");
					System.out.println("[4]르라보\t4000원");
					System.out.println("");
					System.out.println("[0]종료");
					System.out.println("");
					System.out.println("주문하실 번호 혹은 상품 이름을 입력해주세요.");
					System.out.print(">>>>");
					goods=sc.next();
					System.out.println("구매를 원하시는 수량을 입력해주세요");
					System.out.print(">>>>");
					amount=sc.nextInt();
					if (goods.equals("종료")||goods.equals("0")) {
						System.out.println("");
						System.out.println("");
						System.out.println("");
						System.out.println("");
					}
					while(true) {
						if(goods.equals("샤넬")||goods.equals("1")||goods.equals("디올")||goods.equals("2")||
								goods.equals("랑콤")|| goods.equals("3")|| goods.equals("르라보")|| goods.equals("4")){
							System.out.println("현재 "+goods+" "+amount+"개가 쇼핑카트에 있습니다");
							break;
					}
					else {System.err.println("상품을 다시 입력해주세요");
						System.err.print(">>>");}
					}
						
				case 2: 
					
						
					}
									
				}
			
			
		}
		
		
	}

}
}
