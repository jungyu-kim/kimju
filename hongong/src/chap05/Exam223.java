package chap05;

import java.util.Scanner;

public class Exam223 {

	public static void main(String[] args) {
		// 확인문제 6번
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트| 4.분석 |5.종료");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1 : System.out.println("학생수>");
					 studentNum = Integer.parseInt(sc.nextLine());
					 scores = new int[studentNum];
					 break;
			case 2 : for(int i=0; i<scores.length; i++) {
						System.out.println("점수입력>");
						int nums = Integer.parseInt(sc.nextLine());
						scores[i] = nums;
					}
					 break;
			
			case 3: 
			
			case 4:
			
			
			
			}
			
		}

	}

}
