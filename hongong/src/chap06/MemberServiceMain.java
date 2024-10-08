package chap06;

public class MemberServiceMain {

	public static void main(String[] args) {
		// 객체생성
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong","1234");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
				

	}

}
