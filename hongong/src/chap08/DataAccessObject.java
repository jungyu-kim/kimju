package chap08;

public interface DataAccessObject {
	//상수
	//추상메소드
	void select(); //abstract 생략 why? 인터페이스이기때문에
	void insert();
	void update();
	void delete();
}
