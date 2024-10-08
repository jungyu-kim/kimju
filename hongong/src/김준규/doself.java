package 김준규;

import java.util.Scanner;

public class doself {

	public static void main(String[] args) {
		// 1번
		//1. 년도입력
		//2. 윤년체크
		//   윤년은 4로 나누어 떨어짐 년도%4 == 0
		//   윤년은 100으로 나누어 떨어지지 않음 년도%100 != 0
		//   윤년은 400으로 나누어 떨어지면 년도%400 == 0
		//3. 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("##년도 입력:");
		int year = Integer.parseInt(sc.nextLine());
		if((year % 4 ==0 && year % 100 != 0) || year % 400 == 0){
			System.out.printf("%d 년은 윤년입니다.\n", year );
		}else {
			System.out.printf("%d 년은 평년입니다.\n", year );
		}
		
		//2번
		//1. 교환할 금액 입력
		//2. 교환할 금액을 500으로 나눈 몫이 500원짜리 동전개수
		//   교환금액을 500으로 나눈 나머지는 교환하고 남은 돈
		//3. 남은 금액을 100으로 나눈 몫이 100원짜리 동전개수
		//   교환금액을 100으로 나눈 나머지는 교환하고 남은 돈
		//4. 남은 금액을 50으로 나눈 몫이 50원짜리 동전개수
		//   교환금액을 50으로 나
		//5. 남은 금액을 10으로 나눈 몫이 10원짜리 동전개수
		
		
		System.out.print("##교환할 금액:");
		int money = Integer.parseInt(sc.nextLine());
		int rmoney = money;
		System.out.println("500원짜리 동전수 : " + (rmoney/500) + "개");
		rmoney = rmoney % 500;
		System.out.println(rmoney);
		System.out.println("100원짜리 동전수 : " + (rmoney/100) + "개");
		rmoney = rmoney % 100;
		System.out.println(rmoney);
		System.out.println("50원짜리 동전수 : " + (rmoney/50) + "개");
		rmoney = rmoney % 50;
		System.out.println(rmoney);
		System.out.println("10원짜리 동전수 : " + (rmoney/10) + "개");
		rmoney = rmoney % 10;
		System.out.println(rmoney);
		
		System.out.println("교환 금액 : " + (money-rmoney) + "원");
		System.out.println("남은 금액 : " + (money/rmoney % 10) + "원");
		
		//3번
		// 1. 1 ~ 100까지의 수를 발생
		// 2. 숫자입력
		int su1 = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for (int i=1; i<=100; i++);
		
		
		
	}//end main

}//end class
