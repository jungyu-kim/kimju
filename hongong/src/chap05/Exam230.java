package chap05;

import java.util.Calendar;

public class Exam230 {

	public static void main(String[] args) {
		// 날짜와 시간 얻기
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; //month 0이 1월,  +1해야지 9월이됨
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK); // 1-일요일 7 -토요일
		
		Week weekday = null;
		switch(day) {
		case 1 : weekday = Week.일요일 ; break;
		case 2 : weekday = Week.월요일 ; break;
		case 3 : weekday = Week.화요일 ; break;
		case 4 : weekday = Week.수요일 ; break;
		case 5 : weekday = Week.목요일 ; break;
		case 6 : weekday = Week.금요일 ; break;
		case 7 : weekday = Week.토요일 ; break;
				
		default : System.out.println("오류");
		}
		
		System.out.printf("%d년 %d월 %d일 %s",year,month,date,weekday); //
	
		
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인 성공!!!");			
		}else if(result == LoginResult.FAIL_ID) {
			System.out.println("로그인 실패");
		}else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("패스워드 실패");
		}
	}

}
