package chap06;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		/*
		 * 1. 도서 객체 생성 class -책제목, 도서번호, 도서 가격 -외부에서 필드 접근을 막고, getter, setter 사용해서 접근
		 * 2. 도서관리 Main -메뉴 1. 도서수 입력 2. 도서 입력 3. 도서목록 조회 4. 도서분석 5. 종료 - 도서 수 만큼의 배열생성
		 * -> 도서 객체 저장 - 메뉴 항목 선택 1 => 도서 수 입력 2 => 도서 객체 생성 배열에 저장 3 => 도서 목록 출력 4 =>
		 * 도서 평균 가격, 최대 가격 출력 5 => 종료
		 */

		Scanner sc = new Scanner(System.in);
		Book[] books = null;
		boolean run = true;
		int bookCnt = 0;
		while (run) {
			// 메뉴만들기
			System.out.println("-----------------------------------------------------");
			System.out.println(" 1. 도서수 입력 2. 도서 입력 3. 도서목록 조회 4. 도서분석 5. 종료");
			System.out.println("----------------------------------------------------");
			// 메뉴 번호 선택하기
			System.out.println("메뉴선택> ");
			int menuNo = Integer.parseInt(sc.nextLine());

			// 메뉴 번호 따라 작업하기
			switch (menuNo) {
			case 1:
				System.out.println("도서수> ");
				int su1 = Integer.parseInt(sc.nextLine());
				books = new Book[su1];
				break;
			case 2:
				System.out.println("2. 도서 입력");
				int su2 = Integer.parseInt(sc.nextLine());
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}

	}

}
