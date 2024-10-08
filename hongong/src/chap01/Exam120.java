package chap01;

import java.util.Scanner;

public class Exam120 {

	public static void main(String[] args) {
		// 문제1 : 출력문 연습
		
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + age + "\n"); //이스케이프 문자도 문자열 
		System.out.printf("전화번호: %s- %s- %s",  tel1,tel2,tel3);
		
		// 문제2 :
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수:");
		
		String strNum1 = sc.nextLine();
		
		System.out.print("두 번째 수:");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
		
		
		// 문제3 :
		

	}

}
