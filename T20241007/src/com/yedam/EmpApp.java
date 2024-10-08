package com.yedam;

import java.util.List;
import java.util.Scanner;



public class EmpApp {
	static EmpDAO dao = new EmpDAO();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1. 등록 2. 목록 3. 수정 4. 삭제 5. 조회 6. 종료");
			System.out.println("--------------------------------------------------------------");
			System.out.println("선택 > ");
			int SelNo = Integer.parseInt(sc.nextLine());
			switch (SelNo) {
			case 1:
				System.out.println("사번입력 >>");
				String empNum = sc.nextLine();

				System.out.println("이름입력 >>");
				String empName = sc.nextLine();

				System.out.println("전화번호 입력 >>");
				String empTel = sc.nextLine();

				System.out.println("예시 yy/mm/dd의 형태로 입력");
				System.out.println("입사일 입력 >>");
				String hireDate = sc.nextLine();

				System.out.println("급여입력 >>");
				int salary = Integer.parseInt(sc.nextLine());

				dao.insert(empNum, empName, empTel, hireDate, salary);
				break;
				
			case 2:				
				dao.select();
				break;
				
			case 3:
				System.out.println("사번입력 >>");
				empNum = sc.nextLine();
				System.out.println("급여입력 >>");
				salary = Integer.parseInt(sc.nextLine());
				int rows = dao.update(empNum, salary);
				if(rows == 1) {
					System.out.println("수정되었습니다.");
				}else {
					System.out.println("수정이 되지 않았습니다.");
				}				
				break;
				
			case 4:				
				System.out.println("사번입력 >>");
				empNum = sc.nextLine();
				
				int row = dao.delete(empNum);
				if(row == 1) {
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("삭제이 되지 않았습니다.");
				}
				break;
				
			case 5:
				System.out.println("예시 yy/mm/dd의 형태로 입력");
				System.out.println("입사일 입력 >>");
				hireDate = sc.nextLine();
				List<Employee> emp = dao.select(hireDate);
				System.out.println("사번\t이름\t전화번호");
				for(Employee su1 : emp) {
					System.out.printf("%s\t%s\t%s ", su1.getMemberNum(), su1.getMemberName(), su1.getHdate().substring(0, 10));
					System.out.println();					
				}					
				break;
				
			case 6:
				run = false;				
				break;
				
			default : 
					System.out.println("메뉴를 다시 선택해주세요.");
					
			} // switch
			
		} // while
		sc.close();
	}//main
}//class
