package chap04;

import java.util.Scanner;

public class Exam182 {

	public static void main(String[] args) {
		//2번
	
		 

	  	//3번
		//4번
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				int result = 4 * x + 5 * y;
				if(result == 60) {
					System.out.printf("(%d,%d)",x,y);
				}
			}
		}
		
		//5번
		System.out.println();
		String stars = "";
		for(int i=1; i<5; i++) {
			stars += "*";
			System.out.println(stars);
		}
		
		//6번
		
		String stars1 = "";
		for(int i=1; i<5; i++) {
			stars1 += "*";
			System.out.printf("%4S\n",stars1);
		}
		
		//7번	

		
		boolean run =true;
		int balance =0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {                                               // while문은 true/false
			//메뉴
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1 : System.out.print("예금액>");
					balance += Integer.parseInt(sc.nextLine());					
					break;
					
			case 2 : System.out.print("출금액>");
					balance -= Integer.parseInt(sc.nextLine());
					break;		
		
			case 3 : System.out.println("잔고>");
					System.out.println(balance);
					 break;
//					 
			case 4 :
				run = false;
				break;
			}
			
				System.out.println("");
			}
		
		System.out.println("프로그램 종료");
		
}
}

		
		
		
		

