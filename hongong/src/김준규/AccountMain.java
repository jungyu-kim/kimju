package 김준규;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[100];
		boolean run = true;
		Account ac = null;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 - 2. 계좌목록 - 3. 예금 - 4. 출금 - 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택>");
			int menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {
			case 1:
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");

				System.out.print("계좌번호:");
				String ano = sc.nextLine();

				System.out.print("계좌주:");
				String owner = sc.nextLine();

				System.out.print("초기입금액:");
				int balance = sc.nextInt();
				sc.nextLine();

				ac = new Account(ano, owner, balance);

				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						accounts[i] = ac;
						System.out.println("결과:계좌가 생성되었습니다.");
						break;
					}
				}

				break;
			case 2:
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");

				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						break;
					}
					System.out.println(accounts[i].getAno());
					System.out.println(accounts[i].getOwner());
					System.out.println(accounts[i].getBalence());

				}
				break;
			case 3:
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호:");
				String num = sc.nextLine();

				System.out.print("예금액:");
				int money = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						break;
					}
					if (accounts[i].getAno().equals(num)) {
						accounts[i].setBalence(accounts[i].getBalence() + money);
						System.out.println("예금이 성공되었습니다.");
					}
				}
				break;
			case 4:
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호:");
				num = sc.nextLine();

				System.out.print("출금액:");
				money = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						break;
					}
					if (accounts[i].getAno().equals(num)) {
						if (accounts[i].getBalence() >= money) {
							accounts[i].setBalence(accounts[i].getBalence() - money);
							System.out.println("출금이 성공되었습니다.");
						}else {
							System.out.println("출금 잔액이 부족합니다.");
						}
					}
				}
				break;
			case 5:
				run = false;
				System.out.println("종료");
				default:
				
				System.out.println("잘못입력. 다시선택.");
				break;
				
				
			}

		}

	}

}
