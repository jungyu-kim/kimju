package chap06;

public class MenberMain {
	public static void main(String[] args) {  //main ctrl + space 
		//객체 생성
		Member member = new Member(); //문자열 null(name), 정수 0(age)
		Member member2 = new Member("홍길동", "hong");
		
		System.out.println("이름 : " + member.name + "나이 : " + member.age);
		System.out.println("이름 : " + member2.name + "나이 : " + member2.id);
		
		//필드값 변경
		member.name = "최하연";
		member.age = 23;
		
		//필드 출력
		System.out.println("이름 : " + member.name + "나이 : " + member.age);
		
	}
}
